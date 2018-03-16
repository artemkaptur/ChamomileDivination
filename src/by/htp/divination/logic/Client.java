package by.htp.divination.logic;

public class Client {
	private String name;
	private String surName;
	
	public Client() {
		super();
	}

	public Client(String name, String surName) {
		super();
		this.name = name;
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", surName=" + surName + "]";
	}
	
	public String askFortuneTeller(FortuneTeller fortuneTeller)
	{
		String yourFuture = fortuneTeller.makeDivination(this);
		System.out.println(yourFuture + "\n");
		return yourFuture;
	}
	
}
