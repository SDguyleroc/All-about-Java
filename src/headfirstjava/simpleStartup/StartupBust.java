package headfirstjava.simpleStartup;

import java.util.ArrayList;

public class StartupBust {

   private GameHelper helper = new GameHelper();

   private ArrayList<StartUp> startUps = new ArrayList<StartUp>();

   private int numOfGuess =0;

   private void setUGame(){
       StartUp one = new StartUp();
       one.setStartupName("Rwanda");

       StartUp two = new StartUp();
       two.setStartupName("Uganda");

       StartUp three = new StartUp();
       three.setStartupName("France");

       startUps.add(one);
       startUps.add(two);
       startUps.add(three);

       System.out.println(" Your goal is to sink three startups.");
       System.out.println("Rwanda, France, and Uganda");

       System.out.println("Try to sink them all in the fewest number og guess");

       for(StartUp startUp: startUps){

           ArrayList<String> newLocation = helper.placeStartup(3);


       }

   }

   private void startplaying(){
       while(!startUps.isEmpty()){
           String userGuess = helper.getUserInput("Enter a Location guess: ");
           checkUserGuess(userGuess);
       }
       finishGame();
   }



    private void checkUserGuess(String userGuess) {
       // increment number of guess the user has taken

        numOfGuess++;

        // assume result us a miss until told otherwise
        String result ="miss";

        // Repeat/go through all the startups in the list
        for(StartUp startupToTest: startUps){

            // Ask the startup to check the user guess, looking for a hit (or kill) assign it to result

            result = startupToTest.checkYourself(userGuess);
            // if result equal hit than get out of the loop
            if(result.equals("hit")){
                break;
            }
            // if result for this start up is kill, remove it out of the list then get out of the loop
            if(result.equals("kill")){
                startUps.remove(startupToTest);
                break;
            }
        }
        // print out user result
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Alll the startups are dead! Your stock is now worthless");
        if(numOfGuess<=18){
            System.out.println("It only took you " + numOfGuess + " guessess.");
            System.out.println("You got out before your options sank");
        }
        else {
            System.out.println("You took long enough. " + numOfGuess + " guess.");
            System.out.println("fish are dancing with your options");
        }
    }

    public static void main(String[] args){

       StartupBust game = new StartupBust();
       game.setUGame();
       game.startplaying();
    }


}
