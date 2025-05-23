package ch04;

public enum Ranking {
	//열거 타입으로 자동으로 숫자 판단이 가능한 코드
	//이뮴에 활용되는 부분은 제한된 문자열을 숫자로 판단하는 역활을 많이 함
	//열거 타입에 선언된 상수는 대문자로 사용(여러문자일 경우 _ 으로 구분
	
	GUEST,
	MEMBER,
	VIP,
	VVIP,
	VVVIP
}
