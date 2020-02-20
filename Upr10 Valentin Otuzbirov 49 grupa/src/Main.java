import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

	static HashMap<Patient, Double> debtors = new HashMap<Patient, Double>();
	
	public static void main(String[] args) {
		
		Diagnosis jelezen = Diagnosis.NOTSICK;
		Diagnosis sickness = Diagnosis.SICK;
		Diagnosis ebola = Diagnosis.VERYSICK;
		
		
		ArrayList<Diagnosis> ListGosho = new ArrayList<Diagnosis>();
		
		ListGosho.add(ebola);
		ListGosho.add(sickness);
		
			
		Patient patient1 = new Patient("Gosho", "1212121212", 130.0, ListGosho);
		
		
		ArrayList<Diagnosis> List2 = new ArrayList<Diagnosis>();
			
		List2.add(sickness);
			
		Patient patient2 = new Patient("Nqkoi", "2121212121", 10.0, List2);
			
			
		ArrayList<Diagnosis> ListZdrav = new ArrayList<Diagnosis>();
			
		ListZdrav.add(jelezen);
			
		Patient patient3 = new Patient("Zdravko", "1234512345", 50.0, ListZdrav);
			
			
			
		LinkedList<Patient> patients = new LinkedList<Patient>();
			
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		
		for (Patient patient : patients) {
            double debt = 0;
            try {
            	
            	for ( int i = 0; i < patient.List1.size() ;i++) {
            		
            		debt = debt + patient.cureSickness(patient.List1.get(i));
            		
            	}
            	
            	//System.out.println(patient.name + " debt: " + debt);
            	
            } catch (OutOfMoneyException e) {
            	
                debtors.put(patient, debt);
                e.printStackTrace();
                
            } catch (NoSuchSicknessException e) {
            	
                e.printStackTrace();
            }
        }

        for (Map.Entry<Patient, Double> patientDoubleEntry : debtors.entrySet()) {
            System.out.println(patientDoubleEntry.getKey().name + " owes " + patientDoubleEntry.getValue());
        }
	}
}
