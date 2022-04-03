import org.junit.Assert;
import org.junit.Test;

public class AuomationTESTS {

    @Test
    public void getUrlTest() {
        AutomationPractice da= new AutomationPractice
                ("C:\\Users\\hothaifa\\Desktop\\chromedriver.exe");

        Assert.assertEquals
                (da.SignUpTest(),"https://www.google.com/");
    }
    @Test
    public void sss() {
        AutomationPractice da= new AutomationPractice
                ("C:\\Users\\hothaifa\\Desktop\\chromedriver.exe");

        Assert.assertEquals
                (da.foo(),"https://www.google.com/");
    }

}
