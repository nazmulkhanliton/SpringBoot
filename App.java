package Exception_Handling;

public class App {
    public static void main(String[] args) {
        App obj = new App();
        obj.class2(1, 0);


    }

    public void class1(int x, int y)
    {
        if (y != 0) {
            System.out.println(x/y);
        }else
        {
            System.out.println("The value of y is 0");
        }

    }
    public void class2(int x, int y)
    {
        try{
            System.out.println("Hello Test" + y/x);
        }catch (Exception e){
            System.out.println("The value of y is 0");
        }
    }
}
