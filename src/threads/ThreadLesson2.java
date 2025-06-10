package threads;
class G implements Runnable{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class H implements Runnable{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadLesson2 {
    public static void main(String[] args)  {

        Thread t1 = new Thread(new G());

        Thread t2 = new Thread(new H());

        t2.start();
        t1.start();

        // create a thread using Lambda

       Runnable obj = () -> {

               for(int i =0; i<=5; i++){
                   System.out.println("Guy");
                   try{
                       Thread.sleep(10);

                   }catch(InterruptedException e){
                       System.out.println(e);
                   }
               }

       };

       Thread t3= new Thread(obj);
       t3.start();

       // or

        Thread t4 = new Thread(() -> {

                for(int i =0; i<=5; i++){
                    System.out.println("Leroc");
                    try{
                        Thread.sleep(10);

                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }

        });

        t4.start();
    }
}
