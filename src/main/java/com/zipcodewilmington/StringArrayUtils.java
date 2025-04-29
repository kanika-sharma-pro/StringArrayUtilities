package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
        return arrayList.contains(value);

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] reversed = StringArrayUtils.reverse(array);
        int compare = Arrays.compare(array, reversed);
        if (compare == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
        String allContents = arrayList.toString();
        allContents = allContents.replaceAll(",", "").replaceAll(" ", "").toLowerCase(Locale.ROOT);
        for (int i = 0; i < alphabet.length(); i++) {
            if (allContents.indexOf(alphabet.charAt(i)) == -1) return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int valueCount = 0;
        for (String string : array) {
            if (string == value) {
                valueCount += 1;
            }
        }

        return valueCount1;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        while (arrayList.contains(valueToRemove)) {
            arrayList.remove(valueToRemove);
        }
        return arrayList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayList = new ArrayList<>();
        String lastElement = "";
        for(String element : array){
            if(element != lastElement){
                arrayList.add(element);
            }
            lastElement = element;
        }
        return arrayList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int length = array.length;
        int lastIndex = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(array[0]);

        for(int i = 1; i < array.length; i++){
            if(arrayList.get(lastIndex).contains(array[i])){ //does my arrayList, at the last examined index contain what the array current shows
                arrayList.set(lastIndex, (arrayList.get(lastIndex) + array[i])); //arrayList.set(index, value)
            } else { //no longer looking at a consecutive
                lastIndex++; //I'm looking at a new 0R non-duplicate character
                arrayList.add(array[i]);
            }
        }
        return arrayList.toArray(new String[0]);
    }
    }





/*
    Set<Character> charSet = new HashSet<>();
        for (String string : array) {
            for (char c : string.toLowerCase().toCharArray()) {
                if (Character.isAlphabetic(c)) ;
                {
                    charSet.add(c);
                }
            }
            return charSet.size() == 26;
        }
        return  false;
    }
*/




