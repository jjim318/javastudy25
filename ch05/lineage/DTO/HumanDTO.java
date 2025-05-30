package ch05.lineage.DTO;

public class HumanDTO {
	//부모 역할 객체
	//필드
	public String name;
	public String sex;
	public String level;
	public int hp;
	public int mp;
	public int money;
	
	//생성자
	
	//메서드 (게터:출력용 세터:입력용 메서드
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public String getLevel() {
		return level;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getMoney() {
		return money;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
