package MainPackage;
public class Main {
    public static void main(String[] args) {
        
    }
    public static void line(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
/*int i = 1;
        stack a = new stack(5);

        while(!a.is_full()){
            a.add(i);
            i++;
        }

        while(!a.is_empty()){
            System.out.println(a.subtract());
        }*/
/* extends - наследование
   super - наследуемые поля/методы
   abstract - Абстрактные класс/метод
   static - использование полей/методов без создания объекта
   final - константа/класс без наследников/метод без переопределения
   interface - интерфейс, implements - реализация интерфейса
   @Override - перегрузка метода интерфейса в классе
   enum - перечисление
   */



/*  import java.util.Scanner;

    Scanner scan = new Scanner(System.in);
    String num = scan.nextLine();   */

/*  String a = " ";
    int b = 0;
    float c = 0f;

    System.out.print("Enter line:");
    a = scan.nextLine();
    System.out.print("Enter int number:");
    b = scan.nextInt();
    System.out.print("Enter float number:");
    c = scan.nextFloat();
    System.out.println();
    System.out.println("Entered line is: " + a);
    System.out.println("Entered int is: " + b);
    System.out.println("Entered float is: " + c);   */

/*  float a = 0f;
    float b = 0f;
    System.out.print("Enter the first number: ");
    a = scan.nextFloat();
    System.out.print("Enter the second number: ");
    b = scan.nextFloat();
    System.out.println();
    System.out.println("Sum is: " + (a + b));
    System.out.println("Difference is: " + (a - b));
    System.out.println("Multiplication is: " + (a * b));
    System.out.println("Average is: " + ((a + b) / 2));   */

/*  int a;
    System.out.print("Enter a number (4): ");
    a = scan.nextInt();
    System.out.println();

    System.out.print(a%10);
    a/=10;
    System.out.print(a%10);
    a/=10;
    System.out.print(a%10);
    a/=10;
    System.out.print(a%10);   */

/*  int a;
        while(true) {
            System.out.print("Enter a number of your finger: ");
            a = scan.nextInt();

            if (a > 0 && a < 6) {
                if (a == 1) {
                    System.out.print("It's a Thumb");
                }
                if (a == 2) {
                    System.out.print("It's a Forefinger");
                }
                if (a == 3) {
                    System.out.print("It's a Middle finger");
                }
                if (a == 4) {
                    System.out.print("It's a Ring finger");
                }
                if (a == 5) {
                    System.out.print("It's a Little finger");
                }
                break;
            }
            else {
                System.out.println("It's a wrong number, try again");
            }
        }   */
/*      int a, b, res;
        System.out.print("Enter the first number: ");
        a = scan.nextInt();
        System.out.print("Enter the second number: ");
        b = scan.nextInt();

        System.out.println();

        System.out.print("Enter result of multiplying: ");
        res = scan.nextInt();
        if(res == a * b){
            System.out.print("Yeah, it's it!");
        }
        else{
            System.out.print("Wrong( the correct answer is: " + (a * b));
        }   */

/*      int a;
        System.out.print("Enter a number of day: ");
        a = scan.nextInt();

        switch(a){
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday"); break;
            case 7: System.out.print("Sunday"); break;
            default: System.out.print("Wrong number"); break;
        }   */

/*      String station;
        System.out.print("Enter letter of station: ");
        station = scan.nextLine();

        switch(station){
            case "a": System.out.print("16 km"); break;
            case "A": System.out.print("16 km"); break;
            case "b": System.out.print("32 km"); break;
            case "B": System.out.print("32 km"); break;
            case "c": System.out.print("48 km"); break;
            case "C": System.out.print("48 km"); break;
            case "d": System.out.print("64 km"); break;
            case "D": System.out.print("64 km"); break;
            default: System.out.print("Wrong station"); break;
        }   */

/*      int a;
        int answer;
        System.out.print("Enter a number: ");
        a = scan.nextInt();

        while (true) {
            a *= a;
            System.out.println("Result is: " + a);
            System.out.print("Write 1 to continue: ");
            answer = scan.nextInt();
            if (answer == 1) {}
            else {
                break;
            }

        }   */
/*      int n, min = 999, max = 0, sum = 0, age;
        float res;

        System.out.print("Enter number of users today: ");
        n = scan.nextInt();

        System.out.println();

        for(int i = 0; i < n; i++){
        System.out.print("Enter age of client number " + (i + 1) + ": ");
        age = scan.nextInt();
        sum += age;
        if(age>max) {max = age;}
        if(age<min) {min = age;}
        }
        res = (sum / n);
        System.out.println("Max age is: " + max);
        System.out.println("Min age is: " + min);
        System.out.println("Average age is: " + res);   */

/*       int n, temp;
         System.out.print("Enter n of boxes: ");
         n = scan.nextInt();

         int i = 1;

         while(true){
             System.out.print("How much boxes add to car: ");
             temp = scan.nextInt();
             if(temp > n){
                 System.out.println("There are " + n + " boxes left, wrong number, try again");
             }
             else if(temp == n){
                 n -= temp;
                 System.out.print("There are 0 boxes left, thx for your work, gl");
                 break;
             }
             else {
                 n-=temp;
                 System.out.println("There are " + n + " boxes left");
             }
         }   */

/*      int n = 1;
        while(n != 0){
            System.out.print("Enter a number: ");
            n = scan.nextInt();
        }
        if(n == 0){
            System.out.print("Thx, gl))");
        }   */

/*      int first, second, sum = 0;
        System.out.print("Enter the first number: ");
        first = scan.nextInt();
        System.out.print("Enter the second number: ");
        second = scan.nextInt();

        while(first != second + 1){
            if(first % 2 != 0){
                sum+=first;
            }
            first += 1;
        }
        System.out.print("Sum = " + sum);   */

/*      int height;

        System.out.print("Enter n: ");
        height = scan.nextInt();

        for (int i = 0; i < height; i++)
        {
            for (int j = 1; j < height - i; j++)
            {
                System.out.print(' ');
            }

            for (int j = height - 2 * i; j <= height; j++)
            {
                System.out.print('^');
            }
            System.out.println();   */

/*      int n = 10;
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
        arr[i] = (int)(Math.random() * 10 + 1);
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }   */

/*      int n = 10;
        int [][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }   */

/*      public static void main(String[] args) {
        int n = 5;
        int max = 0, min = 999;
        int [][] arr = new int [n][n];
        Fill(arr, n);
        Print(arr, n);
        Find_min(arr, n, min);
        Find_max(arr, n, max);
    }
    public static void Fill(int [][] array, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = (int)(Math.random() * 10);
            }
        }
    }
    public static void Print(int [][] array, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Find_min(int [][] array, int n, int min){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(min > array[i][j]){min = array[i][j];}
            }
        }
        System.out.println("Min is: " + min);
    }
    public static void Find_max(int [][] array, int n, int max){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(max < array[i][j]){max = array[i][j];}
            }
        }
        System.out.println("Max is: " + max);
    }   */

/*      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter number of array number 1: ");
        n1 = scan.nextInt();
        System.out.print("Enter number of array number 2: ");
        n2 = scan.nextInt();

        System.out.println();

        int [] array1 = new int [n1];
        int [] array2 = new int [n2];

        Arr(array1, n1, 1);
        Arr(array2, n2, 2);
    }
    public static void Arr(int[]arr, int n, int num) {

        for(int i = 0; i < n; i++){
            arr[i]=(int)(Math.random() * 5 + 1);
        }

        System.out.println();

        System.out.println("Array number " + num + " is: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }   */

/*  public class Tiles

    private String name;
    private int size_h;
    private int size_w;
    private float prise;

    void SetName (String name1) {
        name = name1;
    }
    void SetSize_h(int size) {
        size_h = size;
    }
    void SetSize_w(int size) {
        size_w = size;
    }
    void SetPrise(float prise1) {
        prise = prise1;
    }

    void GetData() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Name: " + name);
        System.out.println("Size_h: " + size_h);
        System.out.println("Size_w: " + size_w);
        System.out.println("Prise: " + prise);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");

}   */

/*
package MainPackage;

public class People {
    public String name;
    public String surname;
    public String lastname;
    public int age;
    public float height;
    public float weight;
    public char sex;

    People(){
        name = "Sergey";
        surname = "Kalnoy";
        lastname = "Andreevich";
        age = 19;
        height = 175.5f;
        weight = 69.5f;
        sex = 'm';
    }
    People(People other){
        name = other.name;
        surname = other.surname;
        lastname = other.lastname;
        age = other.age;
        height = other.height;
        weight = other.weight;
        sex = other.sex;
    }
    People(String name1, String surname1, String lastname1){
        name = name1;
        surname = surname1;
        lastname = lastname1;
    }
    public void PrintData(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\tName: " + name);
        System.out.println("\tSurname: " + surname);
        System.out.println("\tLastname: " + lastname);
        System.out.println("\tAge: " + age);
        System.out.println("\tHeight: " + height);
        System.out.println("\tWeight: " + weight);
        System.out.println("\tSex: " + sex);
    }
}

package MainPackage;

public class Student extends People{
    public String group;
    public int course;

    public Student() {
        group = "KNT-20-2";
        course = 2;
    }
    Student(Student other){
        name = other.name;
        surname = other.surname;
        lastname = other.lastname;
        age = other.age;
        height = other.height;
        weight = other.weight;
        sex = other.sex;
        group = other.group;
        course = other.course;
    }
    Student(String name1, String surname1, String lastname1, String group1, int course1) {
        super(name1, surname1, lastname1);
        group = group1;
        course = course1;
    }
    public void PrintData() {
        super.PrintData();
        System.out.println("\tGroup: " + group);
        System.out.println("\tCourse: " + course);
    }*/

/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstGui extends JFrame{
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input");

    private JRadioButton r_button1 = new JRadioButton("Select this");
    private JRadioButton r_button2 = new JRadioButton("Select that");

    private JCheckBox check = new JCheckBox("Check", false);

    public FirstGui() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout( 3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(r_button1);
        group.add(r_button2);

        container.add(r_button1);
        r_button1.setSelected(true);
        container.add(r_button2);

        container.add(check);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (r_button1.isSelected() ? "r_button1" : "r_button2" + "is selected " + "\n");
            message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked" + "\n");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
   */