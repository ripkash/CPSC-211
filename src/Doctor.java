import java.util.*;

public class Doctor implements Runnable {
    private final Queue<Patient> patientQueue;
    private final Map<String, Equipment> equipmentMap;

    public Doctor(Queue<Patient> patientQueue, Map<String, Equipment> equipmentMap) {
        this.patientQueue = patientQueue;
        this.equipmentMap = equipmentMap;
    }

    @Override
    public void run() {
        while (true) {
            Patient patient;

            synchronized (patientQueue) {
                if (patientQueue.isEmpty()) {
                    return;
                }
                patient = patientQueue.poll();
            }

            List<Equipment> reservedEquipment = new ArrayList<>();
            try {
               
                List<String> sortedEquipment = new ArrayList<>(patient.getRequiredEquipment());
                Collections.sort(sortedEquipment);
                for (String name : sortedEquipment) {
                    Equipment e = equipmentMap.get(name);
                    e.acquire();
                    reservedEquipment.add(e);
                }

                long start = System.currentTimeMillis();
                while (System.currentTimeMillis() - start < patient.getTreatmentTime()) {
                    Thread.sleep(10);
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                for (Equipment e : reservedEquipment) {
                    e.release();
                }
            }
        }
    }
}
