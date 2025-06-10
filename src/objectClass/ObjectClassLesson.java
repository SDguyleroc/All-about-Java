package objectClass;

class Laptop{
    String model;
    int price;

    // overriding the toString method from Object class
    public String toString(){
        return model + ": " + price;
    }

    public boolean equals(Laptop that){
        // the equal in model is calling is from String class
        return this.model.equals(that.model) && this.price == that.price;

        // the code above is the same has
//        if(this.model.equals(that.model) && this.price == that.price)
//            return true;
//        else
//            return false;
    }
}

public class ObjectClassLesson {
    public static void main(String[] args) {
      Laptop obj = new Laptop();
      obj.model = "Dell";
      obj.price =1000;

        Laptop obj1 = new Laptop();
        obj1.model = "Dell";
        obj1.price =1000;

        System.out.println(obj);// will print objectClass.Laptop@2a84aee7 unless you override the toString method in your class
        // everytime you try to print an object it calls the toString() from the Object class
        // so the code above is the same as
        System.out.println(obj.toString());

        System.out.println(obj1); // Laptop@a09ee92

        boolean result = obj1 == obj; // will print "false" since will be comparing these objects by their hexo number
        // like this Laptop@2a84aee7 == Laptop@a09ee92 which is not true
        System.out.println(result);

        // even though they have the same values. same model and price

        // to fix this we have to overide the equal() method from "Object" class on the "Laptop" class
        System.out.println(obj.equals(obj1));





    }
}
