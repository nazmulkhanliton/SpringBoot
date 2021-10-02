package Collection_Framework;

import java.util.ArrayList;

public class ArrayListTest {

    static ArrayList<String> listNames = new ArrayList<>();

    public static void main(String[] args) {

       listNames.add("Khan");
       listNames.add("Salim");
       listNames.add("Salman");
       listNames.add("Karim");
       listNames.add("sakib");
        listNames.add("Rahul");
        listNames.add("Shopna");
        listNames.add("Maya");
        listNames.add("Kumar");
        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.displayList(listNames);

        arrayListTest.removeNameByPosition(0);
        System.out.println("***************");
        arrayListTest.displayList(listNames);

        arrayListTest.removeNameByString("Maya");
        System.out.println("***************");
        arrayListTest.displayList(listNames);

        arrayListTest.modifyName(6 , "Liton");
        System.out.println("***************");
        arrayListTest.displayList(listNames);

        int position = arrayListTest.search("Liton");
        System.out.println(position);
    }

    void displayList(ArrayList<String> names){
        for (String name: names) {
            System.out.println(name);
        }
    }

    void removeNameByPosition(int position) {
        listNames.remove(position);
    }
    void removeNameByString(String name){
        listNames.remove(name);
    }
    void modifyName(int position , String name){
        listNames.set(position, name);
    }

    int search(String name){
        return listNames.indexOf(name);
    }
}
