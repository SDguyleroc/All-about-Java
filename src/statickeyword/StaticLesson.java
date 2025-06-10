package statickeyword;

class Mobile{
    String brand;
    int price;

    static String name;
    // static block
    static {
        name= "Phone";
        System.out.println("in static block");
    }

    public Mobile(){
        brand ="";
        price = 200;
        System.out.println("In contractor");
    }

    public void show(){
        System.out.println(brand + " " + name + ": cost " + price );
    }

    // static method
    // You can only use static variable in static method otherwise you'll get an error
    public static void show1(Mobile object){
        System.out.println("in static method");

        System.out.println(name);
        // this will cause an error for brand and price but not name
//        System.out.println(brand + " " + name + ": cost " + price );

        // unless the static method is accepting object as a parameter
        System.out.println(object.brand + " " + name + ": cost " + object.price );
    }

}

public class StaticLesson {
    public static void main(String[] args)
    {


        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj3 = new Mobile();



        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1500;
        obj2.name = "SmartPhone";

        // because name is a static variable, all objects will have the same name when you use the class to assign data to the static method
        Mobile.name = "Phone";

        obj1.show();
        obj3.show();
        obj2.show();
        // static method is called using the class no object is needed
        Mobile.show1(obj1);
        Mobile.show1(obj2);
    }
  }