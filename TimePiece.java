
public interface TimePiece {
	//resets the TimePiece to its starting time (00:00:00 - midnight by default)
	public void reset();
	
	//simulates one second of time passing
	public void tick();
	
	//displays the current time
	public void display();
}
