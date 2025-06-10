package headfirstjava.simpleStartup;

public class SimpleStartup {
    private int[] locationCells;
    private int numOffHitts = 0;


    public void setLocationCells(int[] locations) {
        locationCells=locations;

    }

    public String checkYourself(int guess) {
        String result ="miss";

        for(int cell : locationCells){
            if (guess == cell){
                numOffHitts++;
                result="hit";

                System.out.println("result: ");
               break;
            }
            


        }

        if(numOffHitts == locationCells.length){
            result = "kill";
        }

        System.out.println(result);

        return result;
    }

    public static void main(String[] args){

        int numOffGuess =0;

        GameHelper helper = new GameHelper();

        SimpleStartup startup = new SimpleStartup();

        int randomNum = (int) (Math.random() *5);

        int[] locations = {randomNum, randomNum +1, randomNum +2};

        startup.setLocationCells(locations);

        boolean isAlive =true;

        while (isAlive){
            int userGuess = helper.getUserInputInt("Enter a number: ");
            String result = startup.checkYourself(userGuess);

            numOffGuess++;

            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took: " + numOffGuess + " Guess");
            }
        }


    }
}
