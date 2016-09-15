package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeLib {

    public String getJoke(){
        Random randomGenerator = new Random();
        List<String> strings = Arrays.asList(
                "My dog used to chase people on a bike a lot.It got so bad," +
                        " finally I had to take his bike away.",
                "Scientists have now discovered how women keep their secrets." +
                        " They do so within groups of 40.",
                "My wife cooks so bad we usually pray after our food.",
                "I'd like to buy a new boomerang please. Also, can you tell me how to " +
                        "throw the old one away?");
        return strings.get(randomGenerator.nextInt(strings.size()));
    }
}
