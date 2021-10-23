package com.revision;

import java.io.FileOutputStream;
import java.util.Properties;

public class DynamicProperties {
public static void main(String[] args) {
	try {
	FileOutputStream fileOutputStream=new FileOutputStream("Dynamic.properties");
	Properties properties=new Properties();
	properties.setProperty("1","Insert into dept values(?,?,?)");
	
	properties.setProperty("2","select * from dept where deptno=?" );
	
	properties.setProperty("3"," update DEPT set loc=? where deptno=?" );
	
	properties.setProperty("4","delete from dept where deptno=?" );
	
	properties.store(fileOutputStream, null);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}