package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.Phosphorus;
import com.vitanum.askoracle.repository.PhosphorusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/top-richest-foods/phosphorus")
public class PhosphorusController {

    @Autowired
    private PhosphorusRepository repository;

    @GetMapping
    public Flux<Phosphorus> getRichestFoods(@RequestParam(defaultValue = "25") Integer maxRecordCount) {
        return repository.findByOrderByQuantityDesc(PageRequest.of(0, maxRecordCount));
    }

}
