package com.collie.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.collie.api.repositories.SchedulesRepository;
import com.collie.api.models.Schedule;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    private SchedulesRepository schedulesRepository;

    @GetMapping
    public List<Schedule> getSchedules() {
        return schedulesRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Schedule addSchedule(@RequestBody Schedule client) {
        return schedulesRepository.save(client);
    }

    @PatchMapping("/status/{id}/{status}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PATCH#resposta
    public ResponseEntity<HttpStatus> patchSchedule(@PathVariable long id, @PathVariable int status) {
        Optional<Schedule> response = schedulesRepository.findById(id);
        
        if(response.isPresent()){
            response.get().setStatus(status);
            schedulesRepository.flush();
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        }

        return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
    }
}
