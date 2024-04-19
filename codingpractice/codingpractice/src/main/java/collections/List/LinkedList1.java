package collections.List;

import org.springframework.boot.actuate.endpoint.web.Link;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

//        linkedList.add(11);
//        linkedList.add(45);
//
//        System.out.println(linkedList);

        //linkedList.remove(1);

        //linkedList.push(1);
        System.out.println(linkedList);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.removeFirst();
        linkedList.addFirst(1);
        linkedList.addLast(98);
        linkedList.set(0,23);
        System.out.println(linkedList);



        System.out.println(linkedList.contains(8));

        linkedList.clear();


        System.out.println(linkedList);


    }
}
