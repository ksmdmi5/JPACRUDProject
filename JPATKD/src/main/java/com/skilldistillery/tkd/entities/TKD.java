package com.skilldistillery.tkd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TKD {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String technique;
	private String description;
	private String belt;
	private String type;
	
	public TKD() {}
	

	public TKD(int id, String technique, String description, String belt, String type) {
		super();
		this.id = id;
		this.technique = technique;
		this.description = description;
		this.belt = belt;
		this.type = type;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechnique() {
		return technique;
	}

	public void setTechnique(String technique) {
		this.technique = technique;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBelt() {
		return belt;
	}

	public void setBelt(String belt) {
		this.belt = belt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((belt == null) ? 0 : belt.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((technique == null) ? 0 : technique.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TKD other = (TKD) obj;
		if (belt == null) {
			if (other.belt != null)
				return false;
		} else if (!belt.equals(other.belt))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (technique == null) {
			if (other.technique != null)
				return false;
		} else if (!technique.equals(other.technique))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TKD [id=" + id + ", technique=" + technique + ", description=" + description + ", belt=" + belt
				+ ", type=" + type + "]";
	}


	public TKD(int id) {
		super();
		this.id = id;
	}
	
}
