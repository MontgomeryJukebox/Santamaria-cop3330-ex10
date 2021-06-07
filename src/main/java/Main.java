/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Main {
    public static final double TAX = 0.055;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] prices = new int[3];
        int[] quantities = new int[3];
        double subtotal = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter the price of item %d:", i + 1);
            prices[i] = in.nextInt();
            System.out.printf("Enter the quantity of item %d:", i + 1);
            quantities[i] = in.nextInt();
            subtotal += prices[i] * quantities[i];
        }

        double tax = subtotal * TAX;
        double total = subtotal * (1 + TAX);

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}