package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.VitaminK;
import com.vitanum.askoracle.repository.VitaminKRepository;
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
@WebFluxTest(VitaminKController.class)
@DirtiesContext
public class VitaminKControllerTest {
    public static final String BASE_PATH = "/top-richest-foods/vitamin-k";

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private VitaminKRepository repository;

    @Test
    public void getRichestFoods() {
        // Arrange
        VitaminK entity = new VitaminK();
        EntityUtils.decorateEntity(entity);

        List<VitaminK> entries = Arrays.asList(entity);
        Mockito.when(repository.findByOrderByQuantityDesc(Mockito.any(Pageable.class))).thenReturn(Flux.fromIterable(entries));

        // Act & Assert
        WebClientTestUtils.sendRequestAndVerify(webTestClient, BASE_PATH, VitaminK.class, entries);
    }

}
