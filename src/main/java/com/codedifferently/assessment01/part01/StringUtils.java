package com.codedifferently.assessment01.part01;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){

        String[] newStringArray = sentence.split(" ");
        return newStringArray;

    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){
        //turn String sentence into string array
        //loop through array
        // pull [0]

        String[] newStringArray = sentence.split(" ");
        return newStringArray[0];
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
      String[] newStringArray = sentence.split(" ");
      String firstLetter = newStringArray[0];
      StringBuilder reversedFirst = new StringBuilder(firstLetter);


      return reversedFirst.reverse().toString();
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){return null;}

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder removeChar = new StringBuilder(str);
        return removeChar.deleteCharAt(index).toString();
    }
}
