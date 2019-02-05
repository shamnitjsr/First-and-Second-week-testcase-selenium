package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[4]; 
			//obj[0] = temp.getName(); 
			//obj[1] = temp.getPassword();
			
			obj[0] = temp.getYourName(); 
			obj[1] = temp.getEmail(); 
			obj[2] = temp.getSubject(); 
			obj[3] = temp.getMessage(); 
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs66")
	public Object[][] getExcelData66(){
		String fileName ="C:\\selenium_setup_file\\mydata66.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	} 
	

	@DataProvider(name = "excel-inputs68")
	public Object[][] getExcelData68(){
		String fileName ="C:\\selenium_setup_file\\mydata68.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "excel-inputs69")
	public Object[][] getExcelData69(){
		String fileName ="C:\\selenium_setup_file\\mydata69.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	/*
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}*/
}
