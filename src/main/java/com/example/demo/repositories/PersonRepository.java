package com.example.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Person;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
