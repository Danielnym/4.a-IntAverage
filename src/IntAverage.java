import java.util.InputMismatchException;
import java.util.Scanner;

public class IntAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        boolean ValidInput = false;

    while (!ValidInput) {
        try {
            System.out.println("Enter num1:");
            num1 = sc.nextInt();
            System.out.println("Enter num2:");
            num2 = sc.nextInt();
            System.out.println("Enter num3:");
            num3 = sc.nextInt();
            ValidInput = true;
        } catch (InputMismatchException e) {
            System.out.println("Enter valid number");
            sc.nextLine();
        }
    }
        try {
            int avg;
            avg = (num1 + num2 + num3) / 3;
            System.out.println("The average is " + avg);
        }
        catch(ArithmeticException e) {
            System.out.println("There was an error");
        }
        finally {
            sc.close();
        }

    }

  /*  public static void Average(int num1, int num2, int num3) {
        int avg;
        avg = (num1 + num2 + num3) / 3;

       *//* if (avg / 0) {}*//*
    }*/
}