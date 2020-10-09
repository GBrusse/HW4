public abstract class Clock implements TimePiece {
	public enum ClockType {
		natural,
		mechanical,
		digital,
		quantum
	}
	
	private ClockType clockType;
	protected Time time;
	
	public Clock(ClockType type, double drift) {
		clockType = type;
		time = new Time(drift);
	}
	
	public ClockType getClockType() {
		return clockType;
	}
	
	public void setClockType(ClockType type) {
		clockType = type;
	}
	
	@Override
	public void reset() {
		time.resetToStartTime();
	}

	@Override
	public void tick() {
		time.incrementTime();
	}

	@Override
	public abstract void display();
}