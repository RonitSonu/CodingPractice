package kunal.linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    /*
    * Constructor for LL class
    * */
    public LL(){
        this.size=0;
    }
    /*
    * End
    * */


    /*
    * 1. Adding new node at the first Position
    * */
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }
    /*
    * End 1.
    * */

    /*
    * 2. Display function
    * */
    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    /*
    * 2. End
    * */

    /*
    * 3. Insert new node at last
    * */
    public void insertLast(int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    /*
    * 3. End
    * */

    /*
    * 4. Insert new node at any index
    * */
    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }
    /*
    * 4. End
    * */

    //Deletion Methods
    /*
    * 5. Delete a node at first index
    * */
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    /*
    * 5. End
    * */

    public int deleteLast() {
        if(size <= 1 ) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    /*
    * get method
    * */
    public Node get(int index) {
        Node node = head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node; //returs a reference pointer to that point/index
    }
    /*
    * End
    * */

    /*
    * 6. delete At any position
    * */
    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }
    /*
    * 6. End
    * */

    /*
    * 7. Find the node using given value field
    * */
    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null; //Not found the node containing that value
    }
    /*
    * 7. End
    * */

    /*
    * Node class creation
    * */
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }


    }
    /*
    * End
    * */
}
