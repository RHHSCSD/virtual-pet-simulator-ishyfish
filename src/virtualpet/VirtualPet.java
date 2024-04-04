/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;

import java.util.Scanner;
import java.util.Random;

/* Virtual pet
 * Virtual pet simulator
 * Mar 3, 2024
 * Andrew
 */
public class VirtualPet {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        //variables
        final String USERNAME = "snoopy";
        final String PASSWORD = "toto";
        String pet = "";
        String petName = "";
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        final int startingPoints = 20;
        final int statMin = 4;

        //Starting screen
        System.out.println("    Birdsville");
        System.out.println("   (o)>     >(o)\n"
                + "  //_)       (_>");
        System.out.println("___________________");

        //login
        boolean loggedIn = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("User:");
            String user = keyboard.nextLine();

            System.out.println("Password:");
            String pass = keyboard.nextLine();

            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                loggedIn = true;
                break;
            } else {
                System.out.println('\n');
                System.out.println("Invalid login");
            }
        }

        if (loggedIn == true) {
            System.out.println('\n');
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
            System.exit(0);
        }

        //Menu
        boolean displayMenu = true;
        boolean createPet = false;
        boolean petGenerated = false;
        int menuSelect;

        while (displayMenu == true) {
            //menu before pet generated
            if (petGenerated == false) {
                System.out.println("___________________");
                System.out.println("Menu selection");
                System.out.println(" 1) Start");
                System.out.println(" 2) Instructions");
                System.out.println(" 3) Exit");

                menuSelect = keyboard.nextInt();

                if (menuSelect == 1) {
                    createPet = true;
                } else if (menuSelect == 2) {
                    System.out.println("___________________");
                    System.out.println("Instructions:");
                    System.out.println("ok");
                } else if (menuSelect == 3) {
                    System.out.println("___________________");
                    System.out.println("Game exited");
                    System.exit(0);
                } else {
                    System.out.println("invalid selection");
                }

                //create pet  
                if (createPet == true) {
                    System.out.println("___________________");
                    System.out.println("Choose a pet");
                    System.out.println(" 1) Puffin");
                    System.out.println(" 2) Duck");

                    int petSelection = keyboard.nextInt();
                    switch (petSelection) {
                        case 1:
                            pet = "puffin";
                            System.out.println("   (o)>\n"
                                    + "  //_)");
                            System.out.println("Puffin selected!");
                            break;
                        case 2:
                            pet = "duck";
                            System.out.println("   >(o)\n"
                                    + "    (_>");
                            System.out.println("Duck selected!");
                            break;
                        default:
                            System.out.println("invalid selection");
                    }

                    System.out.println("___________________");
                    System.out.println("Select naming option");
                    System.out.println(" 1) Create own name");
                    System.out.println(" 2) Generate random name");
                    int petNameOption = keyboard.nextInt();

                    if (petNameOption == 1) {
                        System.out.println("Enter pet Name:");
                        petName = keyboard.nextLine();
                        petName = keyboard.nextLine();
                    } //genreate random name
                    else if (petNameOption == 2) {
                        //name length of 4 or 6
                        int petNameLength = (random.nextInt(2) + 2) * 2;

                        //25% chance of double lettered name
                        boolean doubleLetters = false;
                        int ifDouble = random.nextInt(4);
                        if (ifDouble == 0) {
                            doubleLetters = true;
                        }

                        //generate name
                        for (int i = 0; i < petNameLength; i++) {
                            //yes double letters (vowels)
                            if (doubleLetters == true) {
                                if (i % 3 == 0) {
                                    if (i == 0) {
                                        petName += consonants.charAt(random.nextInt(21));
                                    } else {
                                        petName += petName.charAt(0);
                                    }
                                }
                                if (i % 3 == 1) {
                                    petName += vowels.charAt(random.nextInt(5));
                                }
                                if (i % 3 == 2) {
                                    petName += petName.charAt(i - 1);
                                }
                            } //no double letters
                            else {
                                //generate random consonant
                                if (i % 2 == 0) {
                                    petName += consonants.charAt(random.nextInt(21));
                                } //generate random vowel
                                else {
                                    petName += vowels.charAt(random.nextInt(5));
                                }
                            }
                        }
                    }

                    System.out.println("Your pet " + pet + ", " + petName + ", has been born!");

                    //generate random stats for pet
                    int hpStat = random.nextInt(startingPoints - 3 * statMin + 1) + statMin;
                    int foodStat = random.nextInt((startingPoints - hpStat) - 2 * statMin + 1) + statMin;
                    int energyStat = (startingPoints - hpStat - foodStat);

                    System.out.println(petName + "'s stats");
                    System.out.println(" Max HP: " + hpStat);
                    System.out.println(" Max food: " + foodStat);
                    System.out.println(" Max energy: " + energyStat);

                    petGenerated = true;
                }
            } //menu after pet generated
            else {
                System.out.println("___________________");
                System.out.println("Menu selection");
                System.out.println(" 1) Play");
                System.out.println(" 2) Instructions");
                System.out.println(" 3) Exit");

                menuSelect = keyboard.nextInt();

                boolean playGame = false;
                if (menuSelect == 1) {
                    playGame = true;
                } else if (menuSelect == 2) {
                    System.out.println("___________________");
                    System.out.println("Instructions:");
                    System.out.println("ok");
                } else if (menuSelect == 3) {
                    System.out.println("___________________");
                    System.out.println("Game exited");
                    System.exit(0);
                } else {
                    System.out.println("invalid selection");
                }
                
                if (playGame == true){
                    System.out.println("___________________");
                    System.out.println("Game selection");
                    System.out.println(" 1) Random number guess");
                    System.out.println(" 2) Card matching");
                    
                    int gameSelection = keyboard.nextInt();
                    
                    if (gameSelection == 1){
                        System.out.println("___________________");
                    }
                } 

            }

        }
    }

}
