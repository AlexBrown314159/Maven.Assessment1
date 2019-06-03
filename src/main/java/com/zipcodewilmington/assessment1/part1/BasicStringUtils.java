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
           //***********************************   fix
        str2.toUpperCase();

        str1 = str1.substring(1);
        str2 = str2.substring(0,1);

              str2.toUpperCase();

        str3 = str2.concat(str1);

             System.out.println(str);
              System.out.println(str1);
                      System.out.println(str2);
        System.out.println(str3);

        return str3;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        Integer l;
        l = str.length();
        String str2;
        char l2;

          for (Integer i = 0; i < l; i++) {

             //    l2 = str.toChar();
              
          }



        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }
}
