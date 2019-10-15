# Java_pythagoreanTheorem_logic

To complete this assignment, you will need the Math class from the java.lang package. This package provides fundamentals classes to the Java programming language such as Object, Boolean, String, Integer, Math, etc. Therefore, the java.lang package is automatically imported and ready to use in every Java program.

Objectives:

● Learn how to import a class into your project.

● Practice object instantiation.

● Practice method invocation.

● Use the java.lang package.

Tasks:
● Create a Pythagorean class in javaFun.

javaFun/Pythagorean.java
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
    }
}
● Use a method from the Math class to calculate the hypotenuse of a right triangle given the values of the two legs. HINT: Use the static sqrt method. Static means that the method belongs to the class instead of the object. Here is some sample code:

double four = 4.0
// calling the sqrt static method of the Math class
double squareRoot = Math.sqrt(four) // 2.0
● Create a PythagoreanTest file that will instantiate a new Pythagorean object and call the calculateHypotenuse method.
