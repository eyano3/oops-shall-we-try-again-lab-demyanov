package org.example;

public class App {
  public static void main(String[] args) {
    Verifier verifier = new Verifier();

    int value = verifier.getInput(0, 100, "Please enter a valid value: ",
            "Your value is invalid.");

    System.out.println();
    System.out.println("Your valid value is: " + value);
  }
}
