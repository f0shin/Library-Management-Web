package com.library.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// 웹 애플리케이션의 이벤트 감지(초기화, 종료 등)를 담당

@WebListener
public class ContextListener implements ServletContextListener {
	
	@Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("✅ 웹 애플리케이션 초기화 완료!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("🛑 웹 애플리케이션 종료!");
    }

}
