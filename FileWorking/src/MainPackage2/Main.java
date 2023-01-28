package MainPackage2;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        int n = 30;
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

        System.out.println(arr);
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