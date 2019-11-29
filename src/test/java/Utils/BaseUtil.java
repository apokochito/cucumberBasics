package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class BaseUtil {

    public String stepInfo;
    public WebDriver driver;
    public ExtentReports extentReports;
    public static ExtentTest scenarioDef;
    public static ExtentTest features;
    public static String reportLocation = "C:\\Users\\Diana Elena\\IdeaProjects\\";
}
