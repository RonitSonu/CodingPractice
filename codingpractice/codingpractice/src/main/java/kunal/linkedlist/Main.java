package kunal.linkedlist;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(1);
//        list.insertFirst(6);
//        list.insertFirst(9);
//        list.display();
//        list.insertLast(99);
//        list.display();
//        list.insert(100, 3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

        /*
        * Doubly LL
        * */
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(1);
//        list.insertFirst(7);
//        list.display();
//
//        list.insertLast(99);
//        list.display();
//
//        list.insert(99, 98);
//        list.display();

        /*
        * Circular LL
        * */
        CLL list = new CLL();
        list.insert(23);
        list.insert(45);
        list.insert(19);
        list.insert(75);

        list.display();

        list.delete(19);

        list.display();


    }
}
