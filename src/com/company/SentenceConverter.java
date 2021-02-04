package com.company;

public class SentenceConverter {

    private static final String problemDescription = "Skriv en metode,der tager imod en sætning af ord med mellemrum " +
            "imellem. Sætningen ændres efter følgende regler:" +
            "•Ord,som udelukkende er skrevet med store bogstaver,skal ikke ændres." +
            "•Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav." +
            "•Ord på max.3 bogstaver skal skrives med småt.";

    public static String convertSentence(String sentence) {
        String[] words = sentence.split("\\s");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(words[i].toUpperCase())) {

            }

            else if (words[i].length() > 3) {
                String firstChar = words[0].substring(0, 1);
                firstChar = firstChar.toUpperCase();
                String restOfWord = words[i].substring(1);
                restOfWord = restOfWord.toLowerCase();

                words[i] = firstChar + restOfWord;
            }

            else {
                words[i] = words[i].toLowerCase();
            }
        }

        String finalSentence = "";

        for (String word: words) {
            finalSentence = finalSentence + word + " ";
        }

        return finalSentence;
    }

    public static void printProblemDescription() {
        System.out.println(problemDescription);
    }
}
