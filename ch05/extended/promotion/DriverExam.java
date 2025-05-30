package ch05.extended.promotion;

public class DriverExam {
	public void drive(Vehicle vehicle) {//탈것객체를 이용한 매개변수 선언
		vehicle.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverExam driverExam = new DriverExam();
		//DriverExam 객체를 생성
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//버스, 택시 객체 생성
		
		//drive() 메소드를 호출 할 때 Bus 객체와 Taxi객체를 제공
		driverExam.drive(bus);
		//자동타입변환 Vehicle vehicle = bus;
		driverExam.drive(taxi);
		//자동타입변환 Vehicle vehicle = taxi;
	}

}
