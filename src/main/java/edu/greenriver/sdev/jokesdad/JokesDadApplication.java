package edu.greenriver.sdev.jokesdad;

import edu.greenriver.sdev.jokesdad.db.DadJokeRepository;
import edu.greenriver.sdev.jokesdad.model.DadJoke;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JokesDadApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(JokesDadApplication.class, args);
        DadJokeRepository repo = context.getBean(DadJokeRepository.class);

        List<DadJoke> dadJokes = new ArrayList<>(
                List.of(
                        new DadJoke(1, "I'm reading a book on anti-gravity. It's impossible to put down!"),
                        new DadJoke(2, "Did you hear about the restaurant on the moon? Great food, no atmosphere."),
                        new DadJoke(3, "Why don't scientists trust atoms? Because they make up everything."),
                        new DadJoke(4, "I told my wife she should embrace her mistakes. She gave me a hug."),
                        new DadJoke(5, "What do you call fake spaghetti? An impasta."),
                        new DadJoke(6, "Why don't eggs tell jokes? They'd crack each other up."),
                        new DadJoke(7, "I would tell you a joke about an elevator, but it’s an uplifting experience."),
                        new DadJoke(8, "Why don't skeletons fight each other? They don't have the guts."),
                        new DadJoke(9, "What do you call a belt made of watches? A waist of time."),
                        new DadJoke(10, "I'm on a seafood diet. I see food and I eat it.")

                )
        );


        repo.saveAll(dadJokes);
    }

}
