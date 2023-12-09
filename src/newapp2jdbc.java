import javax.swing.*;
import java.sql.*;
// C:\Users\MyPC One Pro H5\Downloads\mysql-connector-j-8.2.0\mysql-connector-j-8.2.0

public class newapp2jdbc
{
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sip";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection connect;
    
    private static void connection(){
        try {
        Class.forName(JDBC_DRIVER);
        connect = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = connect.createStatement();
        String query = "select buku.nama, author.nama, kategori.genre from buku join author on buku.author_id = author.id join kategori on kategori.genre = buku.kategori_id";
        ResultSet result = st.executeQuery(query);

        } catch (Exception e)
        {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws Exception
    {
        connection();


        /*
        JFrame frame = new JFrame();
        JButton button1 = new JButton("test");
        button1.setBounds(130, 100, 100, 40);
        button1.setSize(200,100);

        frame.add(button1);
        frame.setSize(400,500);
        frame.setVisible(true);
        */
        

        
    }
}