package AnonymasInnerClass;

public class Shop {

    public static void main(String[] args) {
        Door door = new Door();
        if(door.getLock().isUnlocked("args")){
            System.out.println("Welcome, we are open");
        }else{
            System.out.println("We are closed now, please visit later");
        }
    }
}