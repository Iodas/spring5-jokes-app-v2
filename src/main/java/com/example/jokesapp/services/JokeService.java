package com.example.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    public String getRandJoke(){
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        String randJoke = quotes.getRandomQuote();

        System.out.println(randJoke);
        return randJoke;
    }
}
