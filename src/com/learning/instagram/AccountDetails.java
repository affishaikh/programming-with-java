package com.learning.instagram;

public class AccountDetails {
    Integer numberOfFollowers;
    Integer numberOfPosts;
    Integer numberOfReels;

    public AccountDetails(Integer numberOfFollowers,
                          Integer numberOfPosts,
                          Integer numberOfReels) {
        this.numberOfFollowers = numberOfFollowers;
        this.numberOfReels = numberOfReels;
        this.numberOfPosts = numberOfPosts;
    }

    @Override
    public String toString() {
        return "followers: " + this.numberOfFollowers + " posts: " + this.numberOfPosts + " reels: " + this.numberOfReels;
    }
}
