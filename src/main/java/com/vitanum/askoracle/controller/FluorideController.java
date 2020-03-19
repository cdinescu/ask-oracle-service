package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.Fluoride;
import com.vitanum.askoracle.repository.FluorideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/top-richest-foods/fluoride")
public class FluorideController {

    @Autowired
    private FluorideRepository repository;

    @GetMapping
    public Flux<Fluoride> getRichestFoods(@RequestParam(defaultValue = "25") Integer maxRecordCount) {
        return repository.findByOrderByQuantityDesc(PageRequest.of(0, maxRecordCount));
    }

}
