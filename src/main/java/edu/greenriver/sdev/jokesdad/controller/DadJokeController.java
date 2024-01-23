package edu.greenriver.sdev.jokesdad.controller;

import edu.greenriver.sdev.jokesdad.model.DadJoke;
import edu.greenriver.sdev.jokesdad.service.DadJokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DadJokeController {

    private DadJokeService service;

    public DadJokeController(DadJokeService service) {
        this.service = service;
    }

    @GetMapping("jokes")
    public List<DadJoke> all(){
        return service.getAll();
    }

    @PostMapping("jokes")
    public DadJoke add(@RequestBody DadJoke newDadJoke){
        return service.add(newDadJoke);
    }

    @PutMapping("jokes/{id}")
    public DadJoke update(@PathVariable int id, @RequestBody String jokeText){
        return service.update(id, jokeText);

    }

    @DeleteMapping("jokes/{id}")
    public void delete(@PathVariable int id){

        service.delete(id);
    }
}
