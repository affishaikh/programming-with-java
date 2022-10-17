package com.learning;

import java.util.*;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> countOfAllNumbers = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            Integer count = countOfAllNumbers.getOrDefault(a[i], 0);
            countOfAllNumbers.put(a[i], count + 1);
        }
        Set<Integer> keys = countOfAllNumbers.keySet();
        Iterator<Integer> iterator = keys.iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            Integer number = countOfAllNumbers.get(key);
            if (number % 2 == 1) {
                return key.intValue();
            }
        }

        return 0;
    }
}

// Iterate and keep track of count of each number
// [1,2,2,3,3,3,1,3,3,3,2,2,1]

// 1 -> 1
// 2 -> 2
//

// 1 -> Pramod
// 2 -> Sourya
