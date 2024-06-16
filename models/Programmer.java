package models;

public class Programmer extends Employee {
    private String employeeId;
    private String programmingLanguage;
    private int experience;
    private double allowance;
    private static int progCount = 1;

    public Programmer(){

    }

    public Programmer(String name, String address, int age, String jobDesc, String placement, String programmingLanguage, int experience){
        super(name, address, age, jobDesc, placement);
        if (progCount < 10){
            this.employeeId = "Prog-00" + progCount;
        }
        else if (progCount >= 10 && progCount < 100){
            this.employeeId = "Prog-0" + progCount;
        }
        else {
            this.employeeId = "Prog-" + progCount;
        }
        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
        calculateSalary();
        calculateAllowance();
        progCount++;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Programmer [employeeId=" + employeeId + ", programmingLanguage=" + programmingLanguage + ", experience="
                + experience + ", allowance=" + allowance + ", name=" + getName() + ", address="
                + getAddress() + ", age=" + getAge() + ", salary=" + getSalary() + ", jobDesc="
                + getJobDesc() + ", placement=" + getPlacement() + "]";
    }

    @Override
    public void calculateSalary() {
        for (int i = 0; i < placementCity.length; i++){
            if (getPlacement().equalsIgnoreCase(placementCity[i])){
                setSalary(PROGRAMMER_SALARY_PERCENTAGE * umk[i]);
                break;
            }
        }
    }

    @Override
    public void calculateAllowance(){
        if (experience > 4){
            allowance = getSalary() * PROGRAMMER_ALLOWANCE_EXPERIENCED;
        }
        else {
            allowance = getSalary() * PROGRAMMER_ALLOWANCE_UNEXPERIENCED;
        }
    }
    
}
