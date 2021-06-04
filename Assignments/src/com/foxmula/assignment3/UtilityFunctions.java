package com.foxmula.assignment3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UtilityFunctions {
    static public void isValid(int input) throws InvalidInputException {
        if (isPrime(input) && isOdd(input)) {
            throw new InvalidInputException(Integer.toString(input));
        } else {
            System.out.println("Valid number.");
        }
    }

    static public boolean isPrime(int input) {
        for (int i = 2; i * i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }

        return true;
    }

    static public boolean isOdd(int input) {
        if (input % 2 == 0) {
            return false;
        }

        return true;
    }

    static public void frequencyOfElements(int[] inputArray) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            if (hashMap.containsKey(inputArray[i])) {
                hashMap.put(inputArray[i], hashMap.get(inputArray[i]) + 1);
            } else {
                hashMap.put(inputArray[i], 1);
            }
        }
        sortByKeys(hashMap);
    }

    static public void sortByKeys(HashMap<Integer, Integer> hashMap){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);

        printTreeMap(treeMap);
    }

    static public void printTreeMap(TreeMap<Integer, Integer> treeMap){
        for (Map.Entry<Integer, Integer> entries : treeMap.entrySet()){
            System.out.println(entries.getKey() + " occurs " + entries.getValue() + " times");
        }
    }
}
