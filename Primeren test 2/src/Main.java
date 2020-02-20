
public class Main {

	public static void main(String[] args) {

		
		try {
			Participant[] schedule = new Participant[1];
			schedule[0] = new Participant("Mama ti", 1, 21, 50.94, 1000.0);
			CreateEvent event = new CreateEvent();
			Competition ob = event.getEvent("Football");
			//suzdava prazen obekt, no zashto
			//Competition ob1 = new FootballCompetition();
			
			event.fillSchedule(ob,  schedule);
			Participant[] sch = ob.getSchedule();
			System.out.println(event.typeOfEvent);
			System.out.println(sch[0].name + "  " + sch[0].age + "  " + sch[0].chanceToWin);
			bets(ob, 1, 2.0);
			//sch=ob.getSchedule();
			System.out.println(sch[0].name + "  " + sch[0].age + "  " + sch[0].chanceToWin);
			bets(ob, 1, 5);
			//sch=ob.getSchedule();
			System.out.println(sch[0].name + "  " + sch[0].age + "  " + sch[0].chanceToWin);
			System.out.println(sch[0].betForWin);
			
			Participant i = new Participant();
			Participant j = i;
			
			System.out.println(i.age+", "+j.age);
			
			i.age = 2;
			

			System.out.println(i.age+", "+j.age);
			
			j.age = 3;

			System.out.println(i.age+", "+j.age);
			
		}
		catch (EventException e) {
			System.out.println(e.getMessage());
		}
	}

	static void bets(Competition ob, int id, double bet) {
		Participant[] participant = ob.getSchedule();
		for (int i=0; i < participant.length;  i++) {
			if (participant[i].id == id) {
				double resultBet = (participant[i].betForWin +bet) / participant[i].betForWin;
				double chanceToWin = participant[i].chanceToWin - resultBet;
				if(chanceToWin < 1.1) {
					participant[i].chanceToWin = 1.1;
				} else {
					participant[i].chanceToWin = chanceToWin;
				}
				
			}
		}

		((FootballCompetition) ob).schedule[0].chanceToWin = 1.8;
	
		System.out.println("##########"+ob.getSchedule()[0].chanceToWin+"KURR");
		participant[0].chanceToWin = 1.4;
	}
}
