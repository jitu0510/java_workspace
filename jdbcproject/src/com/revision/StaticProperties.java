package com.revision;

import java.io.FileOutputStream;
import java.util.Properties;

public class StaticProperties {
public static void main(String[] args) {
	try {
	FileOutputStream fileOutputStream=new FileOutputStream("Static.properties");
	Properties properties=new Properties();
	properties.setProperty("1","Insert into dept values(21,'DEVELOPMENT','BANGALORE')");
	
	properties.setProperty("2","select * from dept where deptno=21" );
	
	properties.setProperty("3"," update DEPT set loc='DELHI' where deptno=21" );
	
	properties.setProperty("4","delete from dept where deptno=21" );
	
	properties.store(fileOutputStream, null);
	System.out.println("hello");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
