package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.VitaminDIu;
import com.vitanum.askoracle.repository.VitaminDIuRepository;
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
@WebFluxTest(VitaminDIuController.class)
@DirtiesContext
public class VitaminDIuControllerTest {
    public static final String BASE_PATH = "/top-richest-foods/vitamin-diu";

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private VitaminDIuRepository repository;

    @Test
    public void getRichestFoods() {
        // Arrange
        VitaminDIu entity = new VitaminDIu();
        EntityUtils.decorateEntity(entity);

        List<VitaminDIu> entries = Arrays.asList(entity);
        Mockito.when(repository.findByOrderByQuantityDesc(Mockito.any(Pageable.class))).thenReturn(Flux.fromIterable(entries));

        // Act & Assert
        WebClientTestUtils.sendRequestAndVerify(webTestClient, BASE_PATH, VitaminDIu.class, entries);
    }

}
