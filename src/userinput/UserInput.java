package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
          System.out.println("Enter a number: ");
//        int num = 0;
//        try{
//           num = System.in.read();
//        }catch(Exception e){
//            System.out.println("Error: " + e.getMessage());
//        }
//        System.out.println(num); // this will print the ASCII value of the character

        // Which is why java as provided  a special class called BufferReader to handle user input
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);

        // BUfferedReader bf = new BufferedReader(new InputStreamReader(System.in)); is also valid

        // this will return a string value
        // which is also complex and not very user friendly
        // which is why Java introduced a special class called Scanner
        // which is a much more user-friendly way to handle user input

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        System.out.println(num1);

        int num = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try{

            num =Integer.parseInt(bf.readLine());
            System.out.println(num);
        }finally {
            bf.close();
        }

        // or

        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            num =Integer.parseInt(br.readLine());
            System.out.println(num);
        }


    }
}
