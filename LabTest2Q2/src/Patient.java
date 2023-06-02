public class Patient extends Person {

    private String patientID;
    private HealthInfo healthInfo;


    public Patient(String patientID,String firstName, String lastName, String gender, Address address, int height, int weight) {
        super(firstName, lastName, gender, address);
        this.patientID = patientID;
        this.healthInfo = new HealthInfo(height, weight);
    }


    public String getPatientID() {
        return patientID;
    }

    public int getWeight() {
        return healthInfo.getWeight();
    }
    
    public int getHeight() {
        return healthInfo.getHeight();
    }

    public double getBMI() { 
        return healthInfo.getBMI();
    }

    
    
}
