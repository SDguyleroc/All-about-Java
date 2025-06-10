package exceptions;
class CustomException extends Exception{
    public CustomException(String string){
        // calling the super class's constructor and passing in string as an argument
        super(string);
    }
}
public class ThrowThrows {

    public static void main(String[] args) {
        int i = 20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException(" I don't want to print zero");
            }
        }catch (ArithmeticException e){
            j=18/1;
            System.out.println("default output: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Something went wrong and is not handled: " + e);
        }
        System.out.println(j);

        // throw custom exception

        int in = 20;
        int c=0;
        try{
            c=18/i;
            if(c==0){
                throw new CustomException("I don't want to print 0");
            }
        } catch (CustomException e) {
            c=15/1;
            System.out.println("default output: " + e);
        }
        System.out.println(c);
    }
}
