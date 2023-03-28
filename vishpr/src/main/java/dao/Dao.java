package dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vishwas")
public class Dao {
	@Id
	String name;
	String number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	

}
