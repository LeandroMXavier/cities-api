package com.github.LeandroMXavier.citiesapi1.countries.repositories;


import com.github.LeandroMXavier.citiesapi1.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
