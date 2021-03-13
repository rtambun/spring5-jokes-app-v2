package rtambun.training.spring.JokeApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteJoke implements JokeService{

    @Override
    public String getJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
