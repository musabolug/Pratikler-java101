package SalaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your Name :");
        String name = scn.nextLine();
        System.out.print("Please enter your Salary :");
        int salary = scn.nextInt();
        System.out.print("Please enter your Work Hours :");
        int workHours = scn.nextInt();
        System.out.print("Please enter your Hire Year :");
        int hireYear = scn.nextInt();


            Employee employee = new Employee(name, salary, workHours, hireYear);
            System.out.print(employee.info());

    }
}
