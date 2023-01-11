
package facade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- Facade Mobiles -----");
        System.out.println("\n--- Mobile Brands ---");
        System.out.println("1 - Apple");
        System.out.println("2 - Google");
        System.out.println("3 - Samsung");
        System.out.println("4 - All Brands");
        
        System.out.print("\nInput your brand (1/2/3) : ");
        String choice = scanner.nextLine();
        
        PhoneFacade phoneFacade = new PhoneFacade();
        
        switch(choice){
            case "1":
                System.out.println("\nApple Phones");
                phoneFacade.getApple();
                break;
            case "2":
                System.out.println("\nGoogle Phones");
                phoneFacade.getGoogle();
                break;
            case "3":
                System.out.println("\nSamsung Phones");
                phoneFacade.getSamsung();
                break;
            case "4":
                System.out.println("\nAll Brands");
                phoneFacade.getAllPhones();
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
    
}
