package GW;

public class Xpath {

}

//**************************Basic X-Path************************************************
//input [@name='Login-LoginScreen-LoginDV-username']
//$x("//input[@name='Login-LoginScreen-LoginDV-username']")

//**************************Contains X-Path************************************************
//input [contains(@name,'username')]
//$x("//input [contains(@name,'username')]")

//**************************Following X-Path************************************************
//Xpath=//input [contains(@name,'username')]//following::input
//$x("//input [contains(@name,'username')]//following::input")

//**************************Preceding X-Path************************************************
//Xpath=//input [contains(@name,'password')]//preceding::input
//$x("//input [contains(@name,'password')]//preceding::input")

//**************************ancestor X-Path************************************************
//Xpath=//input [contains(@name,'password')]//ancestor::input
//$x("//input [contains(@name,'password')]//ancestor::input")

//**************************Parent X-Path************************************************
//Xpath=//input [contains(@name,'password')]//parent::div
//$x("//input [contains(@name,'password')]//parent::div")

//**************************child X-Path************************************************
//Xpath=//input [contains(@name,'password')]//child::div
//$x("//input [contains(@name,'password')]//child::div")



//**************************Following-Sibling X-Path************************************************
//Xpath=//input [contains(@name,'username')]//following-sibling::input
//$x("//input [contains(@name,'username')]//following-sibling::input")


//**************************text X-Path************************************************
//$x("//div[text()='Personal Auto']//preceding::div[text()='Personal Auto']//preceding::td[1]//div[text()='Select']")


//***********************************Important Learning*************************************************************

//$x("//div[text()='Account No']//following-sibling::div//child::div[@class='gw-value-readonly-wrapper']")
//$x("//div[text()='Personal Auto']//preceding::div[text()='Personal Auto']//preceding::td[1]//div[text()='Select']")
//$x("//div[contains(text(),'license currently ')]//following::td[1]//span[text()='No']//preceding::span[1]")

//$x("//div[contains(text(),'license currently ')]//following::td[1]//span[text()='No']//preceding::span[1]//child::input[contains(@type,'radio')]")

//$x("//div[contains(text(),'Log In')]//parent::div//parent::div[contains(@class,'Button')]")

//div[contains(text(),'Offerings')]//parent::div//parent::div[contains(@class,'Link')]

//div[contains(text(),'Date of Birth')]//following::div//child::input

//div[contains(text(),'Term Type')]//following::div//child::Select

//div[contains(text(),'changed?')]//following::div//child::span[contains(text(),'Yes')]//preceding-sibling::span//child::input[contains(@type,'radio')]

//div[contains(text(),'Auto Liability Package')]//following-sibling::div//child::select

//div[contains(text(),'Coordinate Benefits')]//following-sibling::div//child::span[contains(text(),'Yes')]//preceding-sibling::span//child::input[contains(@type,'radio')]

//$x("//div[contains(text(),'Underinsured Motorist - Property Damage')]//preceding-sibling::div//child::input")

//div[contains(text(),'Uninsured Motorist - Bodily Injury')]//following::div//child::div[contains(text(),'Stacked Limits')]

//div[contains(text(),'Uninsured Motorist - Bodily Injury')]//following::div//child::div[contains(text(),'Stacked Limits')]

//div[contains(text(),'Uninsured Motorist - Bodily Injury')]//following::div//child::div[contains(text(),'Stacked Limits')]

//div[contains(text(),'Uninsured Motorist - Bodily Injury')]//following::div//child::div[contains(text(),'Stacked Limits')]

//$x("//div[contains(text(),'Uninsured Motorist - Property Damage')]//following::div//child::div[contains(text(),'Stacked Limits')]//following-sibling::div//child::span[contains(text(),'Yes')]//preceding-sibling::span//child::input[contains(@type,'radio')]")

//$x("//div[contains(text(),'Uninsured Motorist - Property Damage')]//following::div//child::div[contains(text(),'Stacked Limits')]//following-sibling::div//child::input[contains(@type,'radio')]")

//td[div[div[div[div[contains(text(), 'Businessowners')]]]]]//preceding-sibling::td//div[contains(text(),'Select')]
//div[text()='Inland Marine']//preceding::div[text()='Inland Marine']//preceding::td//div[text()='Select']

//div[contains(@class,'gw-big-button ') and contains(@id,'Search')]

//div[contains(@id,'PolicyTab')]//child::*[contains(@class,'gw-icon gw-icon--expand')]

//div[contains(@id,'Policy')]//child::*[contains(@class,'gw-icon gw-icon--expand')] 

//div[contains(text(),'Company')]//parent::div[contains(@class,'gw-action--inner gw-hasDivider')]//parent::div[contains(@id,'NewAccountButton')] 




