package enumerations;

// Enumerations - a group of related constants
// example - days of the week
// example - Error codes
// different constants have different numbers
//

import java.util.Arrays;

enum Status{
    // these below are called named constants
    //
    Running, Failed, Pending, Success;
}

public class EnumLesson {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);

        // there are methods in Enum class
        // values() will return all named constants in the enum
        System.out.println(Arrays.toString(Status.values()));
        // ordinal() will return the index of the named constant in the enum
        System.out.println(s.ordinal());

        Status s1 = Status.Pending;

        switch(s1){
            case Status.Running:
                System.out.println("Running: something is happening");
                break;
            case Failed:// No need to write Status.Running in case because s1 is a named constant.
                System.out.println("Failed: something went wrong");
                break;
            case Pending:
                System.out.println("Pending: waiting for something else to happen");
                break;
            case Success:
                System.out.println("Success: something happened");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
