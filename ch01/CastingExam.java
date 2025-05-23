package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int intValue = 993182302;
		 byte byteValue =(byte)intValue;
		 
		 System.out.println(intValue);
		 System.out.println(byteValue);
		 
		 
		 int kor = 100;
		 int mat = 93;
		 int eng = 97;
		 
		 int total = kor+mat+eng;
		 double avg =total/ 3;
		 
		 System.out.println(avg);
		 
		 avg = (double)total / 3;
		 System.out.println(avg);
	}

}
