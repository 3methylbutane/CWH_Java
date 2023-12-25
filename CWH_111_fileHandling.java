import java.io.File;

public class CWH_111_fileHandling {
    public static void main(String[] args) {

        //Creating a file
        File myFile = new File("CWH_111_testFile.txt");
        // try {
        //     myFile.createNewFile();
        //     System.out.println("File created successfully");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        //Writing to a file
        // try {
        //     FileWriter fw = new FileWriter("CWH_111_testFile.txt");
        //     fw.write("Sample message to insert to file\n");
        //     fw.write("This is a random sentence");
        //     fw.close();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        //Reading a file
        // try {
        //     Scanner sc = new Scanner(myFile);
        //     while (sc.hasNextLine()) {
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        //Deleting a file
        if(myFile.delete()) {
            System.out.println("File " + myFile.getName() + " deleted successfully");
        }
        else {
            System.out.println("Some error occured while deleting!");
        }
    }
}
