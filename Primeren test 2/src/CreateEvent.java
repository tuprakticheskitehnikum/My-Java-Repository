
public class CreateEvent {

	String typeOfEvent;
	
	public Competition getEvent(String competitionType) throws EventException{
		
		if(competitionType ==null) {
			return null;
		}
		if(competitionType.equalsIgnoreCase("football")) {
			this.typeOfEvent = competitionType;
			return new FootballCompetition();
			//FootballCompetition fb = new FootballCompetition(); return fb;
		}
		else if (competitionType.equalsIgnoreCase("Horse")) {
			this.typeOfEvent = competitionType;
			return new HorseCompetition();
			
			/*
			 * HorseCompetition hor = new Horse Competition();
			 * return hor;
			 */
			
		}else if(competitionType.equalsIgnoreCase("Formula")) {
			this.typeOfEvent = competitionType;
			return new Formula1Competition();
			
			/*
			 * Formula1Competition f1 = new FormulaCompetition();
			 * return f1;
			 */
		}
		else {
			throw new EventException();
		}
		
	}
	
	public void fillSchedule(Competition ob, Participant[] schedule) {
		
		if (ob instanceof FootballCompetition) {
			FootballCompetition football = (FootballCompetition) ob;
			football.schedule = schedule;
			
			
		}
		if(typeOfEvent.equalsIgnoreCase("Horse")) {
			HorseCompetition horse = (HorseCompetition) ob;
			horse.schedule = schedule;
		}
		if (typeOfEvent.equalsIgnoreCase("Formula")) {
			Formula1Competition formula = (Formula1Competition) ob;
			formula.schedule = schedule;
		}
		//ob instanceof FootballCompetition;
	}
	
}
