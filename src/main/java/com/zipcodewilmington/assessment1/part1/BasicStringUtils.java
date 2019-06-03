package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String str1, str2, str3;

        str1 = str;
        str2 = str;

        str1 = str1.substring(1);
        str2 = str2.substring(0,1);

        str3 = str2.toUpperCase();

        return str3.concat(str1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String str2 = "";
        char c;

        for (Integer i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            str2 = c + str2;

        }

        return str2;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String str2 = "";
        String str1 = "";
        char c;

        for (Integer i = 0; i < str.length()-1; i++) {
            c = str.charAt(i);
            str2 = c + str2;
        }

        str1 = str.toUpperCase();
        c = str1.charAt(str.length()-1);

        str2 = c + str2;



        return str2;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String str2 = "";

        str2 = str.substring(1,str.length()-1);


        System.out.println(str2);

        return str2;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
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
    }
}
