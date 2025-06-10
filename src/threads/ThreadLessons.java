package threads;
class Z {

}
class A extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
  //  on every thread we need to override the run method
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Hello");
            // sleep method will make the thread wait for a certain amount of time
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadLessons {
    public static void main(String[] args){

        A a = new A();
        B b = new B();
//        a.show(); // this will execute first
//        b.show(); // this will execute second

        // we can use thread to execute things at the same time.
        // example the code: execute both a.show() and b.show() at the same time parallelly.

        // to do that we need to extend Thread in A and B classes

        a.start();
        b.start(); // start method will start the thread and run the run method

       

        // we can set the priority of a thread using setPriority method

//        a.setPriority(2);
//        b.setPriority(1);
//
//        a.start();
//        b.start();



    }
}
