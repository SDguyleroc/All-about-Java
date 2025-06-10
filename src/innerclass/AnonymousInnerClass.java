package innerclass;
class A{
    public void show(){
        System.out.println("in show");
    }
}


abstract class B{
    public abstract void show();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        }; 
        
        // the code above is creating a reference variable obj of type "A" and assigned to an object of A
        // and which is creating a new design of A class which has no name therefore is anonymous
        // this is good when you know you will use this anonymous class only once
        // for example when you want to instantiate abstract class only once you don't want to create a subclass

        // example

        B bObject = new B() {

            public void show() {
                System.out.println("in an instanced of abstract class using anonymous class");
            }
        };

        bObject.show();

    }
}

