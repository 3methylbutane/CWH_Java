class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name=n;
    }
}

public class CWH_39_1 {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.salary=30000;
        e1.name="Employee 1";

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        e1.setName("Employee 2");
        System.out.println(e1.getName());
    }
}
