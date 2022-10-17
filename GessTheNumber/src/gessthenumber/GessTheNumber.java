/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GessTheNumber {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max - 1);
        
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("You got it bro");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is is out of range");
        }
    }

    public static void main(String[] args) {
        GessTheNumber gessGame = new GessTheNumber();
        System.out.println("Welcome to my game. Try and guess me impossible"
        + " number. It's between 0 and " + gessGame.max + " inclusive. Just type"
                + " the number to get started.");
        gessGame.play();
    }

}
