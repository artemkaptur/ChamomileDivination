package by.htp.divination.bean;

public class Divination {
	private String title;
	private String firstVarOfDivination;
	private String secondVarOfDivination;
	private String thirdVarOfDivination;
	
	public Divination() {
		super();
	}
	
	public Divination(String title, String firstVarOfDivination, String secondVarOfDivination, String thirdVarOfDivination) {
		super();
		this.title = title;
		this.firstVarOfDivination = firstVarOfDivination;
		this.secondVarOfDivination = secondVarOfDivination;
		this.thirdVarOfDivination = thirdVarOfDivination;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getFirstVarOfDivination() {
		return firstVarOfDivination;
	}

	public void setFirstVarOfDivination(String firstVarOfDivination) {
		this.firstVarOfDivination = firstVarOfDivination;
	}

	public String getSecondVarOfDivination() {
		return secondVarOfDivination;
	}

	public void setSecondVarOfDivination(String secondVarOfDivination) {
		this.secondVarOfDivination = secondVarOfDivination;
	}

	public String getThirdVarOfDivination() {
		return thirdVarOfDivination;
	}

	public void setThirdVarOfDivination(String thirdVarOfDivination) {
		this.thirdVarOfDivination = thirdVarOfDivination;
	}
	

	@Override
	public String toString() {
		return "Divination [title=" + title + ", firstVarOfDivination=" + firstVarOfDivination
				+ ", secondVarOfDivination=" + secondVarOfDivination + ", thirdVarOfDivination=" + thirdVarOfDivination
				+ "]";
	}
		
}
