package strings;
public class String1 {
    public static void main(String[] arg){

       // String is actually a class
        String name = "Ossebi";
        // You can do it like this as well the expected object creation of an abject using String class
        String name1 = new String("Guy");
        System.out.println(name1);

        // since it a class ofcourse it as a some methods
        // example chartAt() which used the index to find an index of a character in a String
        System.out.println(name1.charAt(1));

        // You can also use the concacinate method

        System.out.println(name1.concat( " " + name));

        // Java has made easier so you don't have to mention the object creation (new String()) You can just declare a reference variable assign the value
        // java will do the constracture creation/ creat the object and insert the value in the String Constructor in the background

        String name2 = "Leroc";
        System.out.println(name2);

//      String Buffer

        // creating a new String buffer
        StringBuffer sb = new StringBuffer("Guy");
        // checking it capacity default capacity is 16 and than it adds that to the length of the String you pass in
        System.out.println(sb.capacity());
        // getting the String length
        System.out.println(sb.length());

        // apend data because unlike String, String buffer is mutable

        System.out.println(sb.append(" Ossebi"));

        // turning buffer data to string
        String str = sb.toString();







    }
}
