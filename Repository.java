import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final String url;

    public Repository(String url) {
        this.url = url;
    }

    public void initializeDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "first_name TEXT NOT NULL," +
                     "last_name TEXT NOT NULL," +
                     "age INTEGER NOT NULL," + "gender TEXT NOT NULL," + 
                     "email TEXT NOT NULL," + "phone_number TEXT NOT NULL," + 
                     "address TEXT NOT NULL," + 
                     "course TEXT NOT NULL," + 
                     "year_level INTEGER NOT NULL" +
                     ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student student) {
        String sql = "INSERT INTO students(first_name, last_name, age, gender,"
                + " email, phone_number, address, course, year_level) VALUES(?, "
                + "?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setInt(3, student.getAge());
            pstmt.setString(4, student.getGender());
            pstmt.setString(5, student.getEmail());
            pstmt.setString(6, student.getPhoneNumber());
            pstmt.setString(7, student.getAddress());
            pstmt.setString(8, student.getCourse());
            pstmt.setInt(9, student.getYearLevel());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT id, first_name, last_name, age, gender, email, "
                + "phone_number, address, course, year_level FROM students";
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

    Student s = new Student.Builder()
            .setId(rs.getInt("id"))
            .setFirstName(rs.getString("first_name"))
            .setLastName(rs.getString("last_name"))
            .setAge(rs.getInt("age"))
            .setGender(rs.getString("gender"))
            .setEmail(rs.getString("email"))
            .setPhoneNumber(rs.getString("phone_number"))
            .setAddress(rs.getString("address"))
            .setCourse(rs.getString("course"))
            .setYearLevel(rs.getInt("year_level"))
            .build();

            students.add(s);
        }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}
