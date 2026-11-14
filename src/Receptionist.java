public class Receptionist extends MedicalStaff {

    public Receptionist(String id, String dept, int hours) {
        super(id, dept, hours);
    }

    @Override
    public void performPatientCare() {
        System.out.println("Receptionist registers patients and manages appointments");
    }
}