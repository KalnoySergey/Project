package MainPackage.World;
public class Car {
    private String name; //mark
    private String codename; //model
    private int year; //year of developed
    private boolean type; // mechanic/auto
    private float prise; //price
    private int hp; //horsepower

    public void SetName(String name){
        this.name=name;
    }
    public void SetCodename(String codename){
        this.codename=name;
    }
    public void SetYear(int year){
        this.year=year;
    }
    public void SetType(boolean type){
        this.type=type;
    }
    public void SetPrise(Float prise){
        this.prise=prise;
    }
    public void SetHp(int hp){
        this.hp=hp;
    }

    public String GetName(){
        return this.name;
    }
    public String GetCodename(){
        return this.codename;
    }
    public int GetYear(){
        return this.year;
    }
    public boolean GetType(){
        return this.type;
    }
    public Float GetPrise(){
        return this.prise;
    }
    public int GetHp(){
        return this.hp;
    }

    public Car(){

    }
}
