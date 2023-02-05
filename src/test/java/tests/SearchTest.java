package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class SearchTest {

    WebDriver driver = new FirefoxDriver();

    @Before

    public void setup() throws InterruptedException {

        driver.get("http://gcreddy.com/project/admin/login.php ");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @After

    public void tearDown(){

        driver.close();
    }

    @Test

    public void loginTest() throws InterruptedException {

        WebElement username =driver.findElement(By.name("username"));//username e kullanıcı adı yazıldı
        username.sendKeys("gcreddy");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));//şifre girildi
        password.sendKeys("Temp@2020");
        Thread.sleep(1000);

        WebElement login = driver.findElement(By.cssSelector("button#tdb1"));//login yapıldı.
        login.click();
        Thread.sleep(1000);

        WebElement customerclick = driver.findElement(By.xpath("//*[@id='ui-accordion-adminAppMenu-header-2']/a"));
        customerclick.click();
        Thread.sleep(1000);

        WebElement customers =driver.findElement(By.xpath("//*[@id='ui-accordion-adminAppMenu-panel-2']/ul/li/a"));
        customers.click();
        Thread.sleep(1000);

        WebElement edit =driver.findElement(By.xpath("//*[@id='tdb1']"));
        edit.click();
        Thread.sleep(1000);

        WebElement gender = driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/input[1]"));
        gender.click();
        Thread.sleep(1000);

        WebElement FirstName =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
        FirstName.click();
        FirstName.clear();
        FirstName.sendKeys("Arslanim");
        Thread.sleep(1000);

        WebElement Lastname =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
        Lastname.click();
        Lastname.clear();
        Lastname.sendKeys("Beyim");
        Thread.sleep(1000);

        WebElement DateofBirth  =driver.findElement(By.xpath("//*[@id='customers_dob']"));
        Lastname.sendKeys(Keys.TAB);
        DateofBirth.sendKeys("01/23/1989");
        Thread.sleep(1000);

        WebElement EMailAddress =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[4]/td/table/tbody/tr[5]/td[2]/input"));
        DateofBirth.sendKeys(Keys.TAB);
        EMailAddress.sendKeys("omerfarukyeler.exxxxyzxy@gmail.com");
        Thread.sleep(1000);

        WebElement Company  =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[7]/td/table/tbody/tr/td[2]/input"));
        Company.click();
        Company.clear();
        Company.sendKeys("InfoTechAcademy");
        Thread.sleep(1000);

        WebElement Street =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[10]/td/table/tbody/tr[1]/td[2]/input"));
        Street.click();
        Street.clear();
        Street.sendKeys("Hellington street 176");
        Thread.sleep(1000);


        WebElement  Suburb  =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[10]/td/table/tbody/tr[2]/td[2]/input"));
        Suburb.click();
        Suburb.clear();
        Suburb.sendKeys("Bad Canstad");
        Thread.sleep(1000);


        WebElement PostCode  =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[10]/td/table/tbody/tr[3]/td[2]/input"));
        PostCode.click();
        PostCode.clear();
        PostCode.sendKeys("74076");
        Thread.sleep(1000);

        WebElement City  =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[10]/td/table/tbody/tr[4]/td[2]/input"));
        City .click();
        City .clear();
        City .sendKeys("Stuttgart");
        Thread.sleep(1000);

        WebElement State =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[10]/td/table/tbody/tr[5]/td[2]/input"));
        State.click();
        State.clear();
        State.sendKeys("Bremen");
        Thread.sleep(1000);


        WebElement Country  =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[10]/td/table/tbody/tr[6]/td[2]/select"));
        Country.sendKeys("G");
        Country.sendKeys("G");
        Country.sendKeys("G");
        Country.sendKeys("G");
        Thread.sleep(1000);


        WebElement TelephoneNumber  =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[13]/td/table/tbody/tr[1]/td[2]/input"));
        TelephoneNumber.click();
        TelephoneNumber.clear();
        TelephoneNumber.sendKeys("276 250 02 26");
        Thread.sleep(1000);


        WebElement FaxNumber  =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[13]/td/table/tbody/tr[2]/td[2]/input"));
        FaxNumber .click();
        FaxNumber.clear();
        FaxNumber.sendKeys("276 250 20 92");
        Thread.sleep(1000);


        WebElement Newsletter =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[16]/td/table/tbody/tr/td[2]/select"));
        Newsletter.click();
        Newsletter.sendKeys("S");
        Thread.sleep(1000);


        WebElement save =driver.findElement(By.xpath("//*[@id='tdb1']/span[2]"));
        save.click();
        Thread.sleep(2000);

        WebElement search =driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[1]/td/table/tbody/tr/td[3]/input"));
        search.click();
        search.sendKeys("Beyim"+Keys.ENTER);
        Thread.sleep(3000);

        WebElement control =driver.findElement(By.xpath("//*[@id='defaultSelected']/td[1]"));
        String name =control.getText();
        System.out.println("control = " + name);
        Assert.assertTrue(name.contains("Beyim"));
        Thread.sleep(3000);

        WebElement logoff=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]/a"));
        logoff.click();


    }







}
