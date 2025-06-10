package headfirstjava.simpleStartup;

public class SimpleStartuptestDrive {

    public static void main(String[] args) {
        // Instantiating the SimpleStartup object from SimpleStartup class
        SimpleStartup dot = new SimpleStartup();
        // making an int array for the location of the startup (3 consecutive ints out of possible 7 (virtual 7))
        int[] locations = {2,3,4};

        boolean startup = true;

        // Invoke the setter method on the startup
        dot.setLocationCells(locations);

        // Make fake user guess
        int userGuess = 2;

        // Invoke the checkYourslef() method on the startup object and pass it the fake guess

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";
        if(result.equals("hit")){
            // if the fake userGuess (2) gives back "hit", it's working
            testResult = "passed";
        }

        System.out.println(testResult);


    }
}
