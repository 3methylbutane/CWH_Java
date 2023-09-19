public class CWH_33_varArgs {
    // static int sum (int a, int b) {
    //     return a+b;
    // }
    // static int sum (int a, int b, int c) {
    //     return a+b+c;
    // }
    // static int sum (int a, int b, int c, int d) {
    //     return a+b+c+d;
    // }
    //We don't want to create many methods for increasing arguments, for this we will use VarArgs

    static int sum (int ...arr) {
        //It puts all the elements in an array
        // (int ...arr) == int [] arr
        int result = 0;
        for (int i:arr) {
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 1 and 2 is : " + sum (1,2));
        System.out.println("Sum of 1, 2 and 3 is : " + sum (1,2,3));
        System.out.println("Sum of 1, 2, 3 and 4 is : " + sum (1,2,3,4));
        System.out.println("Sum of 1, 2, 3, 4 and 5 is : " + sum (1,2,3,4,5));
    }
}
