package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.SaturatedFat;
import com.vitanum.askoracle.repository.SaturatedFatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/top-richest-foods/saturated-fat")
public class SaturatedFatController {

    @Autowired
    private SaturatedFatRepository repository;

    @GetMapping
    public Flux<SaturatedFat> getRichestFoods(@RequestParam(defaultValue = "25") Integer maxRecordCount) {
        return repository.findByOrderByQuantityDesc(PageRequest.of(0, maxRecordCount));
    }

}
