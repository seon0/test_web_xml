package com.comtrue.shsync.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextUtil  implements ServletContextListener{
	
	private static ServletContext servletContext = null;

	public static ServletContext getServletContext() {
		return servletContext;
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		servletContext = sce.getServletContext();
		
		Timestamp logTime = Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
		
//        AdminLog adminLog = new AdminLog(AdminLog.Action.서버시작.toString(), "감사시작", logTime);
//
//        // 서버 시작에 대한 감사 기록 로그를 저장한다.
//        insertAuditLogOfServer(adminLog);

		System.out.println(logTime + " : shsync 서버를 시작합니다.");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		Timestamp logTime = Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));

//        AdminLog adminLog = new AdminLog(AdminLog.Action.서버종료.toString(), "감사종료", logTime);
//
//        // 서버 종료에 대한 감사 기록 로그를 저장한다.
//        insertAuditLogOfServer(adminLog);
		
		
		System.out.println(logTime + " : shsync 서버를 종료합니다.");
	}

}
