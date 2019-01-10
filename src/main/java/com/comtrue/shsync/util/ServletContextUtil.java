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
		
//        AdminLog adminLog = new AdminLog(AdminLog.Action.��������.toString(), "�������", logTime);
//
//        // ���� ���ۿ� ���� ���� ��� �α׸� �����Ѵ�.
//        insertAuditLogOfServer(adminLog);

		System.out.println(logTime + " : shsync ������ �����մϴ�.");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		Timestamp logTime = Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));

//        AdminLog adminLog = new AdminLog(AdminLog.Action.��������.toString(), "��������", logTime);
//
//        // ���� ���ῡ ���� ���� ��� �α׸� �����Ѵ�.
//        insertAuditLogOfServer(adminLog);
		
		
		System.out.println(logTime + " : shsync ������ �����մϴ�.");
	}

}
