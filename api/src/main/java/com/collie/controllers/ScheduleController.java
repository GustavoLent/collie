package com.collie.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.FieldError;

import com.collie.services.SchedulesService;
import com.collie.constants.*;
import com.collie.dtos.ScheduleDTO;
import com.collie.errors.*;
import com.collie.models.Schedule;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    private SchedulesService schedulesService;

    @GetMapping
    public ResponseEntity<List<Schedule>> getSchedules() {
        HttpHeaders headers = new HttpHeaders();

        try {
            return new ResponseEntity<List<Schedule>>(schedulesService.getSchedules(), HttpStatus.OK);
        } catch (GetEntryError e) {
            headers.set(ResponseHeaders.ERROR_RESPONSE, e.getMessage());
        } catch (Exception e) {
            headers.set(ResponseHeaders.ERROR_RESPONSE, ErrorMessages.CONTROLLER_UNEXPECTED_GET);
        }

        return new ResponseEntity<List<Schedule>>(
                null,
                new HttpHeaders(),
                HttpStatus.BAD_REQUEST);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> addSchedule(@Valid @RequestBody ScheduleDTO schedule) {
        HttpHeaders headers = new HttpHeaders();

        try {
            schedulesService.addSchedule(schedule);
            return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);

        } catch (AddEntryError e) {
            headers.set(ResponseHeaders.ERROR_RESPONSE, e.getMessage());
        } catch (Exception e) {
            headers.set(ResponseHeaders.ERROR_RESPONSE, ErrorMessages.CONTROLLER_UNEXPECTED_ADD);
        }

        return new ResponseEntity<HttpStatus>(headers, HttpStatus.BAD_REQUEST);
    }

    @PatchMapping("/status/{id}/{status}")
    public ResponseEntity<HttpStatus> patchSchedule(@PathVariable long id, @PathVariable int status) {
        HttpHeaders headers = new HttpHeaders();

        try {
            schedulesService.updateSchedule(id, status);
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);

        } catch (UpdateEntryError e) {
            headers.set(ResponseHeaders.ERROR_RESPONSE, e.getMessage());
        } catch (Exception e) {
            headers.set(ResponseHeaders.ERROR_RESPONSE, ErrorMessages.CONTROLLER_UNEXPECTED_UPDATE);
        }

        return new ResponseEntity<HttpStatus>(headers, HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
