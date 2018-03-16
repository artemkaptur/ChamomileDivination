package by.htp.divination.logic;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import by.htp.divination.bean.Chamomile;
import by.htp.divination.bean.Divination;

public class FortuneTeller {
	private String nickName;
	private LinkedList<Chamomile> chamomiles;
	private int chamomilesCount;
	private LinkedList<Client> clients;
	private LinkedList<Divination> divinations;
	private Date currentDate;

	public FortuneTeller() {
		super();
		clients = new LinkedList<>();
		createChamomiles();
		createDivinations();
		currentDate = new Date();
	}

	public FortuneTeller(String nickName) {
		super();
		this.nickName = nickName;
		clients = new LinkedList<>();
		createChamomiles();
		createDivinations();
		currentDate = new Date();

	}

	private void createChamomiles() {
		chamomilesCount = (int) (Math.random() * 5 + 1);
		chamomiles = new LinkedList<>();
		for (int i = 1; i <= chamomilesCount; i++) {
			chamomiles.add(new Chamomile());
		}
	}

	private void createDivinations() {
		divinations = new LinkedList<>();
		divinations.add(new Divination("Money", "Become the second Bill Gates", "Become homeless",
				"Be corporate clerk your entire life"));
		divinations.add(new Divination("Love", "Scarlett Johansson will be your girlfriend",
				"Brad Pitt will be your boyfrend", "You'll live with mom your entire life "));
		divinations
				.add(new Divination("Health", "You'll live 500 years", "You'll live 80 years", "Uhps, time is over"));
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public LinkedList<Chamomile> getChamomiles() {
		return chamomiles;
	}

	public void setChamomiles(LinkedList<Chamomile> chamomiles) {
		this.chamomiles = chamomiles;
	}

	public int getChamomilesCount() {
		return chamomilesCount;
	}

	public void setChamomilesCount(int chamomilesCount) {
		this.chamomilesCount = chamomilesCount;
	}

	public LinkedList<Client> getClients() {
		return clients;
	}

	public void setClients(LinkedList<Client> clients) {
		this.clients = clients;
	}

	public LinkedList<Divination> getDivinations() {
		return divinations;
	}

	public void setDivinations(LinkedList<Divination> divinations) {
		this.divinations = divinations;
	}

	@Override
	public String toString() {
		return "FortuneTeller [nickName=" + nickName + ", chamomiles=" + chamomiles + ", clients=" + clients
				+ ", divinations=" + divinations + "]";
	}

	public String makeDivination(Client client) {
		checkDate();
		try {
			if (!clients.contains(client)) {
				clients.add(client);
				String answer = makingDivination();
				return answer;
			} else
				return "Sorry budy, I have already told your future, come back tommorow!\n";
		} catch (NoSuchElementException e) {
			return "Sorry my magic power ended (I have no chamomiles)...\n";
		}
	}

	private void checkDate() {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		if (!df.format(currentDate).equals(df.format(new Date()))) {
			clients.clear();
		}
	}

	private String makingDivination() {
		Divination divination = chooseDivination();
		int petalsCount = chamomiles.getFirst().getPetalsCount();
		if (petalsCount % 3 == 1) {
			chamomiles.remove();
			return divination.getFirstVarOfDivination();
		} else if (petalsCount % 3 == 2) {
			chamomiles.remove();
			return divination.getSecondVarOfDivination();
		} else {
			chamomiles.remove();
			return divination.getThirdVarOfDivination();
		}
	}

	@SuppressWarnings("resource")
	private Divination chooseDivination() {
		String[] arr = new String[] { divinations.getFirst().getTitle(), divinations.get(1).getTitle(),
				divinations.getLast().getTitle() };
		Scanner sc = new Scanner(System.in);
		String s;
		do {
			System.out.println("Choose topic of divinations: " + Arrays.toString(arr));
			s = sc.next();
		} while ((!s.equals(divinations.getFirst().getTitle())) && (!s.equals(divinations.get(1).getTitle()))
				&& (!s.equals(divinations.getLast().getTitle())));
		if (s.equals(divinations.getFirst().getTitle()))
			return divinations.getFirst();
		if (s.equals(divinations.get(1).getTitle()))
			return divinations.get(1);
		else
			return divinations.getLast();
	}

}
