package com.banca.clientsmicroservices.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banca.clientsmicroservices.Model.Clients;
import com.banca.clientsmicroservices.Repository.ClientsRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl  implements ClientsService{

	 @Autowired
	 ClientsRepository repository;
	 
	@Override
	public Flux<Clients> findAll() {
		 return repository.findAll();
	}

	@Override
	public Mono<Clients> save(Clients client) {
		return repository.save(client);
	}

    @Override
    public Flux<Clients> findClientsByName(String name) {
        return repository.findByName(name);
    }


    @Override
    public Mono<Clients> update(Clients client) {
        return repository.save(client);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }

}