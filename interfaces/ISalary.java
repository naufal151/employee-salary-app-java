package interfaces;

public interface ISalary {
    String[] placementCity = {"Garut", "Bandung", "Jakarta", "Bekasi", "Bogor"};
    double[] umk = {1961085, 3742276, 4453935, 4782935,4330249};
    double PROGRAMMER_SALARY_PERCENTAGE = 1.5;
    double PROJECTLEADER_SALARY_PERCENTAGE = 2;
    double ANALYST_SALARY_PERCENTAGE = 1.6;
    double PROGRAMMER_ALLOWANCE_EXPERIENCED = 0.2;
    double PROGRAMMER_ALLOWANCE_UNEXPERIENCED = 0.1;
    double PROJECTLEADER_ALLOWANCE_MANYPROJECTS = 0.15;
    double PROJECTLEADER_ALLOWANCE_LESSPROJECTS = 0.05;
    double ANALYST_ALLOWANCE = 0.05;

    public void calculateSalary();
    public void calculateAllowance();
}
