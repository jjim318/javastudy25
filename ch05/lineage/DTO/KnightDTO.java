package ch05.lineage.DTO;

public class KnightDTO extends HumanDTO{
	//객체를 상속함
	//필드
	private String sword;//칼
	private String armor;//갑옷
	private String shield;//방패
	

	//생성자
	
	//메서드
	public String getSword() {
		return sword;
	}
	public String getArmor() {
		return armor;
	}
	public String getShield() {
		return shield;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
	
	

}
