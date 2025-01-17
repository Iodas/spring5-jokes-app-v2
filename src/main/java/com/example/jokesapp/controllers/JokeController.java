package com.example.jokesapp.controllers;

import com.example.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        String randJoke = jokeService.getRandJoke();
        model.addAttribute("index", randJoke);

        return "index";
    }
}
