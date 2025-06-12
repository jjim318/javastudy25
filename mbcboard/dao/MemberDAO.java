package mbcboard.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.dto.BoardDTO;
import mbcboard.dto.MemberDTO;

public class MemberDAO {
	//게시판의 db와 연동
		//jdbc 5단계를 사용
		//1 : Connect 객체를 사용하여 ojdbc6.jar를 생성
		//2 : url, id, pw, sql 쿼리문을 작성
		//3 : 쿼리문을 실행
		//4 : 쿼리문 실행 결과를 바음
		//5 : 연결종료
	
	//필드
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null;//1단계에서 사용하는 객체
	public Statement statement = null;//3단계에서 사용하는 객체(구형),변수 직접처리 '" +name+"'
	public PreparedStatement preparedStatement = null;//3단계에서 사용하는 객체(신형),?(인파라미터)
	public ResultSet resultSet = null;//4단계에서 결과 받는 표 객체 executeQuery(select 결과)
	public int result = 0;//4단계에서 결과 받는 정수 executeUpdate(insert, update, delete)
	//1개의 행이 삽입 | 수정 | 삭제 되었습니다(정상처리 - commit)
	//0개의 행이 삽입 | 수정 | 삭제 되었습니다(비정상처리 - rollback)
	
	//기본생성자
	public MemberDAO() {
		try {
			//예외가 발생할 수 있는 실행문
			//프로그램 강제종료 처리용
			Class.forName("oracle.jdbc.driver.OracleDriver");//1단계 ojdbc6.jar 호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest", "boardtest");
			//2단계
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 이름이나, ojdbc6.jar 파일이 잘못되었습니다");
			e.printStackTrace();//오류보기
			System.exit(0);
		}catch(SQLException e) {
			System.out.println("url, id, pw가 잘못되었습니다 BoardDAO에 기본생성자를 확인하세요");
			e.printStackTrace();//오류보기
			System.exit(0);
		}
	}//기본생성자 종료

	public void deletemember(MemberDTO session) throws SQLException {
		//서비스에서 받은 회원의 번호를 이용하여 데이터를 삭제
		try {
			String sql = "delete from member where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, session.getId());
			
			result = preparedStatement.executeUpdate();//쿼리문 실행 후 결과를 정수로 나타냄
			
			if(result > 0 ) {
				System.out.println(result+"개의 회원이 탈퇴되었습니다");
				connection.commit();
			}else {
				System.out.println("탈퇴가 되지 않았습니다");
				connection.rollback();
			}
			System.out.println("-----------------");
			selectMBAll();//삭제후 전체리스트
		}catch(SQLException e) {
			System.out.println("예외발생 : deletemember()메서드와 sql문을 확인");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
	}

	public void selectMBAll() throws SQLException {
		//회원전체보기 결과 출력
		try {
			String sql = "select mno, bwriter, id from member";
			//데이터베이스에 member테이블 내용을 가져옴
			
			statement = connection.createStatement();//쿼리문을 실행 객체 생성
			resultSet = statement.executeQuery(sql);
			
			System.out.println("번호\t 이름\t id\t");
			while(resultSet.next()) {
				//결과 표를 아래에서부터 위까지 출력
				System.out.print(resultSet.getInt("mno")+"\t");
				System.out.print(resultSet.getString("bwriter")+"\t");
				System.out.println(resultSet.getString("id")+"\t");
			}//while out
			System.out.println("-----끗-----");
		}catch(SQLException e) {
			System.out.println("selectMBAll()메서드에 쿼리문이 잘못");
			e.printStackTrace();
		}finally {
			resultSet.close();
			statement.close();
		}
		
	}

	public void join(MemberDTO memberDTO) throws SQLException {
		//회원가입 결과 출력
		try {
			String sql = "insert into member(mno, bwriter, id, pw) "
					+" values(board_seq.nextval, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			//System.out.println("쿼리 확인 : "+sql1);
			
			int result = preparedStatement.executeUpdate();//쿼리문 실행해서 결과를 정수로 출력
			
			
			
			if(result>0) {
				System.out.println(result+"개의 회원이 가입되었습니다");
				connection.commit();
			}else {
				System.out.println("쿼리 실행 결과 :"+result);
				System.out.println("입력실패");
				connection.rollback();
			}
		
		}catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("중복된 아이디");
			System.out.println("다른아이디로 가입하세여");
		}catch(SQLException e) {
			System.out.println("예외 발생 : join()메서드에 쿼리문 확인");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
	}

	public void updateUser(String updateId, Scanner inputStr) throws SQLException {
		//id를 찾아서 비밀번호 수정
		
		MemberDTO memberDTO = new MemberDTO();//빈객체 생성
		
		System.out.println("바꿀 pw");
		System.out.print("pw : ");
		memberDTO.setPw(inputStr.next());
		
		try {
			String sql = "update member set pw = ? where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getPw());
			preparedStatement.setString(2, updateId);
			
			result = preparedStatement.executeUpdate();
			
			if(result > 0) {
				System.out.println(result + "개의 회원이 수정되었습니다");
				connection.commit();
			}else {
				System.out.println("수정이 되지 않았습니다");
				connection.rollback();
			}
		}catch(SQLException e) {
			System.out.println("예외 발생 : updateUser()메서드와 sql문을 확인");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
	}

	public MemberDTO loginMember(MemberDTO session) throws SQLException {
		//로그인 결과 출력
		
		try {
			String sql = "select * from member where id =? and pw =?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, session.getId());
			preparedStatement.setString(2, session.getPw());
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				session.setId(resultSet.getString("id"));
				session.setPw(resultSet.getString("pw"));
				session.setBwriter(resultSet.getString("bwriter"));
				session.setMno(resultSet.getInt("mno"));
				System.out.println("로그인이 됨");
				//connection.commit();
				return session;
				
			}else {
				System.out.println("로그인이 안 됨");
				connection.rollback();
			}
			
		}catch(SQLException e) {
			System.out.println("예외 발생 : loginMember()메서드와 sql문 확인");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			resultSet.close();
		}
		
		return session;
		
	
	}
	
	//메서드
	

}
