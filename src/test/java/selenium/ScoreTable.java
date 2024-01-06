package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ScoreTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2023-24-1387592/south-africa-vs-india-2nd-test-1387604/full-scorecard");
        List<WebElement> ls = driver.findElements(By.className("ci-scorecard-table"));
        WebElement secInningsTable = ls.get(1);
        WebElement tableHeader = secInningsTable.findElement(By.tagName("thead"));
        WebElement header_row = tableHeader.findElement(By.tagName("tr"));
        List<WebElement> headerColumns = header_row.findElements(By.tagName("th"));

        for (WebElement hc : headerColumns) {
            System.out.print(hc.getText() + "\t\t\t");
        }
        System.out.println();
        List<WebElement> rows = secInningsTable.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t\t");
            }
            System.out.println();
        }
        driver.quit();
    }
}

