package henry.hotel.acceptance.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
public class Login extends SeleniumStep {
	
	@Before
	public void before() {
		openBrowser();
	}

	@After
	public void after() {
		closeBrowser();
	}
	
	@Given("el usuario está en la página de inicio de sesión")
	public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
		// assertText(SING_IN_TITLE, SING_IN_TITLE_EXPECT);
	}
	@When("el usuario introduce un correo electrónico {string} y una contraseña {string} válidos")
	public void el_usuario_introduce_un_correo_electrónico_y_una_contraseña_válidos(String string, String string2) {
		// setValue(SING_IN_NAME, ACCOUNT_NAME);
		// setValue(SING_IN_PASS, ACCOUNT_PASS);
	}
	@When("hace clic en el botón de iniciar sesión")
	public void hace_clic_en_el_botón_de_iniciar_sesión() {
		// click(SING_IN_SUBMIT);
	}
	@Then("el usuario es redirigido a la página de inicio")
	public void el_usuario_es_redirigido_a_la_página_de_inicio() {
	    // System.out.println("SE verifica la URL actual");
	}
	@Then("se muestra la sección {string}")
	public void se_muestra_la_sección(String string) {
		// assertText(DASHBOARD_ABOUT_ME, string);
	}
	
	//////////////////////////////////////////////////////////////////////////////
	
	@When("el usuario introduce un correo electrónico {string} y una contraseña {string}")
	public void el_usuario_introduce_un_correo_electrónico_y_una_contraseña(String string, String string2) {

	}
	@Then("se muestra un mensaje de error que dice {string}")
	public void se_muestra_un_mensaje_de_error_que_dice(String string) {

	}

}
