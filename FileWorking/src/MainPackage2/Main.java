package MainPackage2;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {

            }
    public static File Start(File file) throws Exception {
        if(file.exists()) {
            System.out.println("File/directory is exist");
            if (file.isFile()) {
                System.out.println("It's file");
            }
            if (file.isDirectory()) {
                System.out.println("It's directory");
            }
        }
        else{
            System.out.println("File/directory isn't exist");
            file.createNewFile();
            System.out.println("File/directory was created");
        }
        return file;
    }
}
//File - create files and directories
//FileWriter - write to the file
//FileReader - read from the file

/*int n = 30;
        File file = new File("temp.txt");
        file = Start(file);

        FileWriter writer = new FileWriter(file);
        writer.write("1, 2, 3, 4, 5.");
        writer.flush();
        writer.close();

        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = ' ';
        }

        FileReader reader = new FileReader(file);
        reader.read(arr);

        System.out.println(arr);*/

/*int n = 30;
        File file = new File("temp.txt");
        file = Start(file);

        FileWriter writer = new FileWriter(file);
        BufferedWriter b_writer = new BufferedWriter(writer);
        b_writer.write("1 2 3");
        b_writer.newLine();
        b_writer.write("4 5 6");
        b_writer.newLine();
        b_writer.write("7 8 9");
        b_writer.flush();
        b_writer.close();

        FileReader reader = new FileReader(file);
        BufferedReader b_reader = new BufferedReader(reader);
        while(b_reader.ready()){
            System.out.println(b_reader.readLine());
        }*/