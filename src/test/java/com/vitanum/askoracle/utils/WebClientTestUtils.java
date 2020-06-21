package com.vitanum.askoracle.utils;

import com.vitanum.askoracle.entity.Nutrient;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

public class WebClientTestUtils {

    private WebClientTestUtils() {

    }

    public static void sendRequestAndVerify(WebTestClient theClient, String theUrl, Class theBodyClass, List<? extends Nutrient> theExpectedEntries) {
        theClient.get()
                .uri(theUrl)
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(theBodyClass)
                .isEqualTo(theExpectedEntries);
    }
}
