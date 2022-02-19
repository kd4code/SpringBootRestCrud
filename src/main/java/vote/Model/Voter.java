package vote.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Voter_List")
public class Voter {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "Age")
	private int age;
	@Column(name = "Name")
	private String name;
    
	@ManyToOne(targetEntity = Address.class,cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name ="Pin",referencedColumnName = "pin")
	private Address ad;
	
	public Voter() {
		super();
	}
	

	public Voter(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	


	public Address getAd() {
		return ad;
	}


	public void setAd(Address ad) {
		this.ad = ad;
	}


	@Override
	public String toString() {
		return "Voter [id=" + id + ", age=" + age + ", name=" + name +  "]";
	}

	
	

}
