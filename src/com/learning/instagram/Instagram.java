package com.learning.instagram;

import java.util.HashMap;
import java.util.Map;

public class Instagram {

    public static void main(String[] args) {
        Map<String, AccountDetails> basicUserDetails = new HashMap<>();
        System.out.println(basicUserDetails);
        basicUserDetails.put("pamya", new AccountDetails(1000, 100, 10));
        basicUserDetails.put("sourya", new AccountDetails(2000, 101, 0));
        basicUserDetails.put("subya", new AccountDetails(100, 50, 10));
        basicUserDetails.put("subya", new AccountDetails(200, 50, 10));
        System.out.println(basicUserDetails);

        System.out.println(basicUserDetails.getOrDefault("rushya", new AccountDetails(0,0,0)).numberOfFollowers);
        System.out.println(basicUserDetails.keySet());
    }
}
