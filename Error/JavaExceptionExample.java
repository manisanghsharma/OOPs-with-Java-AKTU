public class JavaExceptionExample {
    public static void main(String[] args) {
        try{
            int data = 100/0;
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("There is an error");
        }
        finally{
            System.out.println("Runs independant of error");
        }

        //rest of the program
        System.out.println("Rest");

    }
    
}