public class GrandFatherClock extends Clock {

	public GrandFatherClock() {
		super(ClockType.mechanical, 0.000347222);
	}

	@Override
	public void display() {
		System.out.printf("%s, grandfather clock, time [%s], total drift = %.2f seconds\n", super.getClockType(), time.formattedTime(), time.getTotalDrift());
	}
}