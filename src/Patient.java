import java.util.List;

public class Patient {
    private final int treatmentTime; 
    private final List<String> requiredEquipment;

    public Patient(int treatmentTime, List<String> requiredEquipment) {
        this.treatmentTime = treatmentTime;
        this.requiredEquipment = requiredEquipment;
    }

    public int getTreatmentTime() {
        return treatmentTime;
    }

    public List<String> getRequiredEquipment() {
        return requiredEquipment;
    }
}
