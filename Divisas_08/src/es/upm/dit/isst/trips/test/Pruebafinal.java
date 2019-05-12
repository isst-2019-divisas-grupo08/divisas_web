package es.upm.dit.isst.trips.test;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class Pruebafinal {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	//Indicamos donde se encuentra el archivo con el driver de chrome
	  System.setProperty( "webdriver.chrome.driver", "C:\\Users\\RodriguezRuiz\\Downloads");
	  driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void Pruebafinal() {
    driver.get("http://localhost:8080/Trips/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.name("email")).sendKeys("isabel.roruiz@alumnos.upm.es");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("aa");
    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    driver.findElement(By.linkText("HOME")).click();
    driver.findElement(By.cssSelector("select:nth-child(1)")).click();
    driver.findElement(By.cssSelector("select:nth-child(1)")).click();
    driver.findElement(By.id("selectCurrency")).click();
    driver.findElement(By.id("selectCurrency")).sendKeys("200");
    driver.findElement(By.cssSelector("form")).click();
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".misDatos")).click();
    driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.id("originWallet")).click();
    {
      WebElement dropdown = driver.findElement(By.id("originWallet"));
      dropdown.findElement(By.xpath("//option[. = 'GBP']")).click();
    }
    driver.findElement(By.id("originWallet")).click();
    driver.findElement(By.id("destinyWallet")).click();
    {
      WebElement dropdown = driver.findElement(By.id("destinyWallet"));
      dropdown.findElement(By.xpath("//option[. = 'USD']")).click();
    }
    driver.findElement(By.id("destinyWallet")).click();
    driver.findElement(By.id("amountMoney")).click();
    driver.findElement(By.id("amountMoney")).sendKeys("130");
    driver.findElement(By.id("currency")).click();
    driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.id("originWallet")).click();
    {
      WebElement dropdown = driver.findElement(By.id("originWallet"));
      dropdown.findElement(By.xpath("//option[. = 'EUR']")).click();
    }
    driver.findElement(By.id("originWallet")).click();
    driver.findElement(By.id("calcChange")).click();
    driver.findElement(By.linkText("MI CARTERA")).click();
    driver.findElement(By.id("currency")).click();
    {
      WebElement dropdown = driver.findElement(By.id("currency"));
      dropdown.findElement(By.xpath("//option[. = 'USD']")).click();
    }
    driver.findElement(By.id("currency")).click();
    driver.findElement(By.cssSelector("button:nth-child(2)")).click();
    driver.findElement(By.id("currency")).click();
    driver.findElement(By.id("currency")).click();
    driver.findElement(By.id("originWallet")).click();
    {
      WebElement dropdown = driver.findElement(By.id("originWallet"));
      dropdown.findElement(By.xpath("//option[. = 'GBP']")).click();
    }
    driver.findElement(By.id("originWallet")).click();
    driver.findElement(By.id("amountMoney")).click();
    driver.findElement(By.id("amountMoney")).sendKeys("132");
    driver.findElement(By.id("calcChange")).click();
    driver.findElement(By.id("confirmChange")).click();
    driver.findElement(By.cssSelector(".misDatos")).click();
    driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.linkText("Salir")).click();
    driver.findElement(By.linkText("HOME")).click();
    driver.findElement(By.linkText("REGISTRATE")).click();
    driver.findElement(By.name("nombre")).click();
    driver.findElement(By.name("nombre")).sendKeys("Jesús");
    driver.findElement(By.name("apellido")).sendKeys("Rodriguez Ruiz");
    driver.findElement(By.name("DNI")).sendKeys("2255599A");
    driver.findElement(By.name("pais")).sendKeys("Spain");
    driver.findElement(By.name("direccion")).click();
    driver.findElement(By.name("direccion")).sendKeys("Calle Potasa, Nº20, 2ºD");
    driver.findElement(By.name("telefono")).sendKeys("617660227");
    driver.findElement(By.name("direccion")).click();
    driver.findElement(By.name("direccion")).sendKeys("Calle Potasa, N20, 2D");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("junior9067@hotmail.com");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("aa");
    driver.findElement(By.cssSelector(".pass:nth-child(11) > input")).click();
    driver.findElement(By.cssSelector(".pass:nth-child(11) > input")).sendKeys("aa");
    driver.findElement(By.cssSelector("input:nth-child(12)")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("junior9067@hotmail.com");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("aa");
    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    driver.findElement(By.linkText("HOME")).click();
    driver.findElement(By.linkText("MI CARTERA")).click();
    driver.findElement(By.cssSelector("button:nth-child(2)")).click();
    driver.findElement(By.id("currency")).click();
    {
      WebElement dropdown = driver.findElement(By.id("currency"));
      dropdown.findElement(By.xpath("//option[. = 'USD']")).click();
    }
    driver.findElement(By.id("currency")).click();
    driver.findElement(By.cssSelector(".misDatos")).click();
    driver.findElement(By.cssSelector("button:nth-child(2)")).click();
    driver.findElement(By.id("originWallet")).click();
    {
      WebElement dropdown = driver.findElement(By.id("originWallet"));
      dropdown.findElement(By.xpath("//option[. = 'EUR']")).click();
    }
    driver.findElement(By.id("originWallet")).click();
    driver.findElement(By.id("destinyWallet")).click();
    {
      WebElement dropdown = driver.findElement(By.id("destinyWallet"));
      dropdown.findElement(By.xpath("//option[. = 'USD']")).click();
    }
    driver.findElement(By.id("destinyWallet")).click();
    driver.findElement(By.id("amountMoney")).click();
    driver.findElement(By.id("amountMoney")).sendKeys("200");
    driver.findElement(By.id("calcChange")).click();
    driver.findElement(By.cssSelector("select:nth-child(5)")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("select:nth-child(5)"));
      dropdown.findElement(By.xpath("//option[. = 'a tres dias']")).click();
    }
    driver.findElement(By.cssSelector("select:nth-child(5)")).click();
    driver.findElement(By.id("confirmChange")).click();
  }
}
