package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.SaturatedFat;
import com.vitanum.askoracle.repository.SaturatedFatRepository;
import com.vitanum.askoracle.utils.EntityUtils;
import com.vitanum.askoracle.utils.WebClientTestUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@WebFluxTest(SaturatedFatController.class)
public class SaturatedFatControllerTest {
    public static final String BASE_PATH = "/top-richest-foods/saturated-fat";

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private SaturatedFatRepository repository;

    @Test
    public void getRichestFoods() {
        // Arrange
        SaturatedFat entity = new SaturatedFat();
        EntityUtils.decorateEntity(entity);

        List<SaturatedFat> entries = Arrays.asList(entity);
        Mockito.when(repository.findByOrderByQuantityDesc(Mockito.any(Pageable.class))).thenReturn(Flux.fromIterable(entries));

        // Act & Assert
        WebClientTestUtils.sendRequestAndVerify(webTestClient, BASE_PATH, SaturatedFat.class, entries);
    }

}
