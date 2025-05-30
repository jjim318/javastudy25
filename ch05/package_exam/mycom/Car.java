package ch05.package_exam.mycom;

import ch05.package_exam.hankook.SnowTrie;
import ch05.package_exam.hyndai.Engine;
import ch05.package_exam.kumho.BigWidthTire;
import ch05.package_exam.kumho.SportTire;

public class Car {
	//필드
	public String company;
	public String model;
	
	//한국 타이얼르 객체로 만듦
	//tirl = new Tire();
	ch05.package_exam.hankook.Tire tire1 = new ch05.package_exam.hankook.Tire();
	//두가지 모두 import 생성 가능
	//같은 말이기 때문에 import는 한개
	
	//엔진은 기아 부품으로 사용함(import확인
	Engine kiaEngine = new Engine();
	SnowTrie snowTrie = new SnowTrie();
	BigWidthTire bigWidthTire = new BigWidthTire();
	SportTire sportTire = new SportTire();
	
	//생성자
	
	
	
	//메서드

}
