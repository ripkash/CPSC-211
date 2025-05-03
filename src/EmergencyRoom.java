import javax.swing.*;
import java.io.*;
import java.util.*;

public class EmergencyRoom {
    private static Map<String, Equipment> equipmentMap = new HashMap<>();
    private static Queue<Patient> patientQueue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        File file = chooseFile();
        if (file == null) return;

        loadFile(file);

        int[] doctorCounts = {1, 2, 4, 8};

        for (int count : doctorCounts) {
            System.out.println("\nRunning simulation with " + count + " doctors...");
            runSimulation(count);
        }
    }

    private static File chooseFile() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        return (result == JFileChooser.APPROVE_OPTION) ? chooser.getSelectedFile() : null;
    }

    private static void loadFile(File file) throws IOException {
        equipmentMap.clear();
        patientQueue.clear();

        try (Scanner scanner = new Scanner(file)) {
            int numEquipment = Integer.parseInt(scanner.nextLine().trim());
            for (int i = 0; i < numEquipment; i++) {
                String[] parts = scanner.nextLine().trim().split(" ");
                String name = parts[0];
                int quantity = Integer.parseInt(parts[1]);
                equipmentMap.put(name, new Equipment(name, quantity));
            }

            int numPatients = Integer.parseInt(scanner.nextLine().trim());
            for (int i = 0; i < numPatients; i++) {
                int treatmentTime = Integer.parseInt(scanner.nextLine().trim());
                List<String> equipmentList = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));
                patientQueue.add(new Patient(treatmentTime, equipmentList));
            }
        }
    }

    private static void runSimulation(int doctorCount) throws InterruptedException {
       
        Queue<Patient> patients = new LinkedList<>(patientQueue);
        Map<String, Equipment> equipment = new HashMap<>();
        for (Map.Entry<String, Equipment> entry : equipmentMap.entrySet()) {
            Equipment e = new Equipment(entry.getKey(), entry.getValue().quantity.availablePermits());
            equipment.put(entry.getKey(), e);
        }

        List<Thread> threads = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < doctorCount; i++) {
            Thread t = new Thread(new Doctor(patients, equipment));
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total treatment time: " + (endTime - startTime) + " ms");
    }
}
