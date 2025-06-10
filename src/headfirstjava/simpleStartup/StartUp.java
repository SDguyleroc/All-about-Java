package headfirstjava.simpleStartup;

import java.util.ArrayList;

public class StartUp {
    // String arrayList of locationCells fild
    private ArrayList<String> locationCells;

    private String startupName;

    //  string localtioCells setter with ArrayList locations parameter
    public void setLocationCells(ArrayList<String> locations) {
        locationCells=locations;
    }

//    public String getStartupName(){
//        return startupName;
//    }

    public void setStartupName(String name){
        startupName=name;
    }
    // check yourself method which returns a String
    // userInput parameter
    // returns result
    public String checkYourself(String userInput){

        // local String variable to asign the result initialized has miss
        String result = "miss";

        // local int variable to assign the to the location index of the users input
        int index = locationCells.indexOf(userInput);

        // check if the index of the user's input in the list is greater Or equal to zero
        if(index >= 0){
            // if so than remove that value from the list using the index
            locationCells.remove(index);
            // if the arrayList is empty set the result kill (basical you guess or kill all the enemy in the location
            if(locationCells.isEmpty()){
                result ="kill";
            }
            else{
                // otherwise set result to hit which means the array is not empty yet there still other enemy locations but you hit one of them
                result = "hit";
            }
        }
        // return result back to the method caller
        return result;
    }
}
