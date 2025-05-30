package ch05.extended.prarent;

public class ChildExam {

	public static void main(String[] args) {
		Child ch = new Child();
		Parent pr = ch;//자동타입변환
		
		pr.method1();
		pr.method2();
		//pr.method3();//자식에 있는 건 호출 불가

	}

}
