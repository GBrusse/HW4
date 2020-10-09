public class AtomicClock extends Clock {

	public AtomicClock() {
		super(ClockType.quantum, 0.00);
	}

	@Override
	public void display() {
		System.out.printf("%s, atomic clock, time [%s], total drift = %.2f seconds\n", super.getClockType(), time.formattedTime(), time.getTotalDrift());
	}
}