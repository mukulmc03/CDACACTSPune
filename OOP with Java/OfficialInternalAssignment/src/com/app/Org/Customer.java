package com.app.Org;

public class Customer {
	private String name, email, password;

	public Customer(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public Customer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer)
			return this.email.equals(((Customer)o).email) && this.password.equals(((Customer)o).password);
		return false;
	}
	
	
	
}
