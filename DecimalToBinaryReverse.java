import java.util.*;
class DecimalToBinaryReverse {
  public static void main(String args[]) {
    int decimal = 11;
    
    // Convert decimal to binary
    String binary = "";
    while (decimal > 0) {
      binary = (decimal % 2) + binary;
      decimal /= 2;
    }
    System.out.println("Binary representation: " + binary);
    
    // Reverse the binary string
    String reversedBinary = "";
    for (int i = binary.length() - 1; i >= 0; i--) {
      reversedBinary += binary.charAt(i);
    }
    System.out.println("Reversed binary: " + reversedBinary);
    
    // Convert the reversed binary back to decimal
    int reversedDecimal = 0;
    int power = 0;
    for (int i = reversedBinary.length() - 1; i >= 0; i--) {
      reversedDecimal += (reversedBinary.charAt(i) - '0') * Math.pow(2, power);
      power++;
    }
    System.out.println("Reversed decimal: " + reversedDecimal);
  }
}