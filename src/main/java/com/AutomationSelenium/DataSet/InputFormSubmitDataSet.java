package com.AutomationSelenium.DataSet;

import com.AutomationSeleniumEasy.Utilities.XlsReader;

public class InputFormSubmitDataSet {
	
	static XlsReader xlsreader = new XlsReader();
	
	public static final String firstname = xlsreader.getCellDataByColumnName("testdata", "firstname", 1);
	
	public static final String lastname = xlsreader.getCellDataByColumnName("testdata", "lastname", 1);
	
	public static final String email = xlsreader.getCellDataByColumnName("testdata", "email", 1);
	
	public static final String phone = xlsreader.getCellDataByColumnName("testdata", "phone", 1);

	public static final String address = xlsreader.getCellDataByColumnName("testdata", "address", 1);

	public static final String city = xlsreader.getCellDataByColumnName("testdata", "city", 1);
	
	public static final String state = xlsreader.getCellDataByColumnName("testdata", "state", 1);
	
	public static final String zip = xlsreader.getCellDataByColumnName("testdata", "zip", 1);


}
