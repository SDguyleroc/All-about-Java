package encapsulation;

class Human{

    // making your class variable private means they are only accessible in this class
    // other classes do not have direct access to this class's private variable/fields
    private int age;
    private String name;

    // constructor is a special method that is called when you create a new object
    // constructor has the same name as the class name
    // constructor has no return type
    // constructor is used to initialize the object and set the value of the class variable so that other classes can access them

    //default constructor, this constructor java creates automatically you don't need to mention it
    public Human(){

    }

    // Parameterize Construction
    public Human(int a, String n){
        age=a;
        name=n;

    }

    // it important to create an indirect way for other classes through object to access your data/variable
    // that's where getters and setters comes in

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        // "this" keyword is for differentiating between parameter variable name and the class variable name
        // if they weren't named the same, the "this" keyword would be unnecessary
        this.name =name;
    }

    public void setAge(int a){
        age=a;
    }


}
public class EncapsulationLesson {

   public static void main(String[] a){
       Human human = new Human();
       Human human1 = new Human(35, "Ami");
       human.setAge(25);
       human.setName("Guy");

       System.out.println( human.getName() + " " +human.getAge());

       System.out.println( human1.getName() + " " +human1.getAge());
   }

}
