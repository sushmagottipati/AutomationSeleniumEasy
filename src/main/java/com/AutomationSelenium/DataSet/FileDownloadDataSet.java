package com.AutomationSelenium.DataSet;

import com.AutomationSeleniumEasy.Utilities.XlsReader;

public class FileDownloadDataSet {
	
	static XlsReader xlsreader = new XlsReader();
	
	
	public static final String text = xlsreader.getCellDataByColumnName("filedownload", "text", 1);
	
	//public static final String filepath = xlsreader.getCellDataByColumnName("filedownload", "filepath", 1);
	
	public static final String filepath = "C:\\Users\\dell\\Downloads\\easyinfo.txt";


}
//C:\\Users\\dell\\Downloads\\easyinfo.txt

//C:\\Users\\dell\\Downloads\\easyinfo.txt