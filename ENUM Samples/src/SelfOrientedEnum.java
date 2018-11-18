
public enum SelfOrientedEnum {
	WORKING, IDLING;

	public boolean isWorking() {
		return this == WORKING;
	}

	public boolean isIdling() {
		return this == IDLING;
	}

	public static class Start {
		public static void main(String[] args) {
			SelfOrientedEnum worker1 = SelfOrientedEnum.WORKING;
			System.out.println("worker1.isWorking() = " + worker1.isWorking());
			System.out.println("worker1.isIdling() = " + worker1.isIdling());

			SelfOrientedEnum worker2 = SelfOrientedEnum.IDLING;
			System.out.println("worker2.isWorking() = " + worker2.isWorking());
			System.out.println("worker2.isIdling() = " + worker2.isIdling());

//			Will output:
//			worker1.isWorking() = true
//			worker1.isIdling() = false
//			worker2.isWorking() = false
//			worker2.isIdling() = true

		}
	}

}
