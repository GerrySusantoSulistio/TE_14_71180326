import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;
import java.util.stream.Stream;

public class LoginTest {

    ChromeDriver chromeDriver;

    @Given("Browser dibuka")
    public void browser_dibuka() {
        System.out.println("Step Browser dibuka");
        System.setProperty("webdriver.chrome.driver",
                Objects.requireNonNull(getClass().getClassLoader()
                        .getResource("webdriver/chromedriver.exe")).getFile());
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    }
    @Given("user berada di halaman login")
    public void user_berada_di_halaman_login() {
        System.out.println("User berada di halaman login");
        chromeDriver.navigate().to("https://demo.guru99.com/insurance/v1/index.php");
    }
    @When("user memasukan email dan password")
    public void user_memasukan_email_dan_password() {
        System.out.println("masukan email dan password");
        chromeDriver.findElement(By.name("email")).sendKeys("Tambah@gmail.com");
        chromeDriver.findElement(By.name("password")).sendKeys("Tambah123");
    }
    @When("tombol login ditekan")
    public void tombol_login_ditekan() {
        System.out.println("tombol login ditekan");
        chromeDriver.findElement(By.name("submit")).click();
    }
    @Then("user redirect ke halaman utama")
    public void user_redirect_ke_halaman_utama() {
        System.out.println("user berada di halaman utama");
        chromeDriver.findElement(By.name("submit"));
        chromeDriver.close();
        chromeDriver.quit();
    }
}
