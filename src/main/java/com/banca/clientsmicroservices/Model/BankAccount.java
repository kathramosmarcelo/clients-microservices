package com.banca.clientsmicroservices.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Document(collection = "BankAccount")
public class BankAccount {
	
	   @Id
	   public String id;   
	   @Field
	   public Integer nro_account;
	   @Field
	   public String name_account;
	   @Field
	   public Integer amount;
}
