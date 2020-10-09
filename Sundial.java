public class Sundial extends Clock {

	public Sundial() {
		super(ClockType.natural, 0.00);
	}

	@Override
	public void display() {
		System.out.printf("%s, sun dial, time [%s], total drift = %.2f seconds\n", super.getClockType(), time.formattedTime(), time.getTotalDrift());
	}
}