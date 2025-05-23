package ch03;

import java.util.Scanner;

import javax.xml.stream.events.Namespace;

public class ArrayExam {

	public static void main(String[] args) {
		//개선 사항 - 성적 입력시 null값을 보고 넣어보기
		
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("====성적처림====");
		System.out.println("학생 수를 입력해주세요");
		System.out.print(">>>");
		
		int count = inputInt.nextInt();
		System.out.println(count+"명의 학생 성적을 입력하였습니다");
		
		String[] names = new String[count];//이름
		int [] nubs = new int[count];//학번(생년월일)
		int [] kors = new int[count];//국어점수
		int [] mats = new int[count];//수학점수
		int [] engs = new int[count];//영어점수
		
		boolean run = true;
		
		while(run) {
			System.out.println("===성적처리===");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 보기");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("0. 성적 프로그램 종료");
			System.out.print(">>>");
			
			int select = inputInt.nextInt();
			
			switch(select) {
			
			case 1 :
				System.out.println("성적입력 화면입니다");
				scoreAdd(names,nubs,kors,mats,engs);
				break;
			case 2 :
				System.out.println("성적보기 화면입니다");
				break;
				
			case 3 :
				System.out.println("성적수정 화면입니다");
				scoreMod(names,kors,mats,engs);
				break;
				
			case 4 :
				System.out.println("성적삭제 화면입니다");
				break;
				//삭제는 null처리
			case 0 :
				System.out.println("성적처리를 종료합니다");
				run = false;
				break;
				default :
					System.out.println("1~0까지만 입력하세요");
			
				
			}//switch 종료
			
		}//while문 종료
		
		

	}

	private static void scoreMod(String[] names, int[] kors, int[] mats, int[] engs) {
		// 성적 수정 메서드
				Scanner inputStr = new Scanner(System.in);
				Scanner inputInt = new Scanner(System.in);
				
				System.out.println("수정할 학생의 이름을 입력하세요");
				System.out.print(">>>");
				String nams = inputStr.nextLine();
				
				for(int i = 0; i < nams.length(); i++) {
					
					if(names.equals(nams)) {
						
						
						System.out.println(names[i] + "의 학생 점수");
						System.out.println("국어 : "+kors[i]);
						System.out.println("수학 : "+mats[i]);
						System.out.println("영어 : "+engs[i]);
						System.out.println("=========");
						System.out.println("수정할 점수를 입력하세요");
						System.out.println("수정 국어점수 : ");
						kors[i] = inputInt.nextInt();
						
						System.out.println("수정 수학점수 : ");
						mats[i] = inputInt.nextInt();
						
						System.out.println("수정 영어점수 : ");
						engs[i] = inputInt.nextInt();
						
						System.out.println("수정 완료");
						System.out.println("=========");
						
						System.out.println("국어 : "+kors[i]);
						System.out.println("수학 : "+mats[i]);
						System.out.println("영어 : "+engs[i]);
						System.out.println("수정이 완료되었습니다");
						
					}//if 종료
					
					
					
					
				}//for 종료
		
		
	}//성적 수정 메서드 종료

	private static void scoreAdd(String[] names,int[] nubs, int[] kors, int[] mats, int[] engs) {
		// 성적 입력 메서드
		
	}//성적 입력 메서드 종료

}
