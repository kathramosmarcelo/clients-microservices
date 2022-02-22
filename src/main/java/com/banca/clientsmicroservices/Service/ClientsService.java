package com.banca.clientsmicroservices.Service;

import com.banca.clientsmicroservices.Model.Clients;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientsService {
	Flux<Clients> findAll();
	Mono<Clients> save(Clients client);
    Flux<Clients> findClientsByName(String name);
    Mono<Clients> update(Clients client);
    void delete(String id);
}
