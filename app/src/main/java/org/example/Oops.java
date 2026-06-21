package org.example;

import java.util.Scanner;

public class Oops {
  Scanner scanner = new Scanner(System.in);

  public int getInput(int lowerBound, int upperBound, String prompt, String errorMessage) {
    int value = promptAndRead(prompt);

    while (!(value >= lowerBound && value <= upperBound)) {
      System.out.println();
      System.out.println(errorMessage);
      value = promptAndRead(prompt);
    }

    return value;
  }

  public int promptAndRead(String prompt) {
    System.out.println(prompt);
    return scanner.nextInt();
  }

}
