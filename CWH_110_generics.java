import java.util.ArrayList;

class MyGeneric<T1,T2> {
    int val;
    T1 t1;
    T2 t2;
    
    MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    
}

public class CWH_110_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //arrayList.add("qwerty");
        arrayList.add(23);
        arrayList.add(48);

        int a = arrayList.get(1);
        System.out.println(a);

        MyGeneric<String, Integer> mg = new MyGeneric(a, "sdf", 467);
        System.out.println(mg.getT2());

    }
}
