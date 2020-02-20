
public class Participant{

	String name;
	int id;
	int age;
	double chanceToWin;
	double betForWin;
	
	public Participant(String name, int id, int age, double chanceToWin, double betForWin) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.chanceToWin = chanceToWin;
		this.betForWin = betForWin;
	}

	public Participant() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
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

	public double getChanceToWin() {
		return chanceToWin;
	}

	public void setChanceToWin(double chanceToWin) {
		this.chanceToWin = chanceToWin;
	}

	public double getBetForWin() {
		return betForWin;
	}

	public void setBetForWin(double betForWin) {
		this.betForWin = betForWin;
	}
	
	
}
