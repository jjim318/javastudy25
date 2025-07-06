package mvc.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.model.aniBook;
import mvc.model.aniDAO;

public class aniController extends HttpServlet {
	
	static final int LISTCOUNT = 5;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());

		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		if (command.equals("/AniListAction.do")) {// 애니책상품 목록 페이지 출력
			requestAniList(request);
			RequestDispatcher rd = request.getRequestDispatcher("./books.jsp");
			rd.forward(request, response);
		} else if (command.equals("/AddBook.do")) {// 애니책상품 등록 페이지 출력
			
			requestAdd(request);
			RequestDispatcher rd = request.getRequestDispatcher("/AniListAction.do");
			rd.forward(request, response);
//				response.sendRedirect("AniListAction.do");
//				return;
			
		} else if (command.equals("/AniUpdateForm.do")) {// 애니책상품 수정 페이지 출력
			
			requestBookDetail(request);
			RequestDispatcher rd = request.getRequestDispatcher("./editBook.jsp");
			rd.forward(request, response);
		} else if (command.equals("/AniUpdateAction.do")) {// 애니책상품 수정 실행
			
			requestAniUpdate(request);
			RequestDispatcher rd = request.getRequestDispatcher("/AniListAction.do");
			rd.forward(request, response);
				 
		} else if (command.equals("/AniDeleteForm.do")) {// 애니책상품 삭제 페이지 출력
			
			String bookId = request.getParameter("bookId");
			request.setAttribute("bookId", bookId);
			RequestDispatcher rd = request.getRequestDispatcher("./deleteBook.jsp");
			rd.forward(request, response);
		} else if (command.equals("/AniDeleteAction.do")) {// 애니책상품 삭제 페이지 출력
			
				requestAniDelete(request);
				RequestDispatcher rd = request.getRequestDispatcher("/AniListAction.do");
				rd.forward(request, response);
		} else if (command.equals("/BookDetail.do")) {//상세보기
			requestBookDetail(request);
			RequestDispatcher rd = request.getRequestDispatcher("./book.jsp");
			rd.forward(request, response);
		}
	}

	private void requestBookDetail(HttpServletRequest request) {
		// 상세보기
		
		String bookId = request.getParameter("bookId");
		System.out.println(bookId);
		aniDAO dao = aniDAO.getInstance();
	    aniBook book = dao.getBookById(bookId);
	    System.out.println(book);
	    request.setAttribute("book", book);
	}

	private void requestAniDelete(HttpServletRequest request) {
	    // 책 삭제 처리

	    String bookId = request.getParameter("bookId");  // 삭제할 책의 ID

	    aniDAO dao = aniDAO.getInstance();

	    // 삭제 실행
	    dao.deleteBook(bookId);
	}


	private void requestAniUpdate(HttpServletRequest request) {
	    // 책 정보 수정 처리
	    aniBook book = new aniBook();
	    aniDAO dao = aniDAO.getInstance();
	    

	    // 필드 설정
	    book.setBookId(request.getParameter("bookId"));
	    book.setName(request.getParameter("name"));
	    book.setUnitPrice(Integer.parseInt(request.getParameter("unitPrice")));
	    book.setAuthor(request.getParameter("author"));
	    book.setDescription(request.getParameter("description"));
	    book.setPublisher(request.getParameter("publisher"));
	    book.setCategory(request.getParameter("category"));
	    book.setUnitsInStock(Long.parseLong(request.getParameter("unitsInStock")));
	    book.setReleaseDate(request.getParameter("releaseDate"));
	    book.setCondition(request.getParameter("condition"));
	    book.setFilename(request.getParameter("filename"));
	    book.setQuantity(Integer.parseInt(request.getParameter("quantity")));

	    //수정 처리
	    dao.updateBook(book);
	}


	private void requestAdd(HttpServletRequest request) {
	    // 책 등록 처리
	    aniDAO dao = aniDAO.getInstance();

	    aniBook book = new aniBook();

	    book.setBookId(request.getParameter("bookId"));
	    book.setName(request.getParameter("name"));
	    book.setUnitPrice(Integer.parseInt(request.getParameter("unitPrice")));
	    book.setAuthor(request.getParameter("author"));
	    book.setDescription(request.getParameter("description"));
	    book.setPublisher(request.getParameter("publisher"));
	    book.setCategory(request.getParameter("category"));
	    book.setUnitsInStock(Long.parseLong(request.getParameter("unitsInStock")));
	    book.setReleaseDate(request.getParameter("releaseDate"));
	    book.setCondition(request.getParameter("condition"));
	    book.setFilename(request.getParameter("filename"));
	    book.setQuantity(Integer.parseInt(request.getParameter("quantity")));

	    System.out.println("등록된 책 이름: " + book.getName());
	    System.out.println("저자: " + book.getAuthor());
	    System.out.println("출판사: " + book.getPublisher());

	    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd(HH:mm:ss)");
	    String regist_day = formatter.format(new java.util.Date());

	    // DB에 등록
	    dao.insertBook(book);
	}


	private void requestAniList(HttpServletRequest request) {
	    // 책 목록 불러오기
		aniDAO dao = aniDAO.getInstance();
	    ArrayList<aniBook> booklist = dao.getAllBooks();  // 모든 책 리스트 불러오기
	    request.setAttribute("booklist", booklist);
	}

}
