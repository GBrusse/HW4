public class WristWatch extends Clock {

	public WristWatch() {
		super(ClockType.digital, 0.000034722);
	}

	@Override
	public void display() {
		System.out.printf("%s, wrist watch, time [%s], total drift = %.2f seconds\n", super.getClockType(), time.formattedTime(), time.getTotalDrift());
	}
}