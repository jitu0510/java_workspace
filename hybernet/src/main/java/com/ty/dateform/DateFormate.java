package com.ty.dateform;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
	public static void main(String[] args) {
		String sdate = "12/09/1993";
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(sdate);
			System.out.println("Util Date :" + date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date date1 = new java.sql.Date(date.getTime());
		System.out.println("Sql Date :" + date1);
	}
}
