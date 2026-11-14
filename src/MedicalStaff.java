public abstract class MedicalStaff {
    private String employeeId;
    private String department;
    private int workingHours;

    public MedicalStaff(String employeeId, String department, int workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public String getDepartment() {
        return department;
    }
    public int getWorkingHours() {
        return workingHours;
    }

    public void displayDetails(){
        System.out.println("ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Working hours: " + workingHours);
    }

    public abstract void performPatientCare();
}
