package exceptions;

public class ExceptionsLessons {
    public static void main(String[] args) {

        System.out.println("application starts: ");
        int i = 0;
        int[] nums = new int[5];
        String str=null;
        // use the try block to write code/statements that might have exception error and use catch to catch the thrown Exception object and handle it
        // this help the program to continue running even with exception error
        try{
            int j = 8 / i;
            System.out.println(nums[1]);
            System.out.println(nums[5]); // this should result in exception error because there is no index 5 in the array since array has five value and index starts with 0
            System.out.println(str.length()); // null point exception
            System.out.println(j); // this will throw an exception:  java.lang.ArithmeticException: / by zero
            System.out.println("bye"); // this should not print because runn time error stops execution or application
        }catch (ArithmeticException e) // ArithmeticException this catch is only for the Arithmetic exception
        {
            System.out.println("something went wrong, you can't divide by zero: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e)// ArrayIndexOutOfBoundsException will catch only ArrayIndexOutOfBoundsException exception that are thrown
        {
            System.out.println("something went wrong, : " + e);
        }
        catch (Exception e)// general exception will catch all other exception you're not handling one at a time. so if you have two exception or more only one will be caught (the first one that's thrown)
        {
            // since null point exception is not being handled this catch will handle it
            System.out.println("Something went wrong: " + e);
        }

        System.out.println("This should run because it is outside the exception block"); // should run no matter what since all the critical statements are being handle with try and catch


    }

}
