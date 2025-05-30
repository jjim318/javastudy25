package ch04.Earth;

public class Earth {
	static final double PI = Math.PI;
	//PI = 3.14159;라고 적어도 되지만 정확한 계산을 위해서는 라이브러리에 있는 상수를 사용하는 것이 좋음
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4*PI*EARTH_RADIUS*EARTH_RADIUS;
	}

}
