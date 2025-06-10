package super_and_this;

class A{

    // any other class that extends class A will inherrite class A's default constructor
    public A(){
        System.out.println("in constructor A");
    }

    public A(int a){
        System.out.println("in constructor A with param");
    }
}

class B extends A{
    public B(){
        // super(); // this is because every constructor in java has a method called "super()" even if you don't mention super() it is there
        // java will automatically call the default constructor of class A which is the super class
        // then it will call the constructor of class B
        System.out.println("in Constructor B");
    }
    //param constructor
    public B(int a){
        // if you to call the param constructor of class A you can do it like this
        super(a);
        System.out.println("in Constructor B with param");
    }

    public B(int c, int a){
        // Using "this" method will call the constructor of class B
        this();
        System.out.println("in Constructor B with param");
    }
}

public class ThisAndSuperLesson {

   public static void main(String[] a){

       // both constructor will be called and will print
       B b = new B();
       B b1 = new B(0);

       // this will go to the default constructor of class B, than it will go to the default constructor of class A
       // and then it will print,than it will go to the default constructor of class B and then it will print because we are calling the default constructor using "this"
       B b2 = new B(0,6);

       // this is because every constructor in java has a method called "super()" even if you don't mention super() it is there
       // Every class in java extends Object class which has a default constructor which is called when you create a new object
   }
}
