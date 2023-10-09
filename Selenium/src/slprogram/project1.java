package slprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class project1 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:/Users/HARI/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //radio buttons
	   driver.get("https://demoqa.com/automation-practice-form");
	    WebElement radioElement=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
	   radioElement.click();
	    
	      
	    
	    //Check boxes
	    driver.get("https://demoqa.com/checkbox");
	    driver.manage().window().maximize();
	    WebElement checkBoxSelected=driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
	    boolean isSelected = checkBoxSelected.isSelected();
	    System.out.println(isSelected);
	    if(isSelected == false) {
	    	checkBoxSelected.click();
	    }
	    
	    // isDisplayed
	     driver.get("https://duckduckgo.com/");
	    WebElement searchBox = driver.findElement(By.className("searchbox_input__bEGm3"));
        if (searchBox.isDisplayed()) {
            System.out.println("Search Box is visible" + searchBox.isDisplayed());
        } else {
            System.out.println("Search Box is not visible" + searchBox.isDisplayed());
        } 
 
       // isEnabled
        if (searchBox.isEnabled()) {
            System.out.println("Search Box is enabled" + searchBox.isEnabled());
            searchBox.sendKeys("Selenium");
        } else {
            System.out.println("Search Box is not enabled" + searchBox.isEnabled());
        }
	    
	    //Drop down
	    driver.get("https:/www.sugarcrm.com/au/request-demo/");
	    driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).sendKeys("xyz@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).sendKeys("Agathiyan");
	    driver.findElement(By.xpath("//*[@id=\"field8\"]/div/input")).sendKeys("N");
	    driver.findElement(By.xpath("//*[@id=\"field24\"]/div/input")).sendKeys("9876543210");
	    WebElement drop = driver.findElement(By.name("employees_c"));
	    Select select = new Select(drop);
	    select.selectByValue("level1");
	    select.selectByVisibleText("101 - 250 employees");
	    select.selectByIndex(4);
	}

}