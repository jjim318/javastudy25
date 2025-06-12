package mbcboard.dto;

public class MemberDTO {
	//회원의 객체를 담당
	//필드(테이블에 있는 모든 자료를 입력
	private int mno;
	private String bwriter;
	private String id;
	private String pw;
	//private date regidate - sql에서 자동생성으로 만들었음
	
	//기본생성자
	
	//메서드 게터(출력)/세터(입력)
	public int getMno() {
		return mno;
	}
	public String getBwriter() {
		return bwriter;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

}
