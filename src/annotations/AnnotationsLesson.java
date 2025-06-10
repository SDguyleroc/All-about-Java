package annotations;
//Annotations are used to provide supplemental information about a program.
// example: @Override: indicates that the method overrides a method in a superclass
// @Deprecated: indicates that the method is deprecated
// @SafeVarargs: indicates that the method accepts a variable number of arguments
// @Retention(RetentionPolicy.RUNTIME): indicates that the annotation is retained at runtime
// @Target(ElementType.METHOD): indicates that the annotation is applied to a method
// @Inherited: indicates that the annotation is inherited by subclasses
// @Documented: indicates that the annotation is documented
// @Repeatable: indicates that the annotation can be repeated
// @FunctionalInterface: indicates that the interface is a functional interface
// Hierarchy of annotations: Java.lang.annotation -> Standard annotations (java.lang.package) <-> Custom annotations

class A {
    public void showTheDatas() {
        System.out.println("in Show A");
    }
}

class B extends A{
    @Override
    public void showTheDatas() {
        System.out.println("in Show B");
    }

    // in this case we are telling the compiler that we are ovcerriding the method from the superclass
    // if we make an mistake compiler can gives an error. for example mis-spelling the method instead of showDatas you type showData without the is
    // solving the problem in compile time is better than during run time
}
public class AnnotationsLesson {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDatas();

    }
}
