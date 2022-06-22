package com.codedifferently.assessment01.part05;
import java.util.*;
import static java.lang.Character.*;

public class Palindrome {
    public Integer countPalindromes(String input){
        int count = 0;
        StringBuilder newInput = new StringBuilder(input);
        String reversed = newInput.reverse().toString();
        String palindrome = input.concat(reversed);

        for (int i = 0; i < palindrome.length(); i++){
            if(Character.isLetterOrDigit((palindrome.charAt(i)))) {
                count++;
            }
        }
       return count;
    }
}
