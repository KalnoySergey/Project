package MainPackage.Structures;
public class stack {
    private int max;
    private int []s_arr;
    private int top;

    public stack(int a){
        this.max = a;
        s_arr = new int[this.max];
        top = -1;
    }
    public void add(int el){
        this.s_arr[++top] = el;
    }
    public int subtract(){
        return s_arr[top--];
    }
    public int read_top(){
        return s_arr[top];
    }
    public boolean is_empty(){
        return(top==-1);
    }
    public boolean is_full(){
        return (top==max-1);
    }
}
