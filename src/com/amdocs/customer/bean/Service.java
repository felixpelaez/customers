package com.amdocs.customer.bean;

import java.io.Serializable;

public class Service implements Serializable{
	long created;
	int id;
	String name;
	boolean verficated;
	boolean hired;
		
	public Service(long created, int id, String name, boolean verficated, boolean hired) {
		super();
		this.created = created;
		this.id = id;
		this.name = name;
		this.verficated = verficated;
		this.hired = hired;
	}
	
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public boolean isHired() {
		return hired;
	}
	public void setHired(boolean hired) {
		this.hired = hired;
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
	public boolean isVerficated() {
		return verficated;
	}
	public void setVerficated(boolean verficated) {
		this.verficated = verficated;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (created ^ (created >>> 32));
		result = prime * result + (hired ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (verficated ? 1231 : 1237);
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
		Service other = (Service) obj;
		if (created != other.created)
			return false;
		if (hired != other.hired)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (verficated != other.verficated)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Service [created=" + created + ", id=" + id + ", name=" + name + ", verficated=" + verficated
				+ ", hired=" + hired + "]";
	}
	
	

}
