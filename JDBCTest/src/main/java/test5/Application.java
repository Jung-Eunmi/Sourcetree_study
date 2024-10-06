package test5;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static common.Template.close;
import static common.Template.getConnection;

public class Application {

    public static void main(String[] args) {

        //-- 부서코드가 D6이고 급여를 200만원보다 많이 받는 직원의
        //-- 이름, 부서코드, 급여 조회

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/mapper/employee-query.xml"));

            String query = prop.getProperty("SelectEmployee4");

            pstmt = con.prepareStatement(query);

            rset = pstmt.executeQuery();
            System.out.println("이름    부서코드  급여");
            while (rset.next()){
                System.out.println(rset.getString("EMP_NAME")+"   "+rset.getString("DEPT_CODE")
                    +"      "+ rset.getInt("SALARY"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(con);
            close(pstmt);
        }

    }

}
