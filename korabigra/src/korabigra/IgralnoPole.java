package korabigra;

public class IgralnoPole {
    int hor;
    int ver;
    String[][] pole;
    boolean status = true;
    int deadCounter = 0;
    int ships;

    public int getDeadCounter() {
		return deadCounter;
	}

	public void setDeadCounter(int deadCounter) {
		this.deadCounter = deadCounter;
	}

	public int getShips() {
		return ships;
	}

	public void setShips(int ships) {
		this.ships = ships;
	}

	
	public boolean isStatus() {
		
    	return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	public IgralnoPole(int hor, int ver){
        
		setHor(hor);
        setVer(ver);
        //setStatus(status);
        
        setPole(hor, ver);
    }

	
	
    public int getHor() {
        return hor;
    }

    public void setHor(int hor) {
        this.hor = hor;
    }

    public int getVer() {
        return ver;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    
    public void setPole(int hor, int ver) {
        pole = new String[this.hor][this.ver];

        for (int i = 0; i < pole.length; i++) {
            for(int j = 0; j < pole[0].length; j++) {
                    pole[i][j] = " ";
                }
            }
    }

    
    public void getPole() {
        for (int i = 0; i < pole.length; i++) {
            for(int j = 0; j < pole[0].length; j++) {
                System.out.print("+-");
            }
            System.out.println("+");

            for(int j = 0; j < pole[0].length; j++) {
                if(pole[i][j] == "K") {
                    System.out.print("|" + " ");
                }else {
                    System.out.print("|" + pole[i][j]);
                }
            }
            System.out.println("|"); 
        } 
        for(int j = 0; j < pole[0].length; j++) 
            System.out.print("+-");
        System.out.println("+");
    }

    public void placeShips(int hor, int ver) {
        pole[hor][ver] = "K";
    }
    
    public void shoot(int hor, int ver) {
    	if (pole[hor][ver] != "K") {
    		pole[hor][ver] = "O";
    	} else {
    		pole[hor][ver] = "X";
    		
    		//GetDeadCounter(deadCounter++);
    		//if (getDeadCounter() == getShips() ) {
    			setStatus(false);
    		//}
    		
    	}
    	
    	//return deadCounter;
    }
}