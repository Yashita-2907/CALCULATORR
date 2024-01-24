import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Calculator {
// Function to perform addition
 public double add(double num1, double num2) {
 return num1 + num2;
 }
 // Function to perform subtraction
 public double subtract(double num1, double num2) {
 return num1 - num2;
 }
 // Function to perform multiplication
 public double multiply(double num1, double num2) {
 return num1 * num2;
 }
 // Function to perform division
 public double divide(double num1, double num2) {
 return num1 / num2;
 }
 // Function to calculate the sum of an array
 public double sumArray(double[] array) {
 return Arrays.stream(array).sum();
 }
 // Function to calculate the mean of an array
 public double meanArray(double[] array) {
 return sumArray(array) / array.length;
 }
 // Function to calculate the mode of an array
 public double modeArray(double[] array) {
 if (array.length == 0) {
 throw new IllegalArgumentException("Array 
cannot be empty");
 }
 // Create a frequency map to store the occurrences 
of each element
 Map<Double, Integer> frequencyMap = new 
HashMap<>();
 // Populate the frequency map
 for (double num : array) {
 frequencyMap.put(num, 
frequencyMap.getOrDefault(num, 0) + 1);
 }
 // Find the mode(s)
 double mode = 0;
 int maxFrequency = 0;
 for (Map.Entry<Double, Integer> entry : 
frequencyMap.entrySet()) {
 if (entry.getValue() > maxFrequency) {
 maxFrequency = entry.getValue();
 mode = entry.getKey();
 }
 }
 // Check if there is more than one mode
 for (Map.Entry<Double, Integer> entry : 
frequencyMap.entrySet()) {
 if (entry.getValue() == maxFrequency && 
entry.getKey() != mode) {
 throw new IllegalStateException("Array has 
multiple modes");
 }
 }
 return mode;
 }
 // Function to calculate the median of an array
 public double medianArray(double[] array) {
 Arrays.sort(array);
 int middle = array.length / 2;
 return (array.length % 2 == 0) ? (array[middle - 1] + 
array[middle]) / 2.0 : array[middle];
 }
 // Function to calculate the variance of an array
 public double varianceArray(double[] array) {
 double mean = meanArray(array);
 double sumSquaredDifferences = 
Arrays.stream(array).map(x -> Math.pow(x - mean, 2)).sum();
 return sumSquaredDifferences / array.length;
 }
 // Function to calculate the standard deviation of an array
 public double standardDeviationArray(double[] array) {
 return Math.sqrt(varianceArray(array));
 }
}