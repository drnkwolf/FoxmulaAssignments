package com.foxmula.assignment3;

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
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            if (treeMap.containsKey(inputArray[i])) {
                treeMap.put(inputArray[i], treeMap.get(inputArray[i]) + 1);
            } else {
                treeMap.put(inputArray[i], 1);
            }
        }
        printTreeMap(treeMap);
    }

    static public void printTreeMap(TreeMap<Integer, Integer> treeMap){
        for (Map.Entry<Integer, Integer> entries : treeMap.entrySet()){
            System.out.println(entries.getKey() + " occurs " + entries.getValue() + " times");
        }
    }
}
