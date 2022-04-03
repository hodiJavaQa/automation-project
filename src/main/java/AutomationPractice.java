import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

    private String url;

    public  AutomationPractice (String url) {
        this.url=url;
    }

    public String SignUpTest() {
        System.setProperty("webdriver.chrome.driver"
                , this.url);
        WebDriver driver = new ChromeDriver();
        // site name
        driver.get("https://www.google.com");
        return driver.getTitle();
    }
    public String foo() {

        System.setProperty("webdriver.chrome.driver"
                , this.url);
        WebDriver driver = new ChromeDriver();

        return driver.getTitle();
    }



}
