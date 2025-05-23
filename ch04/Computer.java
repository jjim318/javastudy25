package ch04;

public class Computer {
	int sum1(int[] values) {//배열을 만들어서 계산후 리턴
		int sum = 0;//합계 누적 값
		for(int i = 0; i<values.length; i++) {
			sum+= values[i];
		}
		return sum;
	}

	int sum2(int ... values) {//매개값을 확인하여 배열생성
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
