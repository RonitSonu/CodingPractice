package striver.recursion.l2;

public class SumOfNNumbers {

    public static void main(String[] args) {

       // sumofNparam(3,0);
       // System.out.println("Sum of 3 : "+sumOfN(3));
        System.out.println("Factorial of 3 : "+factorial(3));

    }

    //Using parameterised way
    public static void sumofNparam(int i, int sum){

        if(i<1){
            System.out.println(sum);
            return;
        }
        sumofNparam(i-1, sum+i);
    }


    //Using functional way
    public static int sumOfN(int n) {

        if(n==0)
            return 0;

        return n + sumOfN(n-1);

    }

    //Factorial of n
    public static int factorial(int i) {
        if(i == 1)
            return 1;

        return i * factorial(i-1);
    }
}
