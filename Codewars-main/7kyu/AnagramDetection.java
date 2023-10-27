//DESCRIPTION:
//An anagram is the result of rearranging the letters of a word to produce a new word.
//Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

public class Kata {
    public static boolean isAnagram(String test, String original) {
          char[] charTest = test.toLowerCase().toCharArray();
          char[] charOriginal=original.toLowerCase().toCharArray();
          java.util.Arrays.sort(charTest);
          java.util.Arrays.sort(charOriginal);
          if( java.util.Arrays.equals(charTest,charOriginal))
              return true;
          return false;
      }
  }