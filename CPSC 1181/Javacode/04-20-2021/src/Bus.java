public class Bus {
	
    private boolean[] seats;
	
    public Bus(int size){
        seats = new boolean[size];
    }

    public synchronized String getAvailableSeats(){
        String available="";
        for(int i=0; i<seats.length; i++){
            if(!seats[i])
                available = available + " " + i;
        }
        if(available.length()==0)
            available = "Full";
        return available;
    }

    public synchronized boolean reserve(int index){

        if(index>=seats.length || index<0)
            return false;
        if (seats[index])
            return false; 		// The seat is already reserved
        seats[index] = true; 	// reserve the seat
        return true;
    }
}

