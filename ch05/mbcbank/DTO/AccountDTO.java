package ch05.mbcbank.DTO;

public class AccountDTO {
	//개인적 필드
	private String ano;
	private String owner;
	private int balance;
	private String bankname;
	
	//생성자
	public AccountDTO(String ano, String owner, int balance, String bankname) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = bankname;
	}
	//모든 필드를 사용한 생성자
	public AccountDTO() {//기본생성자
		
	}
	//메서드

	public String getAno() {
		//계좌번호 출력시 변조를 담당
		return ano;
	}

	public String getOwner() {
		//계좌주 출력시 변조를 담당
		return owner;
	}

	public int getBalance() {
		//잔고를 출력시 변조를 담당
		return balance;
	}

	public String getBankname() {
		//은행명 출력시 변조를 담당
		return bankname;
	}

	public void setAno(String ano) {
		//계좌번호 입력시 검증 처리용
		this.ano = ano;
	}

	public void setOwner(String owner) {
		//계좌주 입력시 검증처리용
		this.owner = owner;
	}

	public void setBalance(int balance) {
		//계좌금액 입력시 검증처리용
		this.balance = balance;
	}

	public void setBankname(String bankname) {
		//은행명 입력시 검증처리용
		this.bankname = bankname;
	}

	

	@Override
	public String toString() {
		return "계좌번호는 " + ano + ", 예금주명은 " + owner + ", 잔액은 " + balance + ", 은행명은 " + bankname;
	}

}
