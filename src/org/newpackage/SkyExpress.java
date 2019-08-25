package org.newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SkyExpress {
	public static void main(String[] args) throws InterruptedException {
		
		//Launching part
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\SkyExpress\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.skyexpress.gr/en/");
		d.manage().window().maximize();
		
		//Language selection
		
		//WebElement g=d.findElement(By.xpath("//span[text()='GR']"));
		//Actions acc=new Actions(d);
		//acc.moveToElement(g).perform();
       // WebElement e=d.findElement(By.xpath("//span[text()='EN']"));
       // e.click();
        
        //One way trip selection
        
        WebElement o=d.findElement(By.xpath("//li[@class='Type'][2]"));
        o.click();
        
        //From part
        
        WebElement f=d.findElement(By.id("from"));
        f.click();
        WebElement search=d.findElement(By.id("fromMyInput"));
        search.sendKeys("ATH");
        Actions acc=new Actions(d);
        acc.moveToElement(search).perform();
        WebElement m=d.findElement(By.xpath("//li[@class='match'][1]"));
        m.click();
        
        //To part
        
        WebElement src=d.findElement(By.id("toMyInput"));
        src.sendKeys("ALE");
        acc.moveToElement(src).perform();
        WebElement c=d.findElement(By.xpath("//li[@class='inReach'][1]"));
        c.click();
        
        //Depart & date part
        
        WebElement dep=d.findElement(By.xpath("//label[@class='oneWay show']"));
        dep.click();
        WebElement date=d.findElement(By.xpath("//td[text()='16'][1]"));
        date.click();  
        
        //Passenger part
        
        WebElement pass=d.findElement(By.id("passengers-fields"));
        pass.click();
        WebElement add=d.findElement(By.xpath("//span[@class='addition']"));
        add.click();
        WebElement ok=d.findElement(By.xpath("//div[@class='closeMyModal']"));
        ok.click();
        
        //Booking part
        
        WebElement book=d.findElement(By.xpath("//input[@type='submit']"));
        book.click();
        
        //selecting fare
        
        WebElement fare=d.findElement(By.xpath("//input[@class='faretype-radio'][2]"));
        fare.click();
        
        //Continue
        
        WebElement btn=d.findElement(By.id("btnProceedWithBookingMain"));
        btn.click();
        
        //Passenger details
        
        WebElement title=d.findElement(By.xpath("//select[@id='title0ADT']"));
        title.click(); 
        WebElement drop=d.findElement(By.xpath("//option[text()='Mrs.']"));
        drop.click(); 
        WebElement first=d.findElement(By.xpath("//input[@id='firstName0ADT']"));
        first.sendKeys("saranya"); 
        WebElement sur=d.findElement(By.xpath("//input[@id='surName0ADT']"));
        sur.sendKeys("sara");
        WebElement adress=d.findElement(By.xpath("//input[@id='streetAddress10ADT']"));
        adress.sendKeys("kelambakkam");
        WebElement post=d.findElement(By.xpath("//input[@id='postalCode0ADT']']"));
        post.sendKeys("606601");
        WebElement birth=d.findElement(By.xpath("//input[@id='birthDate0ADT']"));
        birth.sendKeys("06/02/1992");
        WebElement country=d.findElement(By.xpath("//select[@id='country0ADT']"));
        Select s=new Select(country);
        s.selectByValue("356");
        WebElement mobile=d.findElement(By.xpath("//input[@id='cellPhone0ADT']"));
        mobile.sendKeys("9865432171");
        WebElement email=d.findElement(By.xpath("//input[@id='email0ADT']"));
        email.sendKeys("usaranya230@gmail.com");
        WebElement MAN=d.findElement(By.xpath("//input[@id='email0ADT']"));
        MAN.sendKeys("53462935");
        
        //continue
        
        WebElement cont=d.findElement(By.xpath("//a[@id='ContinueButton']"));
        cont.click(); 

        //Payment details
        
        WebElement card=d.findElement(By.xpath("//input[@id='paymentMethodRadio-EuroBankOpenPayDirect-VISA']"));
        card.click();
        WebElement type=d.findElement(By.xpath("//select[@id='creditCardType']"));
        type.click();
        WebElement master=d.findElement(By.xpath("//option[text()='Mastercard']"));
        master.click();
        WebElement cNum=d.findElement(By.xpath("//input[@id='creditCardNumber']"));
        cNum.sendKeys("3659441446511");
        WebElement exp=d.findElement(By.xpath("//select[@id='cardMonth']"));
        Select s1=new Select(exp);
        s1.selectByValue("02");
        WebElement year=d.findElement(By.xpath("//select[@id='cardYear']"));
        Select s2=new Select(year);
        s2.selectByValue("2020");
        WebElement cvv=d.findElement(By.xpath("//input[@id='cardCvv']"));
        cvv.sendKeys("345");
        WebElement fNme=d.findElement(By.xpath("//input[@id='creditCardFirstname']"));
        fNme.sendKeys("saranya");
        WebElement lName=d.findElement(By.xpath("//input[@id='creditCardLastname']"));
        lName.sendKeys("sara");
        WebElement agree=d.findElement(By.xpath("//input[@id='cbAcceptImmigration']"));
        agree.click();
        WebElement pay=d.findElement(By.xpath("//button[@type='button'][3]"));
        pay.click();
        d.quit();
        
        
        
        
        
        
        

        
        
       
        
        
        
        
        
        
        
        
        
      
        
        

	}
}