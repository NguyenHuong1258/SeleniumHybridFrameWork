package utilities.reports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.*;


public class ExtentReporterNG implements IReporter {
    static ExtentReports extent;
    static String reportFolder = "ExtentReport";


    public static ExtentReports extentReportGenerator() {
        String path = reportFolder + "/" + "index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web automation result --- LeaHo Corp 1 set");
        reporter.config().setDocumentTitle("Test Result - LeaHo Corp");
        reporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Testing extent report", "Lea Ho");
        return extent;

    }
}
