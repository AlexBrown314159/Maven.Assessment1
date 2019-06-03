package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        Integer words = 0;
        Integer iCount = 0;
        String str = "";
        Integer pt1 = 0;
        Integer pt2 = 0;

        for (Integer i = 0; i < sentence.length(); i++) {
            str = sentence.substring(i, i+1);
            if (str == " ") {
                words++;
            }
        }

        String[] ans = new String[words + 1];


        for (Integer i = 0; i < sentence.length(); i++) {
            str = sentence.substring(i, i+1);
            if (str == " ") {
                pt2 = i + 1;
                ans[iCount] = sentence.substring(pt1, pt2);
                System.out.println(ans[iCount]);
                pt1 = pt2 + 1;
                iCount++;
            }
        }
//      ==========================    fix
        return ans;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        Integer words = 0;
        Integer iCount = 0;
        char myC;
        String str = "";
        String str2 = "";
        Integer pt1 = 0;
        Integer pt2 = 0;
/*
        for (Integer i = 0; i < sentence.length(); i++) {
            str = sentence.substring(i, i+1);
            if (str == " ") {
                words++;
            }
        }

        String[] ans = new String[words + 1];

*/
        for (Integer i = 0; i < sentence.length(); i++) {
            myC = sentence.charAt(i);
            System.out.println(myC);
            str = "" + myC;
            if (str == " ") {
                System.out.println("hit");
                pt2 = i;
                str2 = sentence.substring(pt1, pt2);
                System.out.println("--- " + str2 + " ---");
                break;
          //      pt1 = pt2 + 1;
          //      iCount++;
            }
        }
//      ==========================    fix
        return str2;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        return null;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        return null;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        return null;
    }

}
