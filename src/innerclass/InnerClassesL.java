package innerclass;
class  OuterClass{
    int age;
    public void show(){
        System.out.println("in A Show");
    }

    class InnerClass
    {
        public void config(){
            System.out.println("In config");
        }
    }
}
public class InnerClassesL {
    public static void main(String[] args)
    {
        OuterClass outerClassObject = new OuterClass();
        outerClassObject.show();

        // InnerClass obj1 = new InnerClass() // will result in error because "InnerClass" belongs to "OuterClass" so instead you

        OuterClass.InnerClass innerClassObject = outerClassObject.new InnerClass(); // to call make an object of "Innerclass" you need the object of "OuterClass"
        // and use it with "new" keyword in object creation

        innerClassObject.config();
    }
}
