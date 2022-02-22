package com.banca.clientsmicroservices.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.banca.clientsmicroservices.Model.Clients;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ClientsRepository extends ReactiveMongoRepository<Clients, String>{

	Mono<Clients> findByid(String id);
    Flux<Clients> findByName(String name);
}
