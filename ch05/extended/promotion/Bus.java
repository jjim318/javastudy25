package ch05.extended.promotion;

public class Bus extends Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다");
		super.run();
	}
	

}
