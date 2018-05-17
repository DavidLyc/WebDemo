package lab3;

import java.sql.*;

public class BookDAO {

    // 根据书号查询图书信息
    public BookBean searchBook(String bookid) {
        PreparedStatement pstmt;
        ResultSet rst;
        BookBean book = new BookBean();
        String dburl = "jdbc:mysql://localhost:3306/bookstore?useSSL=false&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection(dburl, "root", "******");
            String sql = "SELECT * FROM books WHERE bookid =" + bookid;
            pstmt = conn.prepareStatement(sql);
            rst = pstmt.executeQuery();
            if (rst.next()) {
                book.setBookid(rst.getString("bookid"));
                book.setTitle(rst.getString("title"));
                book.setAuthor(rst.getString("author"));
                book.setPublisher(rst.getString("publisher"));
                book.setPrice(rst.getFloat("price"));
                return book;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}