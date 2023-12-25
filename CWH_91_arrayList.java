import java.util.ArrayList;

public class CWH_91_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);  
        for (Integer idx : l1) {
            System.out.print(idx);
            System.out.print(" ");
        }
        System.out.println(l1.contains(2));
        System.out.println(l1.indexOf(1));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(5));
    }
}
