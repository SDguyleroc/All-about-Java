package interfaces;

// Interface is a contract for a class to follow
// all methods in it are abstract
// a class can implement multiple interfaces
// a class can extend only one class but can implement multiple interfaces
interface A{

    // You can declare variables inside an interface, but they are by default final and static
    // which means they are constant (final) and static they belong to the interface only

    int age= 25; // you have to initialize which means give them a value because it is a final you won't be able to change it or assign a value to it later
    String ComputerType = "Laptop";

    // all nethods in interface are abstract by default
    // all methods in interface must be public and they are by default so you don't need to write public
    void show();
    void config();
}

class B implements A
{

    // You must override/implement methods from interface if your class is implementing the interface

    public void show() {
        System.out.println("In show implementation");
    }


    public void config() {
        System.out.println("In config method implementation");
    }
}
public class InterfaceLesson2 {
    public static void main(String[] args)
    {
        // A obj = new A(); // you can't create an object of an interface
        // You need to create an object of a class that implements the interface

        A obj1 = new A(){
            public void show() {
                System.out.println("In show implementation");
            }
            public void config() {
                System.out.println("In config method implementation");
            }
        }; // you can't create an object of an interface but you can use lambda expression (anonymous class) to create it

        A ref; // you can create a reference type of interface

        ref= new B(); // You can assign the reference of type A which is an interface to an abject of a class that implements it which in this case is B
        ref.show();
        ref.config();

        // both above and below works
        B obj = new B();
         obj.config();
         obj.show();

         // because the variable declared in interface A are static the only way to access them is using the A.
        System.out.println("age:" + A.age);
        System.out.println(A.ComputerType);







    }
}
