package interfaces;
// Interface is a contract for a class to follow
// all methods in it are abstract
// a class can implement multiple interfaces
// a class can extend only one class but can implement multiple interfaces
interface Computer {
     void code(); // this method is public and abstract by default that why we don't write public abstract
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, compile, run: Faster");
    }
}
class Developer{
    public void devApp(Computer lap){
       lap.code();
    }
}
public class InterfaceLesson {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer guy = new Developer();
        guy.devApp(desk);
    }
}
