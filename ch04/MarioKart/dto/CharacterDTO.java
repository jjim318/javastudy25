package ch04.MarioKart.dto;

public class CharacterDTO {
	//필드
	public String name;
	public double weight;
	public double speed;
	public double acceleration;
	public double handling;
	public double friction;
	
	//생성자
	public CharacterDTO(String name, double weight, double speed, double acceleration, double handling, double friction){
		
		this.name = name;
		this.weight = weight;
		this.speed = speed;
		this.acceleration = acceleration;
		this.handling = handling;
		this.friction = friction;
	}
	//메서드
//	public String toString() {//객체 필드 정보를 출력
//		return "characterDTO [name =" + name + ", weight="+ weight+", speed=" +speed+", acceleration="+ acceleration+", handling="+handling+", friction="+friction+"]";
//	}
	
	
}
