package com.company;

import java.util.*;
public class Week3 {

    public static void main(String[] args){
//        System.out.println("sum: " + sum(4, 3, 6, 1));
//        System.out.println("Least: " + least(9, 7));
//        System.out.println("Greatest: " + greaTest(14, 7, 3));
//        System.out.println("average: " + average(4, 3, 6, 1));
//        nameLength();
//        nameFirstCharacter();
//        nameLastCharacter();
//        firstThreeCharacters();
//        separatedCharacters();
//        reversedName();
//        firstPart();
//        lastPart();
//        wordContainedInside();
          /*System.out.print("Type in your text: ");
          String text = com.company.Week1.StringReader();
          System.out.println("In reverse order: " + reverse(text));*/
//        echoWords();
//        recurringWord();
//        echoWordsReverse();
//        echoWordsAlphabetical();
        /*ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));*/
        /*ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

        Collections.sort(brothers);

        removeLast(brothers);

        System.out.println(brothers);*/
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(3);list.add(2);list.add(7);list.add(2);

        /*System.out.println("The sum: " + sum(list));
        System.out.println("The average is: " + average(list));

        list.add(10);

        System.out.println("the sum: " + sum(list));*/
        /*ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the strings: " + lengths);*/

//        System.out.println("The greatest number is: " + greatest(list));
//        System.out.println("The variance is: " + variance(list));
        /*System.out.print("Type a number: ");
        int number = com.company.Week1.IntReader();
        if (moreThanOnce(list, number)){
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }*/
        /*System.out.print("Type a text: ");
        String text = com.company.Week1.StringReader();
        if (palindrome(text)){
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }*/
    }

    private static int sum(int number1, int number2, int number3, int number4){
        return number1 + number2 + number3 + number4;
    }


    private static int least (int number1, int number2){
        return Math.min(number1, number2);
    }

    private static int greaTest(int number1, int number2, int number3){
        int number4 = Math.max(number1, number2);
        return Math.max(number4, number3);
    }

    private static double average(int num1, int num2, int num3, int num4){
        return (sum(num1, num2, num3, num4)/4.0);
    }

    private static void nameLength(){
        System.out.print("Type your name: ");
        String input = Week1.StringReader();
        System.out.println("Number of characters: " + calculateCharacters(input));
    }

    private static int calculateCharacters(String text){
        return text.length();
    }

    private static void nameFirstCharacter(){
        System.out.print("Type your name: ");
        String input = Week1.StringReader();
        System.out.println("First character: " + firstCharacter(input));
    }

    private static char firstCharacter(String text){
        return text.charAt(0);
    }

    private static void nameLastCharacter() {
        System.out.print("Type your name: ");
        String input = Week1.StringReader();
        System.out.println("Last character: " + lastCharacter(input));
    }

    private static char lastCharacter(String text){
        return text.charAt(text.length()-1);
    }

    private static void firstThreeCharacters(){
        System.out.print("Type your name: ");
        String input = Week1.StringReader();

        if (input.length() >= 3){
            for (int i = 0; i < 3; i++){
                char c = input.charAt(i);
                System.out.println((1 + i) + ". character: " + c);
            }
        }
    }

    private static void separatedCharacters(){
        System.out.print("Type your name: ");
        String input = Week1.StringReader();
        int i = 0;

        while (i < input.length()){
            System.out.println((1 + i) + ". character: " + input.charAt(i));
            i++;
        }
    }

    private static void reversedName(){
        System.out.print("Type your name: ");
        String input = Week1.StringReader();
        int i = (input.length()-1);
        System.out.print("In reverse order: ");

        while(i >= 0){
            System.out.print(input.charAt(i));
            i--;
        }
    }

    private static void firstPart(){
        System.out.print("Type a word: ");
        String input = Week1.StringReader();
        System.out.print("Length of the first part: ");
        int first = Week1.IntReader();

        System.out.println("Result: " + input.substring(0,first));
    }

    private static void lastPart(){
        System.out.print("Type a word: ");
        String input = Week1.StringReader();
        System.out.print("Length of the end part: ");
        int last = input.length() - Week1.IntReader();

        System.out.println("Result: " + input.substring(last));
    }

    private static void wordContainedInside(){
        System.out.print("Type the first word: ");
        String word1 = Week1.StringReader();
        System.out.print("Type the second word: ");
        String word2 = Week1.StringReader();

        if (word1.indexOf(word2) == -1){
            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'.");
        } else {
            System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'.");
        }
    }

    private static String reverse(String text){
        String help = "";
        int i = text.length()-1;

        while (i >= 0){
            help += text.charAt(i);
            i--;
        }
        return help;
    }

    private static void echoWords(){
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Type a word: ");
            String input = Week1.StringReader();

            if (input.isEmpty()){
                break;
            } else {
                words.add(input);
            }
        }

        System.out.println("You types the following words: ");
        for (String word: words){
            System.out.println(word);
        }
    }

    private static void recurringWord(){
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Type a word: ");
            String input = Week1.StringReader();

            if (words.contains(input)){
                System.out.println("You gave the word " + input + " twice");
                break;
            } else {
                words.add(input);
            }
        }
    }

    private static void echoWordsReverse(){
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Type a word: ");
            String input = Week1.StringReader();

            if (input.isEmpty()){
                break;
            } else {
                words.add(input);
            }
        }

        Collections.reverse(words);
        System.out.println("You types the following words: ");
        for (String word: words){
            System.out.println(word);
        }
    }

    private static void echoWordsAlphabetical(){
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Type a word: ");
            String input = Week1.StringReader();

            if (input.isEmpty()){
                break;
            } else {
                words.add(input);
            }
        }

        Collections.sort(words);
        System.out.println("You types the following words: ");
        for (String word: words){
            System.out.println(word);
        }
    }

    private static int countItems(ArrayList<String> list){
        return list.size();
    }

    private static void removeLast(ArrayList<String> list){
        list.remove(list.size()-1);
    }

    private static int sum(ArrayList<Integer> list){
        int sum = 0;
        for (int i:list) {
            sum += i;
        }
        return sum;
    }

    private static double average(ArrayList<Integer> list){
        return ((double)sum(list))/(list.size());
    }

    private static ArrayList<Integer> lengths(ArrayList<String> list){
        ArrayList<Integer> lengths = new ArrayList<Integer>();

        for (String word:list) {
            lengths.add(word.length());
        }

        return lengths;
    }

    private static int greatest(ArrayList<Integer> list){
        int max = 0;
        for (int i:list) {
            max = Math.max(max, i);
        }
        return max;
    }

    private static double variance(ArrayList<Integer> list){
        double mean = average(list);

        double sum = 0;

        for (int number:list) {
            sum += Math.pow(number - mean, 2);
        }

        return sum / (list.size()-1);
    }

    private static boolean moreThanOnce(ArrayList<Integer> list, int number){
        int counter = 0;

        for (int i:list) {
            if (i == number){
                counter++;
            }
        }

        if (counter >= 2){
            return true;
        } else {
            return false;
        }
    }

    private static boolean palindrome(String text){
        if(text.equals(reverse(text))){
            return true;
        } else {
            return false;
        }
    }
}
