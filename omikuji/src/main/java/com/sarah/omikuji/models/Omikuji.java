package com.sarah.omikuji.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="omikujis")
public class Omikuji{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull(message="Please enter a number")
	private int number;
	@NotEmpty(message="Please enter a city")
	private String city;
	@NotEmpty(message="Please enter any real person")
	private String person;
	@NotEmpty(message="Please enter a hobby")
	private String hobby;
	@NotEmpty(message="Please enter a living thing")
	private String livingThing;
	@NotEmpty(message="Please send some kind words!")
	private String kindWords;
	@CreationTimestamp
	private Date createdAt;
	@UpdateTimestamp
	private Date updatedAt;
	
	public Omikuji() {}


	// GETTERS AND SETTERS
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getLivingThing() {
		return livingThing;
	}

	public void setLivingThing(String livingThing) {
		this.livingThing = livingThing;
	}

	public String getKindWords() {
		return kindWords;
	}

	public void setKindWords(String kindWords) {
		this.kindWords = kindWords;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}

