package com.kckrish.lighthousebackend.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kckrish.lighthousebackend.Entities.Events;
import com.kckrish.lighthousebackend.Services.EventServices;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    EventServices eventServices;

    @GetMapping
    public List<Events> getAllEvents() {
        return eventServices.getAllEvents();
    }

    @GetMapping("/{id}")
    public Optional<Events> getEventById(@PathVariable int id) {
        Optional<Events> event = eventServices.getEventById(id);
        return event;
    }
}
