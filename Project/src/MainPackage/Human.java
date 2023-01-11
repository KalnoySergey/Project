package MainPackage;
import java.util.Objects;
public class Human {
    int height = 0;
    int weight = 0;
    int age = 0;

    Human(){
        System.out.println("Human was created");
    }
    void Get(){
        System.out.println("Height = " + height);
        System.out.println("Weight = " + weight);
        System.out.println("Age = " + age);
    }
    void Set(int a, int b, int c){
        height = a;
        weight = b;
        age = c;
    }
    void DelHuman(){
        System.out.println("Human was deleted");
    }
}
