package com.example.repo6_historymenu;
import java.util.*;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("Welcome to the interactive adventure!");
            System.out.println("A war unleashed in the ancient demon kingdom where a legendary hero sacrificed his life to save the world. It is hinted that this hero will be reborn in times of need. A Typical Day in a Remote Village on a Rainy Night with Thunder.");
            System.out.println("Be reborn? (yes/no)");
            String decision = scanner.nextLine();

            if (decision.equalsIgnoreCase("yes")) {
                System.out.println("You decide to help her? (yes/no)");
                String helpHer = scanner.nextLine();

                if (helpHer.equalsIgnoreCase("no")) {
                    displayHeroMessage(scanner);

                } else if (helpHer.equalsIgnoreCase("yes")) {
                    System.out.println("Because you thought she was pretty? (yes/no)");
                    String thoughtPretty = scanner.nextLine();

                    if (thoughtPretty.equalsIgnoreCase("yes")) {
                        displayHeroMessage(scanner);
                    } else {
                        System.out.println("So you didn't want her to be hurt? (yes/no)");
                        String dontWantHurt = scanner.nextLine();

                        if (dontWantHurt.equalsIgnoreCase("yes")) {
                            displayHeroMessage(scanner);
                        }
                    }
                }
            }

            System.out.println("Do you want to restart the adventure? (yes/no)");
            String restartDecision = scanner.nextLine();
            if (!restartDecision.equalsIgnoreCase("yes")) {
                repeat = false;
            }
        }
        scanner.close();
    }

    private static void displayHeroMessage(Scanner scanner) {
        System.out.println("At that moment, everyone is scared to see that you appeared out of nowhere.");
        System.out.println("Everyone runs away feeling your power");
        System.out.println("Upon being saved, the girl tells you that a prophecy foretold the appearance of a hero and believes you are that hero.");
        System.out.println("She asks if you would like to go see the king? (yes/no)");
        String asks = scanner.nextLine();

        if (asks.equalsIgnoreCase("no")) {
            embark(scanner);
            reborn(scanner);

        } else if (asks.equalsIgnoreCase("yes")) {
            System.out.println("Upon arriving at the kings court you are greeted by a band of loyal allies, ready to embark on your journey with their unwavering support");
            System.out.println("Days later during a battle against a horde of demons, you and your allies are ambushed");
            System.out.println("Do you decide to escape alone or stay with them? (yes/no)");
            String days = scanner.nextLine();

            if (days.equalsIgnoreCase("no")) {
                System.out.println("Would you face the Demon King with your allies? (yes/no)");
                String King = scanner.nextLine();

                if(King.equalsIgnoreCase("yes")){
                    everyone(scanner);
                } else if(King.equalsIgnoreCase("no")){
                    System.out.println("They would end up dead at the hands of the demons");
                    reborn(scanner);
                }

            } else if (days.equalsIgnoreCase("yes")) {
                System.out.println("As you escape you encounter the demon king. You decide to sacrifice yourself to kill him? (yes/no)");
                String escape = scanner.nextLine();
                if (escape.equalsIgnoreCase("yes")) {
                    System.out.println("By sacrificing yourself you break the cycle saving the people you care about and thus achieving a heroic goal");
                    end(scanner);
                } else if (escape.equalsIgnoreCase("no")){
                    everyone(scanner);
                    reborn(scanner);
                }
            }
        }
    }

    private static void embark(Scanner scanner) {
        System.out.println("You embark on discovering the new world");
        System.out.println("One day demons attack your village you try to fight but they are too many and you are killed");
    }

    private static void everyone(Scanner scanner) {
        System.out.println("Unfortunately everyone dies");
    }

    private static void reborn(Scanner scanner) {
        System.out.println("You are reborn again");
    }

    private static void end(Scanner scanner) {
        System.out.println("End");
    }
}
