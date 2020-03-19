package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Choline;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CholineRepository extends ReactiveMongoRepository<Choline, String> {

    Flux<Choline> findByOrderByQuantityDesc(Pageable pageable);
}
