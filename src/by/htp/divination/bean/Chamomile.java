package by.htp.divination.bean;

import java.util.LinkedList;

public class Chamomile {
	private LinkedList<Petal> petals;
	private int petalsCount;

	public Chamomile() {
		super();
		createPetals();
	}
	
	private void createPetals()
	{
		petalsCount = (int) (Math.random()*12+1);
		petals = new LinkedList<>();
		for (int i=1; i<=petalsCount; i++)
		{
			petals.add(new Petal(i));
		}
	}

	public LinkedList<Petal> getPetals() {
		return petals;
	}

	public void setPetals(LinkedList<Petal> petals) {
		this.petals = petals;
	}
	
	public int getPetalsCount() {
		return petalsCount;
	}

	public void setPetalsCount(int petalsCount) {
		this.petalsCount = petalsCount;
	}

	@Override
	public String toString() {
		return "Chamomile [petals=" + petals + "]";
	}
	
}
