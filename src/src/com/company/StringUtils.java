package com.company;

public class StringUtils {

    public static boolean included(String word, String searched){   // helper library that allows for flexible search, ignoring Capitalization and trailing or leader white spaces
        if(!(word.isEmpty() || searched.isEmpty())) {               // if neither string is null
            word = word.toUpperCase().trim();                       // given search word is UpperCased and trimmed of white spaces
            searched = searched.toUpperCase().trim();               // same is done for the string

            if (word.contains(searched)){                           // if the string contains the word
                return true;                                        // return true
            } else {
                return false;
            }
        } else {            // if either String is null, return false
            return false;
        }
    }
}
