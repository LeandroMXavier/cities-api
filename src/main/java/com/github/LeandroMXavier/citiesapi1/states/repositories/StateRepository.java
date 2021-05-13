package com.github.LeandroMXavier.citiesapi1.states.repositories;

import com.github.LeandroMXavier.citiesapi1.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
