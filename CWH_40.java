class myEmployee {
    int id;
    String name;
    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
}

public class CWH_40 {
    public static void main(String[] args) {
        myEmployee e1 = new myEmployee();
        e1.setId(23);
        e1.setName("Employee No. 1");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
