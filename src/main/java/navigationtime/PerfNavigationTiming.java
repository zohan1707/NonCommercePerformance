package navigationtime;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.BatchPoints;
import org.influxdb.dto.Pong;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.FileWriter;
import java.util.Map;

public class PerfNavigationTiming {
    WebDriver driver;

    Map<String, Object> timings = null;

    public static FileWriter fileWriter;

    private final String javaScriptForPerformance = "var timings = performance.timing || {}; return timings;";
    private final String getJavaScriptForPerformanceGoogleChrome = "return {performance:JSON.stringify(performance.timing)}";

    InfluxDB influxDB = InfluxDBFactory.connect("http://localhost:8086/orgs/ba84326b3bc7f46c");

    BatchPoints batchPoints = BatchPoints
            .database("InfluxDB")
            .retentionPolicy("autogen")
            .build();

    public boolean checkDBCConnection() {
        influxDB.setLogLevel(InfluxDB.LogLevel.BASIC);
        Pong response = this.influxDB.ping();
        return true;
    }

    public void writeToInflux(String pageName) {
        getAllTiming();
    }

    public Map<String, Object> getAllTiming() {
        JavascriptExecutor jsrunner = (JavascriptExecutor) driver;
        Map<String, Object> isTimings = (Map<String, Object>) jsrunner.executeScript(getJavaScriptForPerformanceGoogleChrome);
        timings = (Map<String, Object>) jsrunner.executeScript(javaScriptForPerformance);
        return timings;

    }
}
