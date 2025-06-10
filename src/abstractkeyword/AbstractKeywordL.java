package abstractkeyword;
abstract class Car{
    public abstract void drive(); // can declare and method and not implement them by using abstract keyword but only on abstract class

    public void playMusic(){
        System.out.println("Play music");
    }
}

class Wagon extends  Car{
    // any class that extends an abstract class must override and implement the class
    public void drive(){
        System.out.println("Driving...");
    }
}
public class AbstractKeywordL {

    public static void main(String[] args) {

        // Car obj = new Car(); // You can't create an object of an abstract class
        Car obj = new Wagon(); // but you can use it as a reference type and instantiate it using it sub classes
        obj.playMusic();
        obj.drive();
    }
}
