public class CuckooClock extends Clock {

	public CuckooClock() {
		super(ClockType.mechanical, 0.000694444);
	}

	@Override
	public void display() {
		System.out.printf("%s, cuckoo clock, time [%s], total drift = %.2f seconds\n", super.getClockType(), time.formattedTime(), time.getTotalDrift());
	}
}