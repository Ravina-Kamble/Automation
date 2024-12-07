package com.TestNG;

import org.testng.annotations.DataProvider;

public class GoogleData {
	@DataProvider
	public String [] getData() {
		
		String data [] =new String [5];
		
		data[0]= "moto G 50";
		data[1]= "iphone 15";
		data[2]= "Automation Quations & answer";
		data[3]= "hard disc";
		data[4]= "Nokia mobile";
				
		return data;
	}

}
