package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.VitaminB12;
import com.vitanum.askoracle.repository.VitaminB12Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/top-richest-foods/vitamin-b12")
public class VitaminB12Controller {

    @Autowired
    private VitaminB12Repository repository;

    @GetMapping
    public Flux<VitaminB12> getRichestFoods(@RequestParam(defaultValue = "25") Integer maxRecordCount) {
        return repository.findByOrderByQuantityDesc(PageRequest.of(0, maxRecordCount));
    }

}
