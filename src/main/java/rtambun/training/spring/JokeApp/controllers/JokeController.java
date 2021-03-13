package rtambun.training.spring.JokeApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rtambun.training.spring.JokeApp.services.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String jokes (Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return ("index");
    }

}
