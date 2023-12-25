import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class myDeprecatedClass {
    @Deprecated
    public void meth1() {
        System.out.println("I am inside method 1 of deprecated class");
    }
}

interface myInterface {
    void display();
}


public class CWH_112_ps {
    public static void main(String[] args) {
        // myDeprecatedClass obj = new myDeprecatedClass();
        // obj.meth1();
        // myInterface interf = new myInterface() {
        //     @Override
        //     public void display() {
        //         System.out.println("I am inside interface");
        //     }
        // };

        // myInterface interf = () -> System.out.println("I am inside Lambda function interface");
        // interf.display();

        //Create a table and write it into a file

        File tbleFile = new File("CWH_112_ps_multiplication_table.txt");
        //creating file
        try {
            tbleFile.createNewFile();
            System.out.println("File created successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Some error while creating while file");
        }
        String table = "";
        System.out.println("Enter number you want a table for: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //writing table to a file
        try {
            FileWriter fw = new FileWriter("CWH_112_ps_multiplication_table.txt");
            for(int i=1;i<=10;i++) {
                table = num + " X " + i + " == " + (num*i); 
                table += "\n";
                fw.write(table);
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Some error occured while creating table");
        }

        //reading from a file
        try {
            Scanner scl = new Scanner(tbleFile);
            while (scl.hasNextLine()) {
                String line = scl.nextLine();
                System.out.println(line);
            }
            scl.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
