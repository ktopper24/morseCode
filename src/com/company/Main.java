package com.company;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hashtable<Character,String> morseCode = new Hashtable<Character, String>();
        morseCode = createMorseCode();
        Hashtable<String, Character> textCode = new Hashtable<>();
        textCode = createTextCode(morseCode);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        input.close();
        name = name.toLowerCase();
        ArrayList<String> codedName = toCode(name, morseCode);
        System.out.println(codedNameToString(codedName));
        System.out.println(toText(codedName, textCode));



    }
    private static Hashtable<Character,String> createMorseCode() {

        Hashtable<Character, String> morseCode = new Hashtable<>();
        morseCode.put('a', ".-");
        morseCode.put('b', "-...");
        morseCode.put('c', "-.-.");
        morseCode.put('d', "-..");
        morseCode.put('e', ".");
        morseCode.put('f', "..-.");
        morseCode.put('g', "--.");
        morseCode.put('h', "....");
        morseCode.put('i', "..");
        morseCode.put('j', ".---");
        morseCode.put('k', "-.-");
        morseCode.put('l', ".-..");
        morseCode.put('m', "--");
        morseCode.put('n', "-.");
        morseCode.put('o', "---");
        morseCode.put('p', ".--.");
        morseCode.put('q', "--.-");
        morseCode.put('r', ".-.");
        morseCode.put('s', "...");
        morseCode.put('t', "-");
        morseCode.put('u', "..-");
        morseCode.put('v', "...-");
        morseCode.put('w', ".--");
        morseCode.put('x', "-..-");
        morseCode.put('y', "-.--");
        morseCode.put('z', "--..");
        morseCode.put('1', ".----");
        morseCode.put('2', "..---");
        morseCode.put('3', "...--");
        morseCode.put('4', "....-");
        morseCode.put('5', ".....");
        morseCode.put('6', "-....");
        morseCode.put('7', "--...");
        morseCode.put('8', "---..");
        morseCode.put('9', "----.");
        morseCode.put('0', "-----");
        morseCode.put(' ', "   ");

        return morseCode;
    }

    private static Hashtable<String, Character> createTextCode(Hashtable<Character, String> morseCode) {
        Hashtable<String, Character> text = new Hashtable<>();
        for (Character key: morseCode.keySet()) {
            text.put(morseCode.get(key), key );
        }
        return text;
    }

    private static ArrayList<String> toCode(String name, Hashtable<Character,String> morseCode) {
        ArrayList<String> codedName = new ArrayList<>();
        for (char c: name.toCharArray()) {
            codedName.add(morseCode.get(c));
        }
        return codedName;
    }

    private static String codedNameToString(ArrayList<String> codedName) {
        StringBuilder name = new StringBuilder();
        for (String s: codedName) {
            name.append(s);
        }
        return name.toString();
    }

    private static String toText(ArrayList<String> codedName, Hashtable textCode) {
        StringBuilder name = new StringBuilder();
        for (String s: codedName) {
            name.append(textCode.get(s));
        }
        return name.toString();
    }

}
