package henry.hotel.acceptance.steps;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import io.github.bonigarcia.wdm.WebDriverManager;

@ActiveProfiles("acceptance")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SeleniumStep {

	protected static final String SING_IN_TITLE_EXPECT = "Sign In";
	protected static final String SING_IN_TITLE = ".sign-in-container #regForm h1";
	protected static final String SING_IN_NAME = ".sign-in-container #regForm input[name=username]";
	protected static final String SING_IN_PASS = ".sign-in-container #regForm input[name=password]";
	protected static final String SING_IN_SUBMIT = ".sign-in-container #regForm #button";
	protected static final String SING_UP_TITLE_EXPECT = "Sign Up";
	protected static final String SING_UP_GO = ".overlay-panel #signUp";
	protected static final String SING_UP_TITLE = ".sign-up-container #regForm h1";
	protected static final String SING_UP_NAME = ".sign-up-container #regForm #email";
	protected static final String SING_UP_MAIL = ".sign-up-container #regForm input[name=username]";
	protected static final String SING_UP_PASS = ".sign-up-container #regForm input[name=password]";
	protected static final String SING_UP_MATCHING_PASS = ".sign-up-container #regForm input[name=matchingPassword]";
	protected static final String SING_UP_SUBMIT = ".sign-up-container #regForm #button";
	protected static final String DASHBOARD_ABOUT_ME = ".main-footer .colum1 h1";
	protected static final String DASHBOARD_ABOUT_ME_EXPECT = "About Me";

	protected static final String ACCOUNT_NAME = "user@server.com";
	protected static final String ACCOUNT_MAIL = "username";
	protected static final String ACCOUNT_PASS = "gwNm46owaj%gC#wAgA&";

	protected static final String SING_IN_ERROR = "#regForm .alert-danger";
	protected static final String SING_IN_ERROR_EXPECT = "Invalid username and password.";

	@LocalServerPort
	protected int port;

	protected WebDriver driver;

	public SeleniumStep() {
		WebDriverManager.chromedriver().setup();
	}

	public void openBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");
		driver = new ChromeDriver(options);

		driver.get(getBaseURL());

	}

	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}

	}

	String getBaseURL() {
		return "http://localhost:" + this.port + "/";
	}

	protected WebElement find(String selector) {

		int maxAttempts = 5;
		Duration waitTimeMs = Duration.ofSeconds(1);

		int attempts = 0;
		WebElement element = null;

		while (attempts < maxAttempts) {
			try {
				element = driver.findElement(By.cssSelector(selector));
				return element;
			} catch (NoSuchElementException e) {
				attempts++;
				System.out.println("Intento " + attempts + " de " + maxAttempts + " fallido. Reintentando en "
						+ waitTimeMs + " milisegundos...");
				this.waitUntil(waitTimeMs);
			}
		}

		return element = driver.findElement(By.cssSelector(selector));
	}

	protected String getText(String selector) {
		return find(selector).getAttribute("innerText");
	}

	protected void setValue(String selector, String value) {
		find(selector).sendKeys(value);
	}

	protected void click(String selector) {
		find(selector).click();
	}

	protected void assertText(String selector, String expected) {
		assertThat(getText(selector)).contains(expected);
	}

	protected void waitUntil(Duration delay) {
		try {
			Thread.sleep(delay.toMillis());
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
