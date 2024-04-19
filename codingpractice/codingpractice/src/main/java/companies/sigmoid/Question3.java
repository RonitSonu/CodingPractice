package companies.sigmoid;

public class Question3 {

    class C extends B {
        public C(){
            System.out.println("C");
        }
    }

    public Question3(){
        System.out.println("A");
    }
    public static void main(String[] args) {
        Question3 a = new Question3();
        C c = a.new C();
        //Such that Output is ABC (Ignore the new line)

    }

    class B {
        public B(){
            System.out.println("B");
        }
    }
}
