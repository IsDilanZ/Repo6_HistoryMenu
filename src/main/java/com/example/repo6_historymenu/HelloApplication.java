package com.example.repo6_historymenu;
import java.util.*;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the interactive adventure!");
        System.out.println("A war unleashed in the ancient demon kingdom where a legendary hero sacrificed his life to save the world. It is hinted that this hero will be reborn in times of need. A Typical Day in a Remote Village on a Rainy Night with Thunder.");
        System.out.println("reborn (yes/no)");
        String decision = scanner.nextLine();

        if (decision.equalsIgnoreCase("yes")) {
            System.out.println("You decide to help her? (yes/no)");
            String helpHer = scanner.nextLine();

            if (helpHer.equalsIgnoreCase("no")) {
                displayHeroMessage();

            }else if (helpHer.equalsIgnoreCase("yes")) {
                System.out.println("Because you thought she was pretty? (yes/no)");
                String thoughtPretty = scanner.nextLine();

                if (thoughtPretty.equalsIgnoreCase("yes")) {
                    displayHeroMessage();
                } else {
                    System.out.println("So you didn't want her to be hurt? (yes/no)");
                    String dontWantHurt = scanner.nextLine();

                    if (dontWantHurt.equalsIgnoreCase("yes")) {
                        displayHeroMessage();
                    }
                }
            }

        }scanner.close();
    }
    private static void displayHeroMessage() {
        System.out.println("At that moment, everyone is scared to see that you appeared out of nowhere.");
        System.out.println("Everyone runs away feeling your power");
        System.out.println("Upon being saved, the girl tells you that a prophecy foretold the appearance of a hero and believes you are that hero.");
    }

}

