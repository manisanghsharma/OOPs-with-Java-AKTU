class Emp {
    int emp_id;
    String name;
    double salary;
    Emp(int emp_id, String name, double salary){
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }
    String getDetails(){
        return "Name: " + name + "\n" + "ID: " + emp_id + "\n" + "Salary: " + salary;
    }

}

class Manager extends Emp {
    String department;
    Manager(int emp_id, String name, double salary, String department){
        super(emp_id, name, salary);
        this.department = department;
    }
    String getDetails(){
        return super.getDetails() + "Department: " + department;
    }
}



//super constructor calling should be the first thing to call

//super constructor should be invoked inside the subclass constructor


