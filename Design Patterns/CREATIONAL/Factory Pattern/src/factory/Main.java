
package factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- Factory Mobiles -----");
        System.out.println("\n--- Mobile Brands ---");
        System.out.println("1 - Apple");
        System.out.println("2 - Google");
        System.out.println("3 - Samsung");
        System.out.println("4 - All Brands");
        
        System.out.print("\nInput your brand (1/2/3/4) : ");
        String choice = scanner.nextLine();
        
        PhoneFactory phoneFactory = new PhoneFactory();
        InterfacePhone myPhone;
        
        switch(choice){
            case "1":
                System.out.println("\n-- Apple Phones --");
                myPhone = phoneFactory.getPhone("apple");
                myPhone.showSpec();
                break;
            case "2":
                System.out.println("\n-- Google Phones --");
                myPhone = phoneFactory.getPhone("google");
                myPhone.showSpec();
                break;
            case "3":
                System.out.println("\n-- Samsung Phones --");
                myPhone = phoneFactory.getPhone("samsung");
                myPhone.showSpec();
                break;
            case "4":
                System.out.println("\n-- All Brands --");
                System.out.println();
                
                myPhone = phoneFactory.getPhone("apple");
                myPhone.showSpec();
                System.out.println();
                
                myPhone = phoneFactory.getPhone("google");
                myPhone.showSpec();
                System.out.println();
                
                myPhone = phoneFactory.getPhone("samsung");
                myPhone.showSpec();
                
                break;
            default:
                System.out.println("Invalid input!");
        }
        
        
    }
    
}
