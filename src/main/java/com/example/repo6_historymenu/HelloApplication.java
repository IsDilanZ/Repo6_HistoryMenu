package com.example.repo6_historymenu;
import java.util.*;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decision;
        System.out.println("Welcome to the interactive adventure!");
        System.out.println("A war unleashed in the ancient demon kingdom where a legendary hero sacrificed his life to save the world. It is hinted that this hero will be reborn in times of need. A Typical Day in a Remote Village on a Rainy Night with Thunder.");
        System.out.println("reborn  ---> ¿Quieres explorar el bosque? (s/n)");

        decision = scanner.nextLine();

        if (decision.equalsIgnoreCase("s")) {
            System.out.println("Amidst a throng of demons chasing a girl");
            System.out.println("You decide to help her?(s/n)");
            decision = scanner.nextLine();

            if (decision.equalsIgnoreCase("s")) {
                System.out.println("Because you thought she was pretty (s/n)");
                decision = scanner.nextLine();

                if (decision.equalsIgnoreCase("s")) {
                    System.out.println("At that moment everyone is scared to see that toy appeared out of nowhere");
                    System.out.println("Everyone runs away feeling your power");
                    System.out.println("Upon being saved the girl tells you that a prophecy foretold the appearance of a hero and believes you are that hero");

                    if (decision.equalsIgnoreCase("s")) {
                        System.out.println("She ask if you would like to go see the king   (s/n)");
                        decision = scanner.nextLine();

                        if (decision.equalsIgnoreCase("s")) {
                            System.out.println("Upon arriving at the kings cout you are greeted by a band of loyal, ready to embark on your journey with their unwavering support");
                            System.out.println("Days later during a battle a horde of demons, you and your allies are ambushed");

                            if (decision.equalsIgnoreCase("s")) {
                                System.out.println("Do you decide to escape alone or stay with them) (s/n)");
                                decision = scanner.nextLine();

                                if (decision.equalsIgnoreCase("s")) {
                                    System.out.println("As you escape you encounter the demon king to sacrifice yourself to kill him? (s/n)");
                                    decision = scanner.nextLine();

                                    if (decision.equalsIgnoreCase("s")) {
                                        System.out.println("By sacrificing yourself you break the cycle saving the people you care about and thus achieving heroic goal");
                                        System.out.println("END");
                                    }
                                }
                            }

                        }
                    }
                }
            }
            scanner.close();
        }
    }
}
