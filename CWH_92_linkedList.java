import java.util.LinkedList;

public class CWH_92_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        LinkedList<Integer> llcomb = new LinkedList<>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);
        ll2.add(34);
        ll2.add(560);
        ll2.add(532);
        for (Integer idx1 : ll1) {
            System.out.print(idx1 + ", ");
        }
        System.out.println();
        for (Integer idx2 : ll2) {
            System.out.print(idx2 + ", ");
        }
        System.out.println();
        llcomb.addAll(ll1);
        llcomb.addAll(ll2);
        System.out.println("After combining");
        for (Integer idxc : llcomb) {
            System.out.print(idxc + ", ");
        }
        System.out.println();
        llcomb.addLast(999);
        for (Integer idxc : llcomb) {
            System.out.print(idxc + ", ");
        }
    }
    
}
