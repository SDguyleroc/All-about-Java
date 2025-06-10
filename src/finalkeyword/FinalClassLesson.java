package finalkeyword;
final class Calcu{
    public void show(){
        System.out.println("in Calc show");
    }

    public void add(int a, int b){
        System.out.println(a + b);
    }
}
// once you make your class final it can't be extended by another class
// class AdvCalc extends Calcu{
//
//}

class C {
    public void show(){
        System.out.println("class C method");
    }

    public final void showOConstance(){
        System.out.println("On Class C can modify");
    }
}

class B extends C{
    // method overide
    public void show(){
        System.out.println("class B method");
    }

    // this will give an error because B has a read only permission since the method if final. which means it can't be overriden
//    public final void showOConstance(){
//        System.out.println("On Class B can modify");
//    }
}
public class FinalClassLesson {
    public static void main(String[] a){

        Calcu obj = new Calcu();
        obj.show();
        obj.add(6, 7);

        B objB = new B();
        objB.show();

        objB.showOConstance(); // even though it "final" class "B" can still Inherite the method but just can't overide it.
    }
}
