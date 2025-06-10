package inheritance;
class Calculator{
    public int add(int n1, int n2){

        return n1 + n2;

    }

    public double sub(double n1, double n2){

        return n1 - n2;

    }

}

class AdvCalcu extends Calculator{

    public double Multi(double n1, double n2){
        return n1 * n2;

    }

    public double divide(double n1, double n2){
        return n1/n2;
    }

    // you can also overide parent class method by changing it behavior/ the code in the method block.
    public double sub(double n1, double n2){

        return n2 - n1;

    }
}

class SciencetifiCalcu extends AdvCalcu{

    public double power(double n1, double n2){
        return Math.pow(n1,n2);
    }

}

public class InheritanceLesson {
    public static void main(String[] args) {
        SciencetifiCalcu obj = new SciencetifiCalcu();
        // The add() of Calculator class will be called because it will not find it in the SciencetifiCalcu or AdvCalcu
       int add = obj.add(12, 70);
       // the sub() from AdvCalcu will be called because that's the parent class of SciencetifiCalcu
        double sub =obj.sub(1.6, 40);

        double dvd =obj.divide(60,100);
        double pwr =obj.power(50, 2);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(dvd);
        System.out.println(pwr);


        /**
         * As you can see "SciencetifiCalcu" doesn't have all these methods
         * but it inherites them from the class it extended which is "AdvCalcu"
         * which also extended the "Calculator" class
         * This is called Multi-level Inheritance
         */

    }
}
