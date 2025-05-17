package com.library.utils;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class DBInitializer {

    private final DataSource dataSource;

    public DBInitializer(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void initializeDatabase() {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement()) {
        	// h2
            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                         "id VARCHAR(36) PRIMARY KEY, " +
                         "name VARCHAR(100) NOT NULL, " +
                         "email VARCHAR(100) NOT NULL)";
            // oracleDB
//            String sql = "CREATE TABLE IF NOT EXISTS users (" +
//                         "id VARCHAR2(36) PRIMARY KEY, " +
//                         "name VARCHAR2(100) NOT NULL, " +
//                         "email VARCHAR2(100) NOT NULL)";
            
            stmt.execute(sql);
            conn.setAutoCommit(true); // 자동 커밋 활성화

            System.out.println("✅ 테이블 생성 완료! 🎉");

        } catch (SQLException e) {
            System.err.println("❌ 테이블 생성 실패:");
            e.printStackTrace();
        }
    }
}
