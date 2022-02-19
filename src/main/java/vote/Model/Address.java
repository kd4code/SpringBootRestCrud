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
@Table(name = "Voter_Address")
public class Address {
	@Id
	@Column(nullable = false,unique = false,name="Pin")
	int pin;
	@Column(name = "State")
	String state;
	@Column(name = "City")
	String city;

	public Address() {
		super();
	}

	public Address(int pin, String state, String city) {
		super();
		this.pin = pin;
		this.state = state;
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
