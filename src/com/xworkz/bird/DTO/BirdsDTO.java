package com.xworkz.bird.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="birds_table")

public class BirdsDTO implements Serializable {
	
	@Column(name="b_id")
	@Id
	private int id;
	@Column(name="b_name")
	private String name;
	@Column(name="b_color")
	private String color;
	@Column(name="b_place")
	private String place;
	@Column(name="b_food")
	private String food;
	@Column(name="b_lifeSpan")
	private String lifeSpan;
	@Column(name="b_weight")
	private String weight;
	@Column(name="b_flyingCapacity")
	private String flyingCapacity;
	@Column(name="b_type")
	private Type type;
	
	public BirdsDTO() {
		
	}

	public BirdsDTO(int id, String name, String color, String place, String food, String lifeSpan, String weight,
			String flyingCapacity, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.place = place;
		this.food = food;
		this.lifeSpan = lifeSpan;
		this.weight = weight;
		this.flyingCapacity = flyingCapacity;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getFlyingCapacity() {
		return flyingCapacity;
	}

	public void setFlyingCapacity(String flyingCapacity) {
		this.flyingCapacity = flyingCapacity;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BirdsDTO [id=" + id + ", name=" + name + ", color=" + color + ", place=" + place + ", food=" + food
				+ ", lifeSpan=" + lifeSpan + ", weight=" + weight + ", flyingCapacity=" + flyingCapacity + ", type="
				+ type + "]";
	}
	
	
	
	
	
	
	
	
	
	
	


}
