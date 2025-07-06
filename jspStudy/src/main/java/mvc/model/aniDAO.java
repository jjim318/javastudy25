package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mvc.database.DBConnection;

public class aniDAO {

	private ArrayList<aniBook> listOfBooks = new ArrayList<aniBook>();

	private static aniDAO instance;

	private aniDAO() {
	}

	public static aniDAO getInstance() {
		System.out.println("getInstance");
		if (instance == null)
			instance = new aniDAO();
		return instance;
	}

	private Connection getConnection() throws SQLException, ClassNotFoundException {
		return DBConnection.getConnection();
	}

	public void deleteBook(String bookId) {
		// 삭제
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			String sql = "DELETE FROM book WHERE b_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookId);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("책 삭제 성공: " + bookId);
			} else {
				System.out.println("삭제할 책이 없습니다: " + bookId);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {pstmt.close();} catch (SQLException e) {}
			try {conn.close();} catch (SQLException e) {}
		}
	}

	public void updateBook(aniBook book) {
		// 수정
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBConnection.getConnection();

			String sql = "UPDATE book SET "
					+ "b_name = ?, b_unitPrice = ?, b_author = ?, b_description = ?, b_publisher = ?, "
					+ "b_category = ?, b_unitsInStock = ?, b_releaseDate = ?, b_condition = ?, b_fileName = ? "
					+ "WHERE b_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getName());
			pstmt.setInt(2, book.getUnitPrice());
			pstmt.setString(3, book.getAuthor());
			pstmt.setString(4, book.getDescription());
			pstmt.setString(5, book.getPublisher());
			pstmt.setString(6, book.getCategory());
			pstmt.setLong(7, book.getUnitsInStock());
			pstmt.setString(8, book.getReleaseDate());
			pstmt.setString(9, book.getCondition());
			pstmt.setString(10, book.getFilename());
			pstmt.setString(11, book.getBookId());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("책 정보 수정 성공: " + book.getBookId());
			} else {
				System.out.println("수정할 책을 찾을 수 없습니다: " + book.getBookId());
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {pstmt.close();} catch (SQLException e) {}
			try {conn.close();} catch (SQLException e) {}
		}
	}

	public void insertBook(aniBook book) {
		//등록
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBConnection.getConnection();

			String sql = "INSERT INTO book (b_id, b_name, b_unitPrice, b_author, b_description, b_publisher, "
					+ "b_category, b_unitsInStock, b_releaseDate, b_condition, b_fileName) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			pstmt.setString(2, book.getName());
			pstmt.setInt(3, book.getUnitPrice());
			pstmt.setString(4, book.getAuthor());
			pstmt.setString(5, book.getDescription());
			pstmt.setString(6, book.getPublisher());
			pstmt.setString(7, book.getCategory());
			pstmt.setLong(8, book.getUnitsInStock());
			pstmt.setString(9, book.getReleaseDate());
			pstmt.setString(10, book.getCondition());
			pstmt.setString(11, book.getFilename());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("책 등록 성공: " + book.getBookId());
			} else {
				System.out.println("책 등록 실패: " + book.getBookId());
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {pstmt.close();} catch (SQLException e) {}
			try {conn.close();} catch (SQLException e) {}
		}
	}

	public ArrayList<aniBook> getAllBooks() {
		//목록
	    ArrayList<aniBook> booklist = new ArrayList<>();
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    try {
	        conn = DBConnection.getConnection();  // DB 연결

	        String sql = "select * from book";
	        pstmt = conn.prepareStatement(sql);
	        rs = pstmt.executeQuery();

	        while (rs.next()) {
	            aniBook book = new aniBook();
	            book.setBookId(rs.getString("b_id"));
	            book.setName(rs.getString("b_name"));
	            book.setUnitPrice(rs.getInt("b_unitPrice"));
	            book.setAuthor(rs.getString("b_author"));
	            book.setDescription(rs.getString("b_description"));
	            book.setPublisher(rs.getString("b_publisher"));
	            book.setCategory(rs.getString("b_category"));
	            book.setUnitsInStock(rs.getLong("b_unitsInStock"));
	            book.setReleaseDate(rs.getString("b_releaseDate"));
	            book.setCondition(rs.getString("b_condition"));
	            book.setFilename(rs.getString("b_fileName"));

	            booklist.add(book);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null)
	            	rs.close();
	            if (pstmt != null)
	            	pstmt.close();
	            if (conn != null)
	            	conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return booklist;
	}

	public aniBook getBookById(String bookId) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		aniBook book = new aniBook();
		
		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT * FROM book WHERE b_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				
	            book.setBookId(rs.getString("b_id"));
	            book.setName(rs.getString("b_name"));
	            book.setUnitPrice(rs.getInt("b_unitPrice"));
	            book.setAuthor(rs.getString("b_author"));
	            book.setDescription(rs.getString("b_description"));
	            book.setPublisher(rs.getString("b_publisher"));
	            book.setCategory(rs.getString("b_category"));
	            book.setUnitsInStock(rs.getLong("b_unitsInStock"));
	            book.setReleaseDate(rs.getString("b_releaseDate"));
	            book.setCondition(rs.getString("b_condition"));
	            book.setFilename(rs.getString("b_fileName"));
				System.out.println("책 조회 성공: " + bookId);
			} else {
				System.out.println("조회할 책이 없습니다: " + bookId);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {pstmt.close();} catch(SQLException e) {}
			try {conn.close();} catch(SQLException e) {}
		}
		
		return book;
	}


}
