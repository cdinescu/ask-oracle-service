package com.vitanum.askoracle.controller;

import com.vitanum.askoracle.entity.Selenium;
import com.vitanum.askoracle.repository.SeleniumRepository;
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
@WebFluxTest(SeleniumController.class)
public class SeleniumControllerTest {
    public static final String BASE_PATH = "/top-richest-foods/selenium";

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private SeleniumRepository repository;

    @Test
    public void getRichestFoods() {
        // Arrange
        Selenium entity = new Selenium();
        EntityUtils.decorateEntity(entity);

        List<Selenium> entries = Arrays.asList(entity);
        Mockito.when(repository.findByOrderByQuantityDesc(Mockito.any(Pageable.class))).thenReturn(Flux.fromIterable(entries));

        // Act & Assert
        WebClientTestUtils.sendRequestAndVerify(webTestClient, BASE_PATH, Selenium.class, entries);
    }

}
