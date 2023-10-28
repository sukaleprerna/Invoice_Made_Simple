package com.inetbanking.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
    
    @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(3000);

        driver.get(baseURL);
       // logger.info("URL is opened");
        Thread.sleep(3000);

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(baseUsername);
       // logger.info("Entered Username");
        Thread.sleep(3000);

        lp.setpassword(basePassword);
      //  logger.info("Entered Password");
        Thread.sleep(3000);

        lp.ClickSubmit();

       if (driver.getTitle().equals("Dashboard")) {
            Assert.assertTrue(true);
            //logger.info("Login Test Passed");
       }else {
            Assert.assertTrue(false);
            //logger.info("Login Test Failed");
     }
            
            
            
            driver.get("https://www.mydevsystems.com/dev/gap_v2/index.php/login/login"); //open the URL on the Browser
            

            driver.manage().window().maximize(); // maximize the browser
            
           
            Thread.sleep(10000); //using method (in duration) 

            driver.findElement(By.id("baseusername")).sendKeys("INVadmin"); //find username

            driver.findElement(By.id("basepassword")).sendKeys("INVadmin"); //find password

            driver.findElement(By.className("login_submit")).click(); // login button
            Thread.sleep(3000); //using method (in duration) 
            
            

   //1      //Click on Security Manager Module
            driver.findElement(By.xpath("//span[text()='Security Manager']\r\n")).click(); 
            Thread.sleep(3000); //using method (in duration)
            
           //Click on Role Master Sub-Module 
            driver.findElement(By.xpath("//a[@title='Role Master']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            // Click on List Screen
            driver.findElement(By.xpath("//div[normalize-space()='Role Master']\r\n")).click();
            Thread.sleep(3000);
            
            //Click on Add Button
            driver.findElement(By.xpath("//i[@class='fa fa-plus-circle fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Dropdown
            driver.findElement(By.xpath("//span[text()='Select an option']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select Value from dropdown
            driver.findElement(By.xpath("//span[normalize-space()='Demo1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Role Name
            driver.findElement(By.xpath("//input[@id='RoleName']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Job Description
            driver.findElement(By.xpath("//textarea[@id='Description']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Authority Level
            driver.findElement(By.xpath("//input[@id='auth_level']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Domain Name
            driver.findElement(By.xpath("//input[@class='chosen-search-input']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save Button
            driver.findElement(By.xpath("//button[@id='main' and contains(@class, 'btn-primary')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Reciving Green Confirmation Message 
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Add Button
            driver.findElement(By.xpath("//i[@class='fa fa-plus-circle fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Dropdown
            driver.findElement(By.xpath("//span[text()='Select an option']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
          //Select Value from dropdown
            driver.findElement(By.xpath("//span[normalize-space()='Demo1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
             //Click on Role Name
            driver.findElement(By.xpath("//input[@id='RoleName']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Job Description
            driver.findElement(By.xpath("//textarea[@id='Description']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Authority Level
            driver.findElement(By.xpath("//input[@id='auth_level']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
           //Click on Domain Name
            driver.findElement(By.xpath("//span[text()='INVIN']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save And Add Button 
            driver.findElement(By.xpath("//button[@name='next' and @value='next' and contains(@class, 'saveAndAddButton')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Reciving Green Confirmation Message 
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Cancel Button
            driver.findElement(By.xpath("//a[@href='https://www.mydevsystems.com/dev/gap_v2/index.php/user/role_master/index' and contains(@class, 'cancelButton')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Sync Module Button
            driver.findElement(By.xpath("//i[@class='fa fa-refresh fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Showing List Page (Navigating to the next page)
            driver.findElement(By.xpath("//div[normalize-space()='Role Master']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Export Button
            driver.findElement(By.xpath("//i[@class='fa fa-arrow-right fa-stack-1x']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on CSV 
            driver.findElement(By.xpath("//a[@class='dropdown-item export-csv']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Excel
            driver.findElement(By.xpath("//a[@class='dropdown-item export-excel']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on PDF
            driver.findElement(By.xpath("//a[@class='dropdown-item export-pdf']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Print
            driver.findElement(By.xpath("//a[@class='dropdown-item print']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Export Button
            driver.findElement(By.xpath("//i[@class='fa fa-arrow-right fa-stack-1x']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Copy
            driver.findElement(By.xpath("//a[@class='dropdown-item copy' and normalize-space()='Copy']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Configuration Button
            driver.findElement(By.xpath("//i[@class='fa fa-cog fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on list visible checkbox
            driver.findElement(By.xpath("//label[input[@type='checkbox' and @name='chkAllList']]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save Changes Button
            driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary' and normalize-space()='Save changes']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]/span[1]/span[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on White Colour Delete Selected Button
            driver.findElement(By.xpath("//i[@class='fa fa-trash fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Close the pop up window
            driver.findElement(By.xpath("//button[@class='swal2-close' and @aria-label='Close this dialog']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Selecting one of the record from list
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]/span[1]/strong[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on White Colour Delete Selected Button
            driver.findElement(By.xpath("//i[@class='fa fa-trash fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]/span[1]/strong[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
 //2        //Click on Security Manager Module
            driver.findElement(By.xpath("//span[text()='Security Manager']\r\n")).click(); 
            Thread.sleep(3000); //using method (in duration)
            
            
            
            //Click on User Groups submodule of Security Manager Module
            driver.findElement(By.xpath("//a[@title='User Groups' and normalize-space()='User Groups']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Navigating list screen page of User Groups submodule
            driver.findElement(By.xpath("//div[normalize-space()='User Group']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Add Button
            driver.findElement(By.xpath("//i[@class='fa fa-plus-circle fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Dropdown
            driver.findElement(By.xpath("//div[@class='chosen-drop']//ul[@class='chosen-results']//li[normalize-space()='Demo1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select value from dropdown
            driver.findElement(By.xpath("//span[normalize-space()='Demo1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //type in text box user group name
            driver.findElement(By.xpath("//input[@id='UserGrpNm']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select domain id dropdown
            driver.findElement(By.xpath("//span[text()='Select an option']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select values from dropdown
            driver.findElement(By.xpath("//span[text()='abc']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select select users dropdown
            driver.findElement(By.xpath("//input[@value='Select Some Options']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select values from the dropdown
            driver.findElement(By.xpath("//span[text()='INVadmin']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //click on save button
            driver.findElement(By.xpath("//button[@id='main' and contains(@class, 'saveButton') and text()='Save']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)

            //Click on Add Button
            driver.findElement(By.xpath("//i[@class='fa fa-plus-circle fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Dropdown
            driver.findElement(By.xpath("//div[@class='chosen-drop']//ul[@class='chosen-results']//li[normalize-space()='Demo1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select value from dropdown
            driver.findElement(By.xpath("//span[normalize-space()='Demo1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //type user group name
            driver.findElement(By.xpath("//input[@id='UserGrpNm' and @name='UserGrpNm']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select domain id dropdown
            driver.findElement(By.xpath("//span[text()='Select an option']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select values from dropdown
            driver.findElement(By.xpath("//span[text()='Test']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //select select users dropdown
            driver.findElement(By.xpath("//input[@value='Select Some Options']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select values from dropdown
            driver.findElement(By.xpath("//span[text()='INVssj']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save And Add Button
            driver.findElement(By.xpath("//button[@name='next' and @value='next' and contains(@class, 'saveAndAddButton')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Reciving Green Confirmation Message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]/span[1]/span[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Cancel Button
            driver.findElement(By.xpath("//a[@class='btn btn-sm btn-default cancelButton' and @href='https://www.mydevsystems.com/dev/gap_v2/index.php/user/user_group']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Export Button
            driver.findElement(By.xpath("//i[@class='fa fa-arrow-right fa-stack-1x']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on CSV 
            driver.findElement(By.xpath("//a[@class='dropdown-item export-csv']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Excel
            driver.findElement(By.xpath("//a[@class='dropdown-item export-excel']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on PDF
            driver.findElement(By.xpath("//a[@class='dropdown-item export-pdf']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Print
            driver.findElement(By.xpath("//a[@class='dropdown-item print']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Export Button
            driver.findElement(By.xpath("//i[@class='fa fa-arrow-right fa-stack-1x']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Copy 
            driver.findElement(By.xpath("//a[@class='dropdown-item copy']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Configuration button
            driver.findElement(By.xpath("//i[@class='fa fa-cog fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on list visible checkbox
            driver.findElement(By.xpath("//label[@class='custom-control custom-checkbox']/input[@type='checkbox' and @name='chkAllList']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save Changes button
            driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary' and text()='Save changes']\\r\\n")).click();
            Thread.sleep(3000); //using method (in duration)
            

            //Reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on White colour delete selected button
            driver.findElement(By.xpath("//i[@class='fa fa-trash fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Select the one of record from the list
            driver.findElement(By.xpath("//td[contains(@class, 'select-checkbox')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]/span[1]/strong[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            
            //Click on Red colour delete button 
            driver.findElement(By.xpath("//span[contains(@class, 'fa-trash') and contains(@class, 'text-danger')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on yes button to del the selected record
            driver.findElement(By.xpath("//i[@class='fa fa-check fa-2x']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Reciving grreen confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            

    //3       //Click on Security Manager Module
              driver.findElement(By.xpath("//span[text()='Security Manager']\r\n")).click(); 
              Thread.sleep(3000); //using method (in duration)
              
              
            // Click on User Group Role Submodule 
            driver.findElement(By.xpath("//a[@title='User Group Role' and normalize-space()='User Group Role']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Navigating to the list page of submodule
            driver.findElement(By.xpath("//div[normalize-space()='User Group']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Add Button
            driver.findElement(By.xpath("//i[@class='fa fa-plus-circle fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Requested By Dropdown
            driver.findElement(By.xpath("//option[@selected and text()='Invoice Made Simple']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select any value from dropdown
            driver.findElement(By.xpath("//span[normalize-space()='Demo1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //enter in text filed of User Group Name
            driver.findElement(By.xpath("//input[@id='UserGrpNm' and @name='UserGrpNm']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select dropdown of Domain Id
            driver.findElement(By.xpath("//span[text()='Select an option']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select any value from dropdown
            driver.findElement(By.xpath("//span[text()='bca']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Select dropdown of Select Users
            driver.findElement(By.xpath("//input[@class='chosen-search-input default']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select values from dropdown
            driver.findElement(By.xpath("//span[text()='INVssj']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save button
            driver.findElement(By.xpath("//button[@id='main' and @class='btn btn-sm btn-primary saveButton']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Reciving green confimation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //redirecting to the list screen page
            driver.findElement(By.xpath("//div[normalize-space()='User Group']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Export Button
            driver.findElement(By.xpath("//i[@class='fa fa-arrow-right fa-stack-1x']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on CSV
            driver.findElement(By.xpath("//a[@class='dropdown-item export-csv']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Excel
            driver.findElement(By.xpath("//a[@class='dropdown-item export-excel']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click On PDF
            driver.findElement(By.xpath("//a[@class='dropdown-item export-pdf']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Print
            driver.findElement(By.xpath("//a[@class='dropdown-item print']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Export Button
            driver.findElement(By.xpath("//i[@class='fa fa-arrow-right fa-stack-1x']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Copy
            driver.findElement(By.xpath("//a[@class='dropdown-item copy']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Configuration Button
            driver.findElement(By.xpath("//i[@class='fa fa-cog fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on list view checkbox of configuration 
            driver.findElement(By.xpath("//input[@type='checkbox' and @name='chkAllList']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save Changes Button
            driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary' and text()='Save changes']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Reciving Green Confirmation Message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on white colour delete selected button
            driver.findElement(By.xpath("//i[@class='fa fa-trash fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select one of the record for delete
            driver.findElement(By.xpath("//tr[@id='row_637']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            

            //Click on white colour delete selected button
            driver.findElement(By.xpath("//i[@class='fa fa-trash fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            
      //4          //Click on Security Manager Module
                   driver.findElement(By.xpath("//span[text()='Security Manager']\r\n")).click(); 
                   Thread.sleep(3000); //using method (in duration)
            
            //Click on Users Submodule of Security Manager Module
            driver.findElement(By.xpath("//a[@title='Users' and normalize-space()='Users']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Navigating to the list screen page
            driver.findElement(By.xpath("//div[normalize-space()='User Master']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Add Button
            driver.findElement(By.xpath("//i[@class='fa fa-plus-circle fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Enter the  Username
            driver.findElement(By.xpath("//input[@id='UserName' and @name='UserName']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Enter Registered Email 
            driver.findElement(By.xpath("//input[@id='RegEmail' and @name='RegEmail']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            // Enter the password 
            driver.findElement(By.xpath("//input[@id='Password']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Domain filed Dropdown
            driver.findElement(By.xpath("//span[text()='Select an option']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select values from the dropdown 
            driver.findElement(By.xpath("//span[text()='INVIN']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Enter the Tpin (number)
            driver.findElement(By.xpath("//input[@id='tPin']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Enter the text in Memorable Word Field 
            driver.findElement(By.xpath("//input[@id='memorableWord']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on the Cancel Button
            driver.findElement(By.xpath("//a[@href='https://www.mydevsystems.com/dev/gap_v2/index.php/user/user_master' and contains(@class, 'cancelButton')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Active Suspended User Button
            driver.findElement(By.xpath("//i[@class='fa fa-check fa-fw' and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select one of the record from the list
            driver.findElement(By.xpath("//tr[@id='row_3011']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            

            //Click on Active Suspended User Button
            driver.findElement(By.xpath("//i[@class='fa fa-check fa-fw' and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/div[8]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Active User Button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-thumbs-o-up') and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select one of the records from the list 
            driver.findElement(By.xpath("//tr[@id='row_3011']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Active User Button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-thumbs-o-up') and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select one of the records from the list 
            driver.findElement(By.xpath("//tr[@id='row_3011']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Reciving the green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Deactivate User Button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-thumbs-o-down') and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
          //Select one of the records from the list 
            driver.findElement(By.xpath("//tr[@id='row_3011']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Deactivate User Button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-thumbs-o-down') and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Export Button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-arrow-right')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on CSV 
            driver.findElement(By.xpath("//a[contains(@class, 'export-csv')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Excel
            driver.findElement(By.xpath("//a[contains(@class, 'export-excel')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Pdf
            driver.findElement(By.xpath("//a[contains(@class, 'export-pdf')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Print
            driver.findElement(By.xpath("//a[contains(@class, 'print')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Excel
            driver.findElement(By.xpath("//a[contains(@class, 'export-excel')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Copy
            driver.findElement(By.xpath("//a[contains(@class, 'copy')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Configuration button
            driver.findElement(By.xpath("//i[@class='fa fa-cog fa-fw' and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on checkbox
            driver.findElement(By.xpath("//td[contains(., 'ListView Visible')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save changes button
            driver.findElement(By.xpath("//button[contains(text(), 'Save changes')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Reciving green confirmation message 
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on White Colour of delete selected button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-trash')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Select one of the record from the list 
            driver.findElement(By.xpath("//tr[@id='row_3011']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
  
            //Click on White Colour of delete selected button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-trash')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
             //Reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]/span[1]/strong[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            
            
            
            
            
      //5    //Click on Security Manager Module
            driver.findElement(By.xpath("//span[text()='Security Manager']\r\n")).click(); 
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Login Status submodule of Security Manager Module
            driver.findElement(By.xpath("//a[contains(., 'Login Status')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Navigating to the List Screen page
            driver.findElement(By.xpath("//div[contains(@class, 'col') and normalize-space()='User Last Login']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Export button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-arrow-right')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on CSV
            driver.findElement(By.xpath("//a[contains(@class, 'export-csv')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Excel
            driver.findElement(By.xpath("//a[contains(@class, 'export-excel')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Pdf
            driver.findElement(By.xpath("//a[contains(@class, 'export-pdf')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Print 
            driver.findElement(By.xpath("//a[contains(@class, 'print')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Excel
            driver.findElement(By.xpath("//a[contains(@class, 'export-excel')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration))
            
            
            //Click on Copy
            driver.findElement(By.xpath("//a[contains(@class, 'copy')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Configuration Button
            driver.findElement(By.xpath("//a[contains(@class, 'configure-mst-link')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Checkbox
            driver.findElement(By.xpath("//span[@xpath='1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Save Changes button
            driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and contains(text(), 'Save changes')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on White Color Delete Selected button
            driver.findElement(By.xpath("//i[@class='fa fa-trash fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select one of the record from the list
            driver.findElement(By.xpath("//tr[@id='row_31068']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on White Color Delete Selected button
            driver.findElement(By.xpath("//i[@class='fa fa-trash fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //reciving confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
           
            
      //6    //Click on Security Manager Module
            driver.findElement(By.xpath("//span[text()='Security Manager']\r\n")).click(); 
            Thread.sleep(3000); //using method (in duration)
            
            //Click on User Roles Submodule of Security Manager module
            driver.findElement(By.xpath("//a[@title='User Roles' and contains(text(), 'User Roles')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Navigating to the list screen page
            driver.findElement(By.xpath("//div[contains(text(), 'User Role')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Add Button
            driver.findElement(By.xpath("//i[@class='fa fa-plus-circle fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Requested by dropdown
            driver.findElement(By.xpath("//div[@id='user_chosen']//a[contains(@class, 'chosen-single')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Select the value from dropdown list
            driver.findElement(By.xpath("//span[contains(text(), 'Demo1')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on cancel button
            driver.findElement(By.xpath("//a[@class='btn btn-sm btn-default cancelButton' and @role='button' and contains(@href, 'user/user_role/index')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Export button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-arrow-right')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on CSV
            driver.findElement(By.xpath("//a[contains(@class, 'dropdown-item export-csv')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Excel
            driver.findElement(By.xpath("//a[contains(@class, 'dropdown-item export-excel')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Pdf 
            driver.findElement(By.xpath("//a[contains(@class, 'dropdown-item export-pdf')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Print
            driver.findElement(By.xpath("//a[contains(@class, 'dropdown-item print')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Export button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-arrow-right')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Copy
            driver.findElement(By.xpath("//a[contains(@class, 'dropdown-item copy')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Configuration
            driver.findElement(By.xpath("//i[@class='fa fa-cog fa-fw']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Checkbox of listvisible
            driver.findElement(By.xpath("//input[@type='checkbox' and @name='chkAllList']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Save Changes button
            driver.findElement(By.xpath("//button[@type='submit' and contains(@class, 'btn-primary') and text()='Save changes']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Reciving green confirmation message
            driver.findElement(By.xpath("//body[1]/ul[1]/li[1]/div[1]/div[1]/span[1]/strong[1]")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on White color delete selected button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-trash') and contains(@class, 'fa-fw') and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //select one of the record from list 
            driver.findElement(By.xpath("//tr[@id='row_1545']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on White color delete selected button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-trash') and contains(@class, 'fa-fw') and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Green Confirmation Message
            driver.findElement(By.xpath("//strong[text()='Success!']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            
            
            
            
     //7   //Click on Security Manager Module
            driver.findElement(By.xpath("//span[text()='Security Manager']\r\n")).click(); 
            Thread.sleep(3000); //using method (in duration)
            
            // Click on User Domains Submodule of Security Manager module
            driver.findElement(By.xpath("//a[normalize-space()='User Domains']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Navigating to the list screen page
            driver.findElement(By.xpath("//div[normalize-space()='User Domain']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            //Click on Add Button
            driver.findElement(By.xpath("//a[@href='https://www.mydevsystems.com/dev/gap_v2/index.php/user/user_domain/newUserDomain' and @tooltip='Add New User Domain' and @flow='down' and @target='']/i[@class='fa fa-plus-circle fa-fw' and @aria-hidden='true']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Requested By Dropdown
            driver.findElement(By.xpath("//span[text()='Select an option']")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Select the value from dropdown list
            driver.findElement(By.xpath("//span[normalize-space()='Demo1']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Enter name in Doamin Name field
            driver.findElement(By.xpath("//input[@id='UserDmnName']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Save Button
            driver.findElement(By.xpath("//button[@id='main' and text()='Save']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Reciving green confirmation message 
            driver.findElement(By.xpath("//strong[text()='Success!']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Export Button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-stack-1x') and contains(@class, 'fa-arrow-right')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on CSV 
            driver.findElement(By.xpath("//a[@class='dropdown-item export-csv']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Excel
            driver.findElement(By.xpath("//a[@class='dropdown-item export-excel']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Pdf
            driver.findElement(By.xpath("//a[@class='dropdown-item export-pdf']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Print
            driver.findElement(By.xpath("//a[@class='dropdown-item print']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Copy
            driver.findElement(By.xpath("//a[@class='dropdown-item copy']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on Configuration Button
            driver.findElement(By.xpath("//i[@class='fa fa-cog']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click untick on Checkbox of listvisible
            driver.findElement(By.xpath("//input[@type='checkbox' and @class='custom-control-input selectallList']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on save changes
            driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and contains(text(), 'Save changes')]\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //reciving green confirmation mesage
            driver.findElement(By.xpath("//strong[text()='Success!']\r\n")).click();
            Thread.sleep(3000); //using method (in duration)
            
            
            //Click on White color delete selected button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-trash') and @aria-hidden='true']\r\n" )).click();
            Thread.sleep(3000); //using method (in duration)
            
            /*
          //select one of record from list
            driver.findElement(By.xpath("")).click();
            Thread.sleep(3000); //using method (in duration)
            

            //Click on White color delete selected button
            driver.findElement(By.xpath("//i[contains(@class, 'fa-trash') and @aria-hidden='true']\r\n" )).click();
            Thread.sleep(3000); //using method (in duration)
            
            //reciving green confirmation message
            driver.findElement(By.xpath("")).click();
            Thread.sleep(3000); //using method (in duration)   
            */
        }
    }

