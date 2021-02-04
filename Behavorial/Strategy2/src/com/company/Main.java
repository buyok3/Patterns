package com.company;

import com.company.BehaviorClasses.BicycleTransport;
import com.company.BehaviorClasses.BusTransport;
import com.company.BehaviorClasses.TaxiTransport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Context con = new Context();

        int time, money;
        System.out.println("Do you want to save time?\n\t1 - YES\n\t2 - NO\n\t3 - DOESN'T MATTER\nAnswer: ");
        time = sc.nextInt();
        System.out.println("\nDo you want to save money?\n\t1 - YES\n\t2 - NO\n\t3 - DOESN'T MATTER\nAnswer: ");
        money = sc.nextInt();

        switch (time) {
            case 1: { // Save time
                switch (money) { // Save money
                    case 1: {
                        con = new Context(new BusTransport());
                        break;
                    }
                    case 2:   // Don't save time
                    case 3: { // Doesn't matter
                        con = new Context(new TaxiTransport());
                        break;
                    }
                    default: {
                        System.out.println("Eat shit!");
                        break;
                    }
                }
                break;
            }
            case 2:
            case 3: {
                switch (money) {
                    case 1: {
                        con = new Context(new BicycleTransport());
                        break;
                    }
                    case 2:
                    case 3: {
                        con = new Context(new TaxiTransport());
                        break;
                    }
                    default: {
                        System.out.println("Eat shit!");
                        break;
                    }
                }
                break;
            }
            default: {
                System.out.println("Wrong number! Restart the program!\n");
                break;
            }
        }

        System.out.println(con.exec());
    }
}
