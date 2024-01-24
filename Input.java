import java.util.Scanner;
import java.util.Arrays;
public class UserInput {
private Scanner scanner;
public UserInput() {
scanner = new Scanner(System.in);
}
//Function to get input from user
public double getDoubleInput(String prompt) {
System.out.println(prompt);
return scanner.nextDouble();
}
//Function to get an array of doubles from user
public double[] getArrayInput() {
System.out.print("Enter the size of the 
array: ");
int size = scanner.nextInt();
double[] array = new double[size];
for (int i = 0; i < size; i++) {
array[i] = getDoubleInput("Enter the 
elements " + (i + 1) + " :");
}
return array;
}
}