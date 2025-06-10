package typecasting;
class A{

    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
        }
public class TypeCasting {
    public static void main(String[] args)
    {
//        double d =4.5;
//        int i =(int)d;
//        System.out.println(i);

        A obj = new B();
        obj.show1(); // this inheritance kinda represents up casting
       // obj.show2() will result in error because A doesn't know about B

        B obj2 = (B) obj; // this is down casting because obj's reference type is A but the object is B
        obj2.show2();


    }
}
