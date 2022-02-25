package com.banca.clientsmicroservices.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "clients")
public class Clients {
	@Id
    public String id;   
	@Field
	public String name;
	@Field
	public String lastname;
	@Field
	public String dni_Client;
	@Field
	public String email;
	@Field
	public String typeClient;
    @Field
	public String profile;

}
