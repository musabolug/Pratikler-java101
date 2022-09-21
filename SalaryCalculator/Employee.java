package SalaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (salary<1000){
            return 0.0;
        }
        else{
            return (salary/100)*3;
        }
    }
    int bonus(){
        int extraHour;
        if (workHours>40){
            extraHour = workHours-40;
            return (extraHour*30);
        }
        return 0;
    }
     int raiseSalary(){
        int thisYear = 2022;
        int workYear = thisYear-hireYear;
        int salaryRaise = 0;
        if (workYear < 10){
            return (salaryRaise =((salary/100)*5));
        } else if (workYear > 9) {
             return (salaryRaise =((salary/100)*10));
        }
        else{
            return (salaryRaise +((salary/100)*15));
        }
    }
    double netSalary(){
        double netSalary = totalSalary()-tax();
        return netSalary;
    }
    double subSalary(){
        double subSalary =  (this.salary + bonus()) - tax();
        return subSalary;
    }
    double totalSalary(){
        double totalSalary = this.salary + raiseSalary();
        return totalSalary;
    }
    public String info(){
        return "Name: " + this.name + "\nSalary: " + this.salary + "\nHours of Work: " + this.workHours
                + "\nHire Year: " + this.hireYear + "\nTax :" +tax() + "\nBonus :" + bonus() + "\nSalary Raise :"
                + raiseSalary() +"\nSalary with Tax and Bonus :" + subSalary() + "\nTotal Salary :" + totalSalary();
    }



}
