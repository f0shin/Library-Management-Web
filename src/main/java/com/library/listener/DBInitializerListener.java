package com.library.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.library.utils.DBInitializer;

@Component
public class DBInitializerListener implements ApplicationListener<ContextRefreshedEvent> {

    private final DBInitializer dbInitializer;

    public DBInitializerListener(DBInitializer dbInitializer) {
        this.dbInitializer = dbInitializer;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("🔹 Spring 컨텍스트 초기화 완료! DB 설정 시작...");
        dbInitializer.initializeDatabase();
        System.out.println("✅ DB 초기화 완료!");
    }
}
