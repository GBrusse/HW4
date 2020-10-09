import java.util.Iterator;

public class ClockSimulation {
	
	static long SECS_IN_DAY = 86_400;
	static long SECS_IN_WEEK = 604_800;
	static long SECS_IN_MONTH = 2_592_000;
	static long SECS_IN_YEAR = 31_536_000;
	
	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.add(new Sundial());
		bag.add(new CuckooClock());
		bag.add(new GrandFatherClock());
		bag.add(new WristWatch());
		bag.add(new AtomicClock());
		
		System.out.println("Times before start:");
		System.out.println();
		displayClocks(bag);
		
		for(int i = 0; i < SECS_IN_DAY; i++) {
			tickClocks(bag);
		}
		System.out.println();
		System.out.println("After one day:");
		System.out.println("");
		displayClocks(bag);
		
		resetClocks(bag);
		for(int i = 0; i < SECS_IN_WEEK; i++) {
			tickClocks(bag);
		}
		System.out.println();
		System.out.println("After one week:");
		System.out.println();
		displayClocks(bag);
		
	}
	
	public static void tickClocks(Bag<TimePiece> bag) {
		Iterator itr = bag.iterator();
		while(itr.hasNext()) {
			((Clock) itr.next()).tick();
		}
	}
	public static void displayClocks(Bag<TimePiece> bag) {
		Iterator itr = bag.iterator();
		while(itr.hasNext()) {
			((Clock) itr.next()).display();
		}
	}
	public static void resetClocks(Bag<TimePiece> bag) {
		Iterator itr = bag.iterator();
		while(itr.hasNext()) {
			((Clock) itr.next()).reset();
		}
	}
}