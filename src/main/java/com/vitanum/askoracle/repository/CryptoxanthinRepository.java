package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Cryptoxanthin;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CryptoxanthinRepository extends ReactiveMongoRepository<Cryptoxanthin, String> {

    Flux<Cryptoxanthin> findByOrderByQuantityDesc(Pageable pageable);
}
