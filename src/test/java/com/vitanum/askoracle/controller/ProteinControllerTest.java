package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.Protein;
import com.vitanum.askoracle.repository.ProteinRepository;
import com.vitanum.askoracle.utils.EntityUtils;
import com.vitanum.askoracle.utils.WebClientTestUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@WebFluxTest(ProteinController.class)
@DirtiesContext
public class ProteinControllerTest {
    public static final String BASE_PATH = "/top-richest-foods/protein";

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private ProteinRepository repository;

    @Test
    public void getRichestFoods() {
        // Arrange
        Protein entity = new Protein();
        EntityUtils.decorateEntity(entity);

        List<Protein> entries = Arrays.asList(entity);
        Mockito.when(repository.findByOrderByQuantityDesc(Mockito.any(Pageable.class))).thenReturn(Flux.fromIterable(entries));

        // Act & Assert
        WebClientTestUtils.sendRequestAndVerify(webTestClient, BASE_PATH, Protein.class, entries);
    }

}
