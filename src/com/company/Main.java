package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        TowersOfHanoi tower = new TowersOfHanoi();
        System.out.println("Enter number of discs: ");
        Scanner scan = new Scanner(System.in);
        int discs = scan.nextInt();
        System.out.println("Instructions: ");
        tower.solve(discs, "A", "B", "C");
    }
}
