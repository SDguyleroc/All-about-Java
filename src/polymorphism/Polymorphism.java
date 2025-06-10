package polymorphism;
class A{
    public void show()
    {
        System.out.println("in A Show");
    }

}

class B extends A{
    // method override
    public void show()
    {
        System.out.println("in B Show");
    }
}

class C extends A{
    public void show()
    {
        System.out.println("in c Show");
    }
}
public class Polymorphism {

    public static void main(String[] args)
    {
        // polymorphism is the ability of objects to take on many forms
        // the word polymorphism comes from the Greek word poly (many) and morph (form)
        // which also means "many forms" or "many behaviors"

        // the reference can be a parent and the object can be a child
        //  basically you can assign a parent reference variable to it child object
        A objB = new B();

        A objC = new C();

        // the method will be called based of the object not the reference type
        objB.show();

        // this can be helpful when you need to create list of Type A

        A[] list ={objC, objB};

        // another usefull example is when you want to do something like this

        A obj = new A();
        obj.show(); // the show() in class a will be called

        // now if we assign the object to a new type

        obj= new B();
        obj.show(); // the show() in Class B will be called

        // and that's an example of polymorphism





    }
}
