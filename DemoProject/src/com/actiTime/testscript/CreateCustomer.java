package com.actiTime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLib;
import com.actiTime.pom.EnterTimeTrack;
import com.actiTime.pom.TaskList;

public class CreateCustomer extends BaseClass {

	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		FileLib fl = new FileLib();
		EnterTimeTrack ett = new EnterTimeTrack(driver);
		ett.setTask();
		TaskList t = new TaskList(driver);
		t.getAddnewbtn().click();
		t.getAddcstmer().click();
		String cusname = fl.getExcelData("CustomerData", 1, 2);
		t.getCustname().sendKeys(cusname);
		String cusdisp = fl.getExcelData("CustomerData", 1, 3);
		t.getCustdescription().sendKeys(cusdisp);
		t.getCusttype().click();
		t.getOurcompany().click();
		t.getCreatecust().click();
		
		Thread.sleep(5000);
		
	}
}
