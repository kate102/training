package com.deloitte.training.demo3.services;

import com.deloitte.training.demo3.model.Holiday3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;


@RestController
@RequestMapping("/reactive-holidays")

public class HolidayService3 {
    @Autowired
    private List<Holiday3> holidays;

    @GetMapping(value="/all", produces=TEXT_EVENT_STREAM_VALUE)
    public Flux<Holiday3> foo() {
        return Flux.fromIterable(holidays)
                .delayElements(Duration.ofSeconds(1));
    }
}