package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/three-month-preparation-kit-camel-case/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one
*/
public class CamelCase {

    public static void main(String[] args) {
        /*
        S;M;plasticCup()
        C;V;mobile phone
        C;C;coffee machine
        S;C;LargeSoftwareBook
        C;M;white sheet of paper
        S;V;pictureFrame

        --first char
        S = split
        C = combine

        --next char
        M = method
        C = class
        V = variable
        */

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String[] tokens = splitBasedOnSemiColon(input);
            String finalText = takeAction(tokens[0], tokens[1], tokens[2]);
            System.out.println(finalText);
        }

    }

    private static String takeAction(String action, String type, String text) {
        StringBuilder output = new StringBuilder();
        char[] charArray = text.trim().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if ("C".equalsIgnoreCase(action)) {
                if (!" ".equalsIgnoreCase(String.valueOf(c))) {
                    if (i > 0 && " ".equalsIgnoreCase(String.valueOf(charArray[i - 1]))) {
                        output.append(Character.toUpperCase(c));
                    } else {
                        output.append(c);
                    }
                }
            } else if ("S".equalsIgnoreCase(action)) {
                if ("(".equalsIgnoreCase(String.valueOf(c)) || ")".equalsIgnoreCase(String.valueOf(c))) {
                    output.append("");
                } else if (Character.isUpperCase(c)) {
                    output.append(i > 0 ? " " : "").append(Character.toLowerCase(c));
                } else {
                    output.append(c);
                }
            }
        }

        if ("M".equalsIgnoreCase(type) && "C".equalsIgnoreCase(action)) {
            output.append("()");
        } else if ("C".equalsIgnoreCase(type) && "C".equalsIgnoreCase(action)) {
            output.setCharAt(0, Character.toUpperCase(output.charAt(0)));
        }

        return output.toString().trim();
    }

    private static String[] splitBasedOnSemiColon(String input) {
        return input.split(";");
    }

}
