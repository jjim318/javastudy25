package ch04;

import java.util.Scanner;

public class Car {
	//필드(객체가 가지고 있어야 하는 값) -> 글로벌변수(GV)
			//고유 데이터
			public String company ;//제작회사(현대, 기아, 아우디 등등
			public String model ;//아반떼, 그렌져, 쏘나타 등등
			public String color ;//빨, 검, 은 등등
			public String productionYear;
			
			public int maxSpeed = 1500;//최고 속도
			public int minSpeed = 0;
			public int minOil = 0;
			public int maxOil = 300;
			public String oilType;//경유 휘발유
			
			//상태값(변동가능
			public int speed ;
			public int rpm ;
			public int oil ;
			
			//부품 -> 다른 클래스를 생성하여 연결
//			public Body body;
//			public Engine engine;
//			public Tire tire;
			
			//부품에 필드 사용법
			//car myCar = new Car(); -> 객체 생성(인스턴스
			//myCar.maxSpeed = 300 ; -> 객체에 있는 maxSpeed에 300 정수를 넣는다
			
			//===========================================================
		
			//기본 생성자:생략이 가능함(객체가 생성할 때 사용되는 메서드 : 클래스 명과 같은 이름을 가지고 있어야 함)
			public Car() {
				speed = 0;
				rpm = 50;
				oil = 100;
				
			}//객체가 생성되면서 변수에 값이 저장됨
			
			//사용자 지정 생성자-> 개발자가 응용하는 기법
			//사용자 지정 생성자가 만들어지면 기본 생성자는 자동으로 생성되지 않음***
			public Car(String company, String model, String color) {
				this.company = company;//this.을 사용하면 위로 넘어감
				this.model = model;
				this.color = color;
			}//Car myCar = new Car("부가티","라-","매트 블랙") ;
			
			
			
		
		
			//메서드(객체가 수행해야 되는 동작)
			//c(시동) r(주행상태, 차량상태) u(가속,감속,주차) d(시동종료)
			public void start() {
				System.out.println(this.model+"이(가) 시동이 걸렸습니다");
				System.out.println("현재 속도는 "+this.speed+"입니다");
				System.out.println("현재 rpm은 "+this.rpm+"입니다");
				System.out.println("현재 주유량은 "+this.oil+"입니다");
				System.out.println("c");
			}
			
			public void drive(Scanner input) {
				
				System.out.println(this.model+"이(가) 주행을 시작합니다");
				
				while(true) {
				System.out.println("-----------------------");
				System.out.println("1. 엔진가속  | 2. 브레이크 ");
				System.out.println("-----------------------");
				System.out.println("3. 멀티미디어 | 4. 주유하기 ");
				System.out.println("-----------------------");
				System.out.print(">>>");
				int speedInput = input.nextInt();
				
				switch(speedInput) {
				
				case 1 :
				System.out.println("가속을 진행합니다.");
				speed += 100 ;  
				if(speed >= maxSpeed) { // 현재속도가 최고속도보다 크거나 같으면!
				speed = maxSpeed; 
				} // 1500이상 출력 안됨
				
				oil -= 5;
				if(oil<= minOil) {
					oil = minOil ;
				}
				System.out.println("현재 속도 : " + speed + "마력입니다");
				System.out.println("기름이 "+ oil +"줄었습니다");
				break;
				case 2 :
					System.out.println("감속을 진행합니다.");
					speed -= 10 ;
					if(speed <= minSpeed) {
					speed = maxSpeed ;
					}
					
					oil -= 5;
					if(oil<= minOil) {
						oil = minOil ;
					}
					System.out.println("현재 속도 : " + speed + "마력입니다");
					System.out.println("기름이 "+ oil +"줄었습니다");
					break;

					case 3 :
					System.out.println("멀티미디어를 실행합니다.");
					break;
					case 4 :
					System.out.println("주유를 진행합니다.");
					oil += 200;
					if(oil < maxOil) {
						oil = maxOil;
					}
					System.out.println(oil+"만큼 주유가 되었습니다");
					System.out.println("");
					break;
					} // 스위치문 종료
					} // while문 종료
					

				
				

			}
}
