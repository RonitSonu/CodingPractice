package striver.recursion.l2;

public class Test {

    public static void main(String[] args) {

        Test t1 = new Test();
       // t1.printNTimes(1,5);
       // t1.printNNums(1,5);
       // t1.printNTo1(5,5);
        //t1.printNNumsBackTracking(5,5);
        t1.printNTo1BackTracking(1,5);
    }

    //1. print name n times
    public void printNTimes(int i, int n) {
        if(i>n)
            return;
        System.out.println("Ronit");
        printNTimes(i+1,n);

    }

    //2. print 1 - n linearly
    public void printNNums(int i, int n) {
        if(i>n)
            return;
        System.out.println(i);
        printNNums(i+1,n);
    }

    //3. print n to 1
    public void printNTo1(int i, int n) {
        if(i<1)
            return;
        System.out.println(i);
        printNTo1(i-1,n);
    }

    //4. print 1 - n using backtracking
    public void printNNumsBackTracking(int i, int n) {
        if(i<1)
            return;
        printNNumsBackTracking(i-1,n);
        System.out.println(i);
    }

    //5. print n - 1 using backtracking
    public void printNTo1BackTracking(int i, int n) {
        if(i>n)
            return;
        printNTo1BackTracking(i+1,n);
        System.out.println(i);
    }
}
