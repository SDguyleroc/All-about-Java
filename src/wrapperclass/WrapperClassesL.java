package wrapperclass;

public class WrapperClassesL {

    public static void main(String[] args) {
        int num = 10;
        Integer num1 = num; // auto-boxing - turning a primitive value into class type. java automatically like string creates the Constructor

        int num2 = num1; // this is auto-unboxing

        String str = "12";
        int num3 = Integer.parseInt(str); // parsing/turning a String number into a int value
        System.out.println(num3 * 2); // doing an operation with the parsed value
    }
}
