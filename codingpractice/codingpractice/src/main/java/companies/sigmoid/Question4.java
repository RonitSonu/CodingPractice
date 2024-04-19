package companies.sigmoid;

public class Question4 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException("Custom Exception");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
