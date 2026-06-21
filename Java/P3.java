// This is a basic program in java to check if two diff strings are anagrams of each other or not. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.

package Java;
import java.util.Arrays;

class P3{
    public static boolean areAnagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if lengths are equal
        if(str1.length() != str2.length()){
            return false;
        }

        // Convert strings to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check to see if the arrays are equal
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String args[]){
        String str1 = "Listen";
        String str2 = "Silent";

        if(areAnagrams(str1, str2)){
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}