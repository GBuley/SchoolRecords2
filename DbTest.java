package test;

import java.sql.*;

public class DbTest {
	
	public static Connection dbTest() {
		System.out.println("Using the DB");
		
		Connection conn = null;
		try {
			
			String url = "jdbc:sqlite:/Users/gbuley/Documents/SchoolRecordsDB.db";
			conn = DriverManager.getConnection(url);
			System.out.println("Connection to SQLite has been established.");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
			return conn;
	}
	
	public static void insertStudent(String firstName, String lastName, String id)  {
		String sql = "INSERT INTO Student(firstName, lastName, id) VALUES(?,?,?)";
		
		try(Connection conn = dbTest();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void insertTeacher(String firstName, String lastName, String id, String typeOf) {
		String sql = "INSERT INTO Teachers(firstName, lastName, id, typeOf) VALUES(?,?,?,?)";
		
		try(Connection conn = dbTest();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
					pstmt.setString(1, firstName);
					pstmt.setString(2, lastName);
					pstmt.setString(3, id);
					pstmt.setString(4, typeOf);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
	}
	
	public static void deleteStudent(String id) {
		String sql = "DELETE FROM Student WHERE id=?";
		try(Connection conn = dbTest();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setString(1, id);
				int row = pstmt.executeUpdate();
				System.out.println(row);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void selectAll(){
        String sql = "SELECT id, name, capacity FROM warehouses";
        
        try (Connection conn = dbTest();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("name") + "\t" +
                                   rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	
	public static void main(String[] args) {
		
	}
}
