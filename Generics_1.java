package generics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
    private T myVariable;

    public Data(T myVariable) {
        this.myVariable = myVariable;
    }

    public T getMyVariable() {
        return myVariable;
    }

    @Override
    public String toString() {
        return "Data{" +
                "myVariable=" + myVariable +
                '}';
    }
}


public class Generics_1 {
    public static void main(String[] args) {
        /*
        Data data = new Data("Some String");
        String variable = (String) data.getObj();
        System.out.println(variable);
         */
        List<Data<Object>> element = new LinkedList<>();
        element.add(new Data<Object>("Text"));
        element.add(new Data<Object>(5.0));
        element.add(new Data<Object>(2.0f));
        element.add(new Data<Object>("%"));
        element.add(new Data<Object>(10));

        Generics_1 generics_1 = new Generics_1();
        generics_1.printList(element);
    }
    void printList(List<Data<Object>> list){
        ListIterator<Data<Object>> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: " + iterator.next().getMyVariable());
        }
    }
}
