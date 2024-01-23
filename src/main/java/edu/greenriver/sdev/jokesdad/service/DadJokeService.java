package edu.greenriver.sdev.jokesdad.service;

import edu.greenriver.sdev.jokesdad.db.DadJokeRepository;
import edu.greenriver.sdev.jokesdad.model.DadJoke;

import java.util.List;

public class DadJokeService {
    private DadJokeRepository repository;

    public DadJokeService(DadJokeRepository repository) {
        this.repository = repository;
    }

    public List<DadJoke> getAll(){
        List<DadJoke> jokes = repository.findAll();

        return jokes;
    }

    public void add(DadJoke joke){
        repository.save(joke);
    }

    public DadJoke update(int id, String newJokeText){
        DadJoke dadJoke = repository.findById(id).orElseThrow();

        dadJoke.setJokeText(newJokeText);

        return dadJoke;
    }

    public void delete(int id){
        repository.deleteById(id);
    }
}
