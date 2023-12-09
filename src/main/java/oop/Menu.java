package oop;

import java.util.Scanner;

class Menu{

    
    public Menu(){
        int choice;
        System.out.println("1. Show Events");
        System.out.println("2. Update Events");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        do {
            System.out.println("1. Show Events");
            System.out.println("2. Update Events");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                case 1:
                    Event.showEvents();
                    break;
                case 2:
                    Event.updateEvents();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
        
    

}