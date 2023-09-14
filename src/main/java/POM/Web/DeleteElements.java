package POM.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteElements {
    static WebDriver driver;
    public DeleteElements(WebDriver driver)
    {DeleteElements.driver=driver;}
    By clickCustomerTab = By.xpath("//button[@ng-click=\"showCust()\"]");
    By searchName=By.xpath("//input[@type=\"text\"]");
    By clickDelete=By.xpath("//button[@ng-click=\"deleteCust(cust)\"]");
    public void CustomerTab() throws InterruptedException{
        driver.findElement(clickCustomerTab).click();
        Thread.sleep(2000);
    }
    public void SearchCustomer(String Name) throws InterruptedException{
        driver.findElement(searchName).click();
        driver.findElement(searchName).sendKeys("Martin");
        Thread.sleep(1000);
    }
    public void DeleteCust() throws InterruptedException{
        driver.findElement(clickDelete).click();
        Thread.sleep(2000);
    }
    public void CloseBrowser(){
        driver.quit();
    }


}
