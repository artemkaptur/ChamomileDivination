package by.htp.divination.bean;

public class Petal {
	private int number;

	public Petal() {
		super();
	}

	public Petal(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Petal [number=" + number + "]";
	}
	
}
