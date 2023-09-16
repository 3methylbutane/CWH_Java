//WAP to find type of website
//.com -> commercial website
//.org -> organization website
//.in -> indian website

import java.util.Scanner;

public class CWH_19_6 {
    public static void main(String[] args) {
        System.out.println("Enter website URL: ");
        Scanner sc = new Scanner(System.in);
        String URL = sc.nextLine();
        if(URL.endsWith(".com")) {
            System.out.println("It is a commercial website");
        }
        else if (URL.endsWith(".org")) {
            System.out.println("It is an organizational website");
        }
        else if (URL.endsWith(".in")) {
            System.out.println("It is an Indian website");
        }

    }    
}
