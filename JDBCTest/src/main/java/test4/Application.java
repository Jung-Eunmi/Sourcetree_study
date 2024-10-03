package test4;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

public class Application {

    public static void main(String[] args) {
        //-- 원하는 행과 컬럼 조회
        //-- EMPLOYEE 테이블에서 급여가 300만원 이상인 사원의
        //-- 사번, 이름, 부서코드, 급여를 조회하세요
        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/mapper/employee-query.xml"));
            String query = prop.getProperty("SelectEmployee3");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
            System.out.println("사번 이름 부서코드 급여");
            while (rset.next()){

                System.out.println(rset.getString("EMP_ID")+" " + rset.getString("EMP_NAME") +" "+
                        rset.getString("DEPT_CODE") +" "+ rset.getInt("SALARY"));
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
