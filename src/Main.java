//class Computer{
//
//    public void playMusic(){
//        System.out.println("music is playing");
//    }
//
//    public String getMeAPen(double cost){
//        if(cost>=10)
//            return "Pen";
//
//        return "$" +cost + " is to small";
//
//    }
//
//}
//
//class Calculator
//{
//
//    public int add(int n1, int n2){
//        return n1 + n2;
//    }
//
//
//    public int add(int n1, int n2, int n3){
//        return n1 + n2 + n3;
//    }
//
//    public double add(double n1, int n2, int n3){
//        return n1 + n2 + n3;
//    }
//
//
//}

class Student {
   int rollno;
   String name;
   int mark;

}

public class Main {
    public static void main(String[] args) {

//        Computer comp = new Computer();
//        comp.playMusic();
//        String pen =comp.getMeAPen(12);
//        System.out.println(pen);

//        Calculator obj = new Calculator();
//       int add1 = obj.add(10, 50);
//        double add2 =obj.add(10, 10, 11);
//        int add3 =obj.add(10, 10, 11);
//        System.out.println(add1);
//        System.out.println(add2);
//        System.out.println(add3);


// actual java array initialization style
        int[][] nums = new int[3][5];
        //       for(int i=0; i<3; i++){
        //           System.out.print("row " + i + ": ");
        //           for(int j=0; j<5; j++){
        //               int rand2 =(int) (Math.random()*100);
        //               num[i][j] = rand2;
        //
        //               System.out.print( num[i][j] + " ");
        //
        //           }
        //           System.out.println(" ");
        //       }

 // enhanced for loop:  same as above but with less code
        //        for(int[] numberlist: nums){
        //
        //            for(int number: numberlist){
        //                number =(int) (Math.random()*100);
        //                System.out.print(number + " ");
        //            }
        //            System.out.println(" ");
        //
        //        }
//// c style array initialization
        //        int number[] = new int[5];
        //        number[0] = 10;
        //        number[1] = 20;
        //        number[2] = 30;
        //        number[3] = 40;
        //        number[4] = 50;
        //        for (int j : number) {
        //            System.out.println(j);
        //        }
//   Jagged array : A jagged Array in Java is just a two-dimensional array in which each row of the array can have a different length
//        int[][] jagged = new int[4][];
//        jagged[0] = new int[3];
//        jagged[1] = new int[2];
//        jagged[2] = new int[4];
//        jagged[3] = new int[4];

        // enhanced for loop
//        for(int[] numlist: jagged)
//        {
//            for(int num: numlist){
//                num = (int) (Math.random()*5);
//                System.out.print(num + " ");
//            }
//            System.out.println(" ");
//        }

//        System.out.println(" Normal loop");

        // normal for loop

//        for(int i= 0; i< jagged.length; i++){
//
//            for(int j = 0; j<jagged[i].length; i++){
//                jagged[i][j] = (int) (Math.random() * 5);
//                System.out.print(jagged[i][j] + " ");
//            }
//            System.out.println();
//        }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Guy-leroc";
        s1.mark = 100;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Nathan";
        s2.mark = 110;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Boka";
        s3.mark = 105;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Ruby";
        s4.mark = 102;

        Student[] students = {s1, s2, s3, s4};

        for(Student student : students){
            System.out.println(student.rollno + " " + student.name + " : " + student.mark);
        }




   




    }
}