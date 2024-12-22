package com.kckrish.lighthousebackend.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kckrish.lighthousebackend.Entities.Events;
import com.kckrish.lighthousebackend.Repositories.EventRepository;

@Service
public class EventServices {
    @Autowired
    EventRepository eventRepository;

    public List<Events> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Events> getEventById(int id) {
        return eventRepository.findById(id);
    }
}
