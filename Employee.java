public class Employee {
    String name;
    int id;
    int salary;
    String company;

    Employee(String myName, int myId, int mySalary, String myCompany){
        this.name = myName;
        this.id = myId;
        this.salary = mySalary;
        this.company = myCompany;
    }

    String getDetails(){
        return "Name: " + name + "\n" + "ID: " + id + "\n" + "Salary: " + salary + "\n" + "Company: " + company + "\n";
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Manisangh", 121, 9999999, "Microsoft");
        Employee emp2 = new Employee("Radhika", 122, 99999990, "Google");
        Employee emp3 = new Employee("Megha", 123, 988688, "Walmart");

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
        System.out.println(emp3.getDetails());
    }
}
