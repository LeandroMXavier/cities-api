package com.github.LeandroMXavier.citiesapi1.states.resources;

import com.github.LeandroMXavier.citiesapi1.states.entities.State;
import com.github.LeandroMXavier.citiesapi1.states.repositories.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    private StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }
}

