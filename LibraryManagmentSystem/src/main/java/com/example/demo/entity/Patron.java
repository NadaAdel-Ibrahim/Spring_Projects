package com.example.demo.entity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Patron {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String Name;
	
   //contactInformation
	@NotNull
	private String email;
	
	private String phone;
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}
	

}