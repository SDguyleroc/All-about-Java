package headfirstjava.simpleStartup;

import java.util.ArrayList;
import java.util.Scanner;

public class GameHelper {
    Scanner scanner = new Scanner(System.in);

    public String getUserInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }


    public int getUserInputInt(String text) {
        System.out.println(text);
        return scanner.nextInt();
    }

    public ArrayList<String> placeStartup(int i) {
        return null;
    }
}
