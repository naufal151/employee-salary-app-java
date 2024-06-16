package repository;

import java.util.ArrayList;
import java.util.List;

import models.Analyst;
import models.Employee;
import models.Programmer;
import models.ProjectLeader;

public class RepositoryEmployee {
    public static List<Employee> getAllEmployee(){
        Employee employee1 = new Employee("Susi", "Bandung", 27, "Admin", "Jakarta", true);
        Employee employee2 = new Employee("Anto", "Bandung", 35, "Office Boy", "Bandung", true);
        Employee employee3 = new Employee("Riman", "Jakarta", 28, "Human Resource Dev", "Bandung", true);
        Employee programmer1 = new Programmer("Budi", "Bandung", 25, "Back End Dev", "Jakarta", "Java", 2);
        Employee programmer2 = new Programmer("Ani", "Bandung", 30, "Front End Dev", "Bandung", "React Js", 6);
        Employee programmer3 = new Programmer("Ujang", "Jakarta", 28, "Full Stack Dev", "Bandung", "Kotlin", 4);
        Employee pl1 = new ProjectLeader("Ahmad", "Bandung", 25, "Project Leader", "Garut", 2);
        Employee pl2 = new ProjectLeader("Dani", "Bandung", 30, "Scrum Master", "Bekasi", 1);
        Employee pl3 = new ProjectLeader("Cecep", "Jakarta", 28, "Project Owner", "Bogor", 4);
        Employee al1 = new Analyst("Indah", "Garut", 25, "Analyst", "Jakarta");
        Employee al2 = new Analyst("Puspa", "Bandung", 30, "Analyst", "Bekasi");
        Employee al3 = new Analyst("Sari", "Jakarta", 28, "Analyst", "Bogor");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(programmer1);
        employeeList.add(programmer2);
        employeeList.add(programmer3);
        employeeList.add(pl1);
        employeeList.add(pl2);
        employeeList.add(pl3);
        employeeList.add(al1);
        employeeList.add(al2);
        employeeList.add(al3);

        return employeeList;
    }
}
