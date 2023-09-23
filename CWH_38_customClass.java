class Employee{
    int id;
    String name;
    int salary;

    public void getDetails() {
        System.out.println("Id is " + id);
        System.out.println("Name is " + name);
    }
    public void getSalary() {
        System.out.println("Salary is " + salary);
    }
}

public class CWH_38_customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee e1 = new Employee();
        e1.id=10;
        e1.name="Employee1";
        e1.salary=23000;

        Employee e2 = new Employee();
        e2.id=11;
        e2.name="Employee2";
        e2.salary=25000;

        e1.getDetails();
        e2.getDetails();
        e1.getSalary();
        e2.getSalary();

    }
}
