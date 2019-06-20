import java.util.Scanner;
import java.util.*;

public class ZorkGame {
    private static int noRoomVisted = 0, goRoom = 1;

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Do you want to play the Zork (Y/N)?");
        String msg = keyboard.nextLine();
        char direction = msg.charAt(0);


        boolean flag = true;

        if ((direction == 'y') || (direction == 'Y')) {
            // start the game
            while (flag) {
                System.out.println("Which direction would you like to go (N,E,W,S)? Type Q to quit.");
                msg = keyboard.nextLine();
                direction = msg.charAt(0);

                if ((direction == 'Q') || (direction == 'q'))
                    goRoom = -1;

                switch (goRoom) {
                    case 1:
                        gotoRoom1(direction);
                        break;
                    case 2:
                        gotoRoom2();
                        break;
                    case 3:
                        gotoRoom3(direction);
                        break;
                    case 4:
                        gotoRoom4();
                        break;
                    case 5:
                        gotoRoom5(direction);
                        break;
                    case 6:
                        gotoRoom6(direction);
                        break;
                    case 7:
                        gotoRoom7(direction);
                        break;
                    default:
                        System.out.println("quit");
                        flag = false;
                        break;
                }
            }
            
        }
        else
            System.out.println("Maybe next time....");

        System.out.println("no room visted is "+ noRoomVisted);
    }

    public static void gotoRoom1(char dir){


        System.out.println("I am in room 1");


        switch (dir) {
            case 'N':
            case 'n':
                goRoom = 2;
                noRoomVisted++;
                break;

            default:
                goRoom = 1;
                break;
        }
        System.out.println("done with room1");

    }

    public static void gotoRoom2(char dir) {
        noRoomVisted++;
        System.out.println("I am in room 2");

    }

    public static void gotoRoom3(char dir) {
        noRoomVisted++;
        System.out.println("I am in room 3");
    }

    public static void gotoRoom4(char dir) {
        noRoomVisted++;
        System.out.println("I am in room 3");

    }
    public static void gotoRoom5(char dir) {

        System.out.println("I am in room 5");


        switch (dir) {
            case 'S':
            case 's':
                goRoom = 3;
                noRoomVisted++;
                break;
            default:
                goRoom = 5;
                break;
        }
    }

    public static void gotoRoom6(char dir){

        switch (dir) {
            case 'E':
            case 'e':
                Random rnd = new Random();
                int chance = rnd.nextInt(4)+1;
                if (chance == 1){
                    goRoom = 8;
                    noRoomVisted++;
                } else {
                goRoom = 7;
                noRoomVisted++;
                }
                break;
            default:
                goRoom = 6;
                break;
        }

        System.out.println("I am in room 6");


    }
    public static void gotoRoom7(char dir){

        switch (dir) {
            case 'W':
            case 'w':
                goRoom = 6;
                noRoomVisted++;
                break;
            case 'S':
            case 's':
                goRoom = 4;
                noRoomVisted++;
                break;
            default:
                goRoom = 7;
                break;

        }
            System.out.println("I am in room 7");



        }
        public static void gotoRoom8(char dir){

            switch (dir) {
                case 'E':
                case 'e':
                    goRoom = 6;
                    noRoomVisted++;
                    break;
                default:
                    goRoom = 8;
                    break;

            }
            System.out.println("I am in the secret room!");
        }

    }

