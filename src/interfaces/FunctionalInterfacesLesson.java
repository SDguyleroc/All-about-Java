package interfaces;
// A functional interface is a type of interface that has only one abstract method
// The @FunctionalInterface annotation is used to indicate that the interface is a functional interface
// Without this annotation, the interface is not a functional interface
// which means it can have more than one abstract method
// and it won't be able to be used as a functional interface

@FunctionalInterface
interface FunctionalI{
    void show();
}
//class C implements FunctionalI{
//    public void show(){
//        System.out.println("in show");
//    }
//}

interface FunctionalI2{
    void show();
}

interface FunctionalI3{
    void show(int a);
}

interface FunctionalI4{
    int add(int a, int b);
}



public class FunctionalInterfacesLesson {
    public static void main(String[] args){

        // You can create an object of a functional interface using an anonymous class
        FunctionalI obj = new FunctionalI() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };

        obj.show();
        // You can also create an object of a functional interface using a lambda expression
        // since a functional interface has only one abstract method you can use a lambda expression to create an object of a functional interface
        // which reduces the number of lines of code.
        // You do this by using the arrow operator -> which is used to indicate that the method is a lambda expression
        // the different here is that the old way of creating an object of a functional interface was using an anonymous class
        // but now you can create an object of a functional interface using a lambda expression without the new keyword and the class name just Reference type and name assigned  to
        // () -> followed by the body of the method, no block is needed if there is only one line of code

        FunctionalI obj2 = () -> System.out.println("in show");

        //Fucntional interface with abstract method that takes one parameter
//        FunctionalI3 obj3 = (int a) -> System.out.println("in show " + a);
//        obj3.show(5);

        //or

        FunctionalI3 object3 = a -> System.out.println(" in show with argument" + a);
        object3.show(3);
        // you need the () if there is more than one argument

        // functional Interface with method that returns value. no need for return keyword or parameter types since it already been mentions in the interface design
        FunctionalI4 obj4 = (a,b) -> a+b;
        int result =obj4.add(4,5);
        System.out.println(result);




    }
}
