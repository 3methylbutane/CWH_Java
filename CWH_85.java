public class CWH_85 {
    public static int greet() {
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up!!!");
        }
        return -1;
    }
    public static void main(String[] args) {
        //greet();
        int a = 8;
        int b = 9;
        while (true) {
            try {
                System.out.println(a/b);
            } 
            catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally and value of b = " + b);
            }
            b--;
        }
    
    }
}
