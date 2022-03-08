public class Employee {
    String name;
    int hireYear;
    double salary, workHours;

    public Employee(String name, int hireYear, double salary, double workHours){
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.name = name;

    }

    public double tax(){
        if(this.salary>1000){
            return this.salary * 0.03;
        }
        else{
            return 0;
        }
    }

    public double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        else{
            return 0;
        }
    }

    public double raiseSalary(){
        if(this.hireYear-2021<10){
            return this.salary * 0.05;
        }else if(this.hireYear-2021>9 && this.hireYear-2021<20){
            return this.salary * 0.10;
        }else{
            return this.salary * 0.15;
        }
    }

    void Data(){
        System.out.println("=====================================");
        System.out.println("Name:"+this.name);
        System.out.println("Salary:"+this.salary);
        System.out.println("workHours:"+this.workHours);
        System.out.println("hireYear:"+this.hireYear);
        System.out.println("Tax:"+this.tax());
        System.out.println("Bonus:"+this.bonus());
        System.out.println("Raise Salary:"+this.raiseSalary());
        System.out.println("Tax ve Bonus dahil Salary:"+(this.salary+this.bonus()-this.tax()));
        System.out.println("Total Salary:"+(salary+raiseSalary()));
        System.out.println("=====================================");



    }


}
