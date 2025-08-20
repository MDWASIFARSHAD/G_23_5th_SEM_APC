package Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Hello {
	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hello(String college) {
		super();
		this.college = college;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	private String college;

}
