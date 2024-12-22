package com.kckrish.lighthousebackend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kckrish.lighthousebackend.Entities.Events;

public interface EventRepository extends JpaRepository<Events, Integer> {

}
