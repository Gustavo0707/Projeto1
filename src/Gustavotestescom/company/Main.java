package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int M, CM, result;
        CM = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type some distance in meter");
        M = scanner.nextInt();

        scanner.close();
        result = M * CM;

        System.out.println("Your distance in centimeters is " + result);
    }
}
  //