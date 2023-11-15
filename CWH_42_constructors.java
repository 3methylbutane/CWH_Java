class myEmployee{
    private int id;
    private String name;
    private int salary;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //We can create constructor with as same name as class name
    //it has no return type
    //Constructor can also be overloaded
    public myEmployee() {
        id = 1;
        name = "DefaultName";
    }
    public myEmployee(int myId, String myName) {
        id = myId;
        name = myName;
    }
    public myEmployee(int myId) {
        id = myId;
        name = "Name 2";
        salary = 10000;
    }
}


public class CWH_42_constructors {
    public static void main(String[] args) {
        //instead of using setters everytime when we want to instantiate a new object -
        //we can use constructor
        myEmployee e1 = new myEmployee(1, "Name");
        // e1.setId(2);
        // e1.setName("Name2");
        System.out.println(e1.getId());
        System.out.println(e1.getName());

        myEmployee e2 = new myEmployee(2);
        System.out.println(e2.getId());
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());

        myEmployee e3 = new myEmployee();
        System.out.println(e3.getId());
        System.out.println(e3.getName());
    }
}
