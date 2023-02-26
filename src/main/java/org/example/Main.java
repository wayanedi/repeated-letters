package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    String letters = "BCABA";
    if(!findDuplicate(letters)) {
      System.out.println("Huruf berulang tidak ditemukan");
    }
  }

  private static boolean findDuplicate(String letters) {
    Map<Character, Integer> duplicate = new HashMap<>();
    for(int i=0; i< letters.length(); i++){
      if(duplicate.containsKey(letters.charAt(i))){
        System.out.println("Huruf berulang pertama adalah " + letters.charAt(i));
        return true;
      } else {
        duplicate.put(letters.charAt(i), 1);
      }
    }
    return false;
  }
}