package ch04.test;

public class TestClass {
	
	public String id;
	public String pw;
	public String email;
	public String nickName;
	
	// 생성자
	// 기본생성자는 사용자가 생성자에 대해 아무런 정의도 하지 않았을 경우 알아서 생성된다.
	// 기본 생성자의 형태 : public TestClass() {}	-> 생성자의 역할은 오롯이 해당 클래스의 객체를 생성하는데 있다.	
	
	// 사용자 정의 생성자.
	// 생성자는 생성과 동시에 수행되어야 하는 행동을 정의할 수 있다.
	public TestClass() {
		System.out.println("TestClass 생성 완료!!");
	}
	
	public TestClass(String id, String pw, String email, String nickName) {
		System.out.println("엄마 보고싶다ㅠㅠ");
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.nickName = nickName;
	}
	
	public TestClass(String id, String pw) {
		System.out.println("아이디와 비밀번호만 입력받아서 객체 생성");
		this.id = id;
		this.pw = pw;
	}

}
