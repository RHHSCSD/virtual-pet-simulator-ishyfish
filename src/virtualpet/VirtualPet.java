/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;
import java.util.Scanner;

/* Virtual pet
 * Virtual pet simulator
 * Mar 3, 2024
 * Andrew
*/
public class VirtualPet {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //variables
        String pet;
        
        //Menu
        System.out.println("    Birdsville");
        System.out.println("   (o)>     >(o)\n" +
                           "  //_)       (_>");
        System.out.println("___________________");
        System.out.println("Menu Selection");
        System.out.println(" 1) Start");
        System.out.println(" 2) Instructions");
        System.out.println(" 3) Exit");

        int menuSelect = keyboard.nextInt();

        if (menuSelect == 1){
            System.out.println("___________________");
            System.out.println("Choose a pet");
            System.out.println(" 1) Puffin");
            System.out.println(" 2) Duck");
            
            int petSelection = keyboard.nextInt();
            switch(petSelection){
                case 1:
                   pet = "puffin";
                   System.out.println("   (o)>\n" +
                                      "  //_)");
                   System.out.println("Puffin selected!");
                   break;
                case 2:
                   pet = "duck";
                   System.out.println("   >(o)\n" +
                                      "    (_>");
                   System.out.println("Duck selected!");
                   break;
                default:
                    System.out.println("invalid selection");
            }
        }
        else if (menuSelect == 2){
            System.out.println("___________________");
            System.out.println("Instructions:");
            System.out.println("ok");
        }
        else if (menuSelect == 3){
            System.out.println("___________________");
            System.out.println("Game exited");
            System.exit(0);
        }
        else{
            System.out.println("invalid selection");
        }
            




   }
    
}
