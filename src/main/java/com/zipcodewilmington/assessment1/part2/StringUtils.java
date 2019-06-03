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

     /*
             String myStr = "";
        char myC;

        for (Integer i = 0; i < str.length(); i++) {

            myC = str.charAt(i);
            if (Character.isWhitespace(myC)) {

            }
            else if (Character.isUpperCase(myC)) {
                myC = Character.toLowerCase(myC);
            }
            else if (Character.isLowerCase(myC)) {
                myC = Character.toUpperCase(myC);
            }
            myStr = myStr + myC;
            }

        return myStr;

  */
        Integer words = 0;
        Integer iCount = 0;
        String str = "";
        Integer pt1 = 0;
        Integer pt2 = 0;
        char myC;

        for (Integer i = 0; i < sentence.length(); i++) {
            myC = sentence.charAt(i);
            if (Character.isWhitespace(myC)) {
                words++;
            }
        }

        String[] ans = new String[words + 1];

        System.out.println(words+1);

            iCount = 0;
            for (Integer i = 0; i < sentence.length(); i++) {
                myC = sentence.charAt(i);
                if (Character.isWhitespace(myC)) {
                    pt2 = i;
                    ans[iCount] = sentence.substring(pt1, pt2);
                    System.out.println(ans[iCount]);
                    pt1 = pt2 + 1;
                    iCount++;
                }
            }


            ans[iCount] = sentence.substring(pt1);


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
        String str = "";
        Integer pt1 = 0;
        Integer pt2 = 0;
        char myC;

        iCount = 0;
        for (Integer i = 0; i < sentence.length(); i++) {
            myC = sentence.charAt(i);
            if (Character.isWhitespace(myC)) {
                pt2 = i;
                str = sentence.substring(pt1, pt2);
                break;
            }
        }

        return str;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        Integer words = 0;
        Integer iCount = 0;
        String str = "";
        String str2 ="";
        Integer pt1 = 0;
        Integer pt2 = 0;
        char myC;

        iCount = 0;
        for (Integer i = 0; i < sentence.length(); i++) {
            myC = sentence.charAt(i);
            if (Character.isWhitespace(myC)) {
                pt2 = i;
                str = sentence.substring(pt1, pt2);
                break;
            }
        }
            System.out.println(str);

        for (Integer i = 0; i < str.length(); i++) {
            myC = str.charAt(i);

            str2 = myC + str2;

        }


        return str2;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        Integer words = 0;
        Integer iCount = 0;
        String str = "";
        String str2 ="";
        Integer pt1 = 0;
        Integer pt2 = 0;
        char myC;

        iCount = 0;
        for (Integer i = 0; i < sentence.length(); i++) {
            myC = sentence.charAt(i);
            if (Character.isWhitespace(myC)) {
                pt2 = i;
                str = sentence.substring(pt1, pt2);
                break;
            }
        }
        System.out.println(str);

        for (Integer i = 0; i < str.length(); i++) {
            myC = str.charAt(i);

            if (i == str.length()-1) {
                myC = Character.toUpperCase(myC);
            }



            str2 = myC + str2;

        }


        return str2;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        char myC;
        String str2 = "";

        for (Integer i = 0; i < str.length(); i++) {
            myC = str.charAt(i);

            if (i != index) {
                str2 = str2 + myC;
            }

        }

        return str2;
    }

}
