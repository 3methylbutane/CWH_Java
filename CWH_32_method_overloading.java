public class CWH_32_method_overloading {

    static void callMethod() {
        System.out.println("Hello");
    }
    static void callMethod(int a) {
        System.out.println("Hello " + a);
    }
    static void change1(int a) {
        a=98;
    }
    static void change2(int arr[]) {
        arr[0]=98;
    }
    static void tellJoke() {
        System.out.println("Here is a Joke!");
    }

    public static void main(String[] args) {
        tellJoke();

        //Case 1: Tryimg to change a number
        int a = 45; //it passes the object's copy
        change1(a);
        System.out.println(a);

        //Case 2: Trying to change array
        int [] arr = {45,23,67,54,99}; //it passes the reference 
        change2(arr);
        System.out.println(arr[0]);
    
        //Method overloading
        callMethod();
        callMethod(3000);
    }
}
