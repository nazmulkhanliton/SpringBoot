package Collection_Framework;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        System.out.println("Last element of the stack " + demo.peek());
        System.out.println("Search : " + 4);

        for(int tem : demo){
            System.out.println(tem);
        }
    }
}
