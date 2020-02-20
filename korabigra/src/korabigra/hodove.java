package korabigra;
import java.util.Scanner;

public class hodove {

    int hor;
    int ver;
    int ships;
    int i =1;
    Scanner scan = new Scanner(System.in);
    
    public void hodove() {
        IgralnoPole[] test = new IgralnoPole[2];
	
	    System.out.print("Map Rows:");
	    hor = scan.nextInt();
	    System.out.print("Map Columns:");
	    ver = scan.nextInt();
	    System.out.print("Number of ships:");
	    ships = scan.nextInt();
	    
	    for(int j = 0; j <= i; j++) {
	    	test[j]= new IgralnoPole(hor, ver);
	    }
	    
	    for(int j = 0; j <= i; j++) {
		    System.out.print("Player " + j + " enter your ship's row:");
		    hor = scan.nextInt() - 1;
		    System.out.print("Player " + j + " enter your ship's colum:");
		    ver = scan.nextInt() - 1 ;
		    test[j].placeShips(hor, ver);
	    }

	    for(int k = 0; k <= i; k++ ){
	    		
	    	if(test[1].isStatus()==false){
		   		System.out.println("Player " + 0 + " wins!");
		   		break;
	    	}
	    	else if(test[0].isStatus()==false){
	   			System.out.println("Player " + 1 + " wins!");
	   			break;
	    	}
	    	
	    	System.out.println("Player 0's turn:");
	    	test[1].getPole();
	    	
	    	System.out.println("Choose row: ");
	    	this.hor = scan.nextInt()- 1;
	    	
	    	System.out.println("Choose column: ");
	    	
	    	this.ver = scan.nextInt()- 1;
	    	test[1].shoot(hor, ver);
	    	test[1].getPole();
	    	
	    	
	    	
	    	System.out.println("Player 1's turn:");
	    	test[0].getPole();
	    	
	    	System.out.println("Choose row: ");
	    	this.hor = scan.nextInt()- 1;
	    	
	    	System.out.println("Choose column: ");
	    	
	    	this.ver = scan.nextInt()- 1;
	    	test[0].shoot(hor, ver);
	    	test[0].getPole();
	    	
	   		k=0;

	   		/*
	   		 * Kogato igrach 1 uceli koraba na igrach 2, da svurshi programata, zashtoto sega kato igrach 1 uceli korab, igrach 2 si ima hod sled tova
	   		 * Napishi konstruktor
	   		 * Napravi da se vuvejda broq na korabite, i kogato se uluchat vsichkite korabi togava da svurshi igrata
	   		 * Exceptioni za otricatelni vuvedeni koordinati i za tvurde golemi koordinati i da ti pozvoli da vuvedesh otnovo
	   		 * 
	   		*/
	    }
    }
}