package ch04.MarioKart.dto;

public class MemberDTO {
	//필드
	public String id;
	public String pw;
	public String nickName;
	public String email;
	
	public CharacterDTO characterDTO;
	
	
	public MemberDTO() {}
	
	public MemberDTO(String id, String pw, String nickName, String email, CharacterDTO characterDTO) {
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
		this.email = email;
		this.characterDTO = characterDTO;
	}
	
	
	
	//생성자

	
	
	
	//메서드
}
