package com.tsi.Rivas.Alejandro.SaveThem;
import java.util.*;
import java.util.Scanner;


import static java.lang.Boolean.TRUE;

public class Gameplay {
    public final void Gameplay() throws InterruptedException {
        boolean Truth_Test = TRUE;
        Scanner gamePlay_Scanner = new Scanner(System.in);

        /// INTRODUCTION ///
        System.out.println("Alejandro: Welcome QualiTester! I'm in need of your help - Gareth has taken over the Hardware Institute Castle and he's taken Riccardo & Abu hostage to extort me of my Android shares!");
        Thread.sleep(600);
        System.out.println("Alejandro: It's too risky for me to enter as I didn't get my ISTQB certificate, but a certified QualiTester like yourself could take him down and save our mentors; I'll reward you with guestlist entry for my raves <3");
        Thread.sleep(600);

        // Role Selection //
        System.out.println("Alejandro: I should ask, what's your role within qualitesting?");
        System.out.println("Please Select: Brawler, Mage, Assassin");
        String character_Type = gamePlay_Scanner.nextLine();

        if (character_Type == "Brawler") {

            System.out.println("Name: " + Brawler.getName());
            System.out.println("HP: " + Brawler.getHP());
            System.out.println("AD: " + Brawler.getAD());
            Thread.sleep(600);

            System.out.println("You have three abilities, the first is " + Brawler.getAbility1() + ", which deals damage.");
            Thread.sleep(300);
            System.out.println("The second is " + Brawler.getAbility2() + ", which reduces damage taken from the next attack on you.");
            Thread.sleep(300);
            System.out.println("The third is " + Brawler.getAbility3() + ", which has a 50% chance of stunning your enemy, missing their fighting turn");
            Thread.sleep(300);
            System.out.println("Your special ability is " + Brawler.getSpecial_Ability());
            Thread.sleep(1000);

        }
        if (character_Type == "Mage") {

            System.out.println("Name: " + Mage.getName());
            System.out.println("HP: " + Mage.getHP());
            System.out.println("AD: " + Mage.getAD());
            Thread.sleep(600);

            System.out.println("You have three abilities, the first is " + Mage.getAbility1() + ", which deals damage.");
            Thread.sleep(300);
            System.out.println("The second is " + Mage.getAbility2() + ", which protects you from the enemy's next attack.");
            Thread.sleep(300);
            System.out.println("The third is " + Mage.getAbility3() + ", which reduces the enemy's attack damage");
            Thread.sleep(300);
            System.out.println("Your special ability is " + Mage.getSpecial_Ability());
            Thread.sleep(1000);

        }
        if (character_Type == "Assassin") {

            System.out.println("Name: " + Assassin.getName());
            System.out.println("HP: " + Assassin.getHP());
            System.out.println("AD: " + Assassin.getAD());
            Thread.sleep(600);

            System.out.println("You have three abilities, the first is " + Assassin.getAbility1() + ", which deals melee damage.");
            Thread.sleep(300);
            System.out.println("The second is " + Assassin.getAbility2() + ", which deals long range damage.");
            Thread.sleep(300);
            System.out.println("The third is " + Assassin.getAbility3() + ", which allows you to see in the dark");
            Thread.sleep(300);
            System.out.println("Your special ability is " + Brawler.getSpecial_Ability());
            Thread.sleep(1000);

        }

        System.out.println("Will you help me?" + "/n" + "Y / N");
        String will_they_help = gamePlay_Scanner.nextLine();
        if (will_they_help == "Y") {
            System.out.println("Amazing thank you! I'll get you inside, there may be items around that could help you with the mission");
        }

        if (Rooms.getStarter_Room()) {
        System.out.println("");

        }


    }
}