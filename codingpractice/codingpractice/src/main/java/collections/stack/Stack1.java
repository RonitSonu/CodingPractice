package collections.stack;

import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        //Uses LIFO

        //System.out.println(stack.push(1));
        stack.push(5);
        stack.push(2);
        stack.push(3);



        System.out.println("Stack is: "+stack);

        stack.pop();

        System.out.println("Stack is: "+stack);

        System.out.println(stack.peek());

        System.out.println(stack.elementAt(0));

        System.out.println(stack.firstElement());

        stack.removeElementAt(0);

        System.out.println(stack);


    }
}
