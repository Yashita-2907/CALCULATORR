public class Main {
public static void main(String[] args){
// Create an instance of UserInput 
class
 UserInput userInput = new UserInput();
 // Get two numbers from the user
 double num1 = 
userInput.getDoubleInput("Enter the first number: ");
 double num2 = 
userInput.getDoubleInput("Enter the second number: ");
 // Create an instance of Calculator class
 Calculator calculator = new Calculator();
 // Perform basic operations
 System.out.println("Addition: " + 
calculator.add(num1, num2));
 System.out.println("Subtraction: " + 
calculator.subtract(num1, num2));
 System.out.println("Multiplication: " + 
calculator.multiply(num1, num2));
 // Check for division by zero
 if (num2 != 0) {
 System.out.println("Division: " + 
calculator.divide(num1, num2));
 } else {
 System.out.println("Error! Division by 
zero is not allowed.");
 }
 // Get an array from the user
 double[] numbersArray = 
userInput.getArrayInput();
 // Perform array operations
 System.out.println("Sum of Array: " + 
calculator.sumArray(numbersArray));
 System.out.println("Mean of Array: " + 
calculator.meanArray(numbersArray));
 System.out.println("Mode of Array: " + 
calculator.modeArray(numbersArray));
 System.out.println("Median of Array: " + 
calculator.medianArray(numbersArray));
 System.out.println("Variance of Array: " + 
calculator.varianceArray(numbersArray));
 System.out.println("Standard Deviation of 
Array: " + calculator.standardDeviationArray(numbersArray));
 }
}