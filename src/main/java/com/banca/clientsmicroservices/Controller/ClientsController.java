package com.banca.clientsmicroservices.Controller;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banca.clientsmicroservices.Model.Clients;
import com.banca.clientsmicroservices.Model.Mensaje;
import com.banca.clientsmicroservices.Service.ClientsService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientsController {
Logger log = org.slf4j.LoggerFactory.getLogger(ClientsController.class);
	
   private final ClientsService  serviceClientService;


    @GetMapping
    public Flux<Clients> getClient(){
        log.info("Se inicia el findall del Cliente");
        return serviceClientService.findAll();
    }


    @GetMapping("/getNameClient/{name}")
    public Flux<Clients> getClientByName(@PathVariable("name") String name){
        return serviceClientService.findClientsByName(name);
    }


    @PostMapping
    Mono<Clients> postClient(@RequestBody Clients clients){

    	return serviceClientService.save(clients);
          
    }

    @PostMapping("/updateClient")
    Mono<Clients> update (@RequestBody Clients clients ){
        return serviceClientService.update(clients);
    }

    @DeleteMapping("/deleteClient/{id}")
    public ResponseEntity delete (@PathVariable("id") String id) {
    	serviceClientService.delete(id);
    return new ResponseEntity(new Mensaje("Cliente del ID: "+ id + " Eliminado Correctamente!!!"),HttpStatus.OK);
    }
}
