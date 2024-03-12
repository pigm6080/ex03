package org.zerock.persistence;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 드라이버 클래스로 변경
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @Test
    public void testConnection() {
        try( Connection con =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/kimjewog", // MySQL 연결 URL 형식으로 변경
                        "root",
                        "1234"                        
                        )) {
            log.info(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}