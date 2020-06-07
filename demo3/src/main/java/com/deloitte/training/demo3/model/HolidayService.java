package com.deloitte.training.demo3.model;

import java.io.IOException;
import java.util.List;

import com.deloitte.training.demo3.model.Holiday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holidays")

public class HolidayService {
    @Autowired
    private List<Holiday> holidays;

    @GetMapping("/all")
    public List<Holiday> foo() {
        return holidays;
    };
    
    @GetMapping("/byDestination/{destination}")
    public Holiday bar(@PathVariable String destination) throws IOException{
        return holidays.stream()
            .filter(h -> h.getDestination().equalsIgnoreCase(destination))
            .findFirst()
            .orElseThrow(() -> new IOException("Oh No!"));
    }
}