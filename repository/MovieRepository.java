package com.example.mms.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.mms.Entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
