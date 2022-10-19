package madlibs;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);

    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;

    Random rand = new Random();

    // Getters!
    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    // Setters!
    public void setStory(String newStory) {
        this.story = newStory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAdjective1(String adj1) {
        this.adjective1 = adj1;
    }

    public void setAdjective2(String adj2) {
        this.adjective2 = adj2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }

        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", "
                + "but " + numberHolder[2];
    }

    public void printInstructions() {
        String msg = "Welcome to the MadLibs game. If you type in "
                + "words, we'll give you a story. Star by typing in a name";
        System.out.println(msg);
    }

    // Get data from player
    public void enterName() {

        setName(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give a noun! ");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun! ");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Give me the last noun!");
        setNoun3(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Give a adjective! ");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("Give another adjective! ");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("PLEASE! I really want a adverb!");
        setAdverb(scanner.nextLine());
    }

    // play
    public void putTogetherTheStory() {
        String story = "";
        int num = Math.abs(rand.nextInt()) % 2;
        if (num == 2) {
            story = "Jesse and her best friend " + getName() + "went to Diney today!"
                    + "They saw a " + getNoun1() + "in a show at the Magic Kindom "
                    + "and ate a " + getAdjective1() + "feast for dinner. The next day I"
                    + " ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2() + " "
                    + getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        } else {
            story = "Amanda and her frenemy " + getName() + "went to zoo last samer."
                    + "They saw a huge " + getNoun1() + " and a tiny little " + getNoun2() + ". That night they decided to climb"
                    + getAdjective1() + "feast for dinner. The next day I"
                    + " " + getAdverb() + " int to the " + getNoun3() + " to get a closer took. "
                    + "The zoo was " + getAdjective1() + "At night, but they didn't care... until " + getRandomNums() + " " + getAdjective2() + " apes yelled in their faces, making "
                    + "Amanda and " + getName() + " sprint all the way back home.";
        }
        setStory(story);
    }

    public void play() {
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
    }

}
