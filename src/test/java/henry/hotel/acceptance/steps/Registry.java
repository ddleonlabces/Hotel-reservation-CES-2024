package henry.hotel.acceptance.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registry extends SeleniumStep {
	
	@Before
	public void before() {
		openBrowser();
	}

	@After
	public void after() {
		closeBrowser();
	}

	@Given("el visitante está en la página de registro")
	public void el_visitante_está_en_la_página_de_registro() {
		// assertText(SING_IN_TITLE, SING_IN_TITLE_EXPECT);
		// click(SING_UP_GO);
		// assertText(SING_UP_TITLE, SING_UP_TITLE_EXPECT);
	}

	@When("el visitante introduce un correo {string}")
	public void el_visitante_introduce_un_correo(String string) {
		// setValue(SING_UP_MAIL, string);
	}

	@When("introduce un nombre de usuario {string}")
	public void introduce_un_nombre_de_usuario(String string) {
		// setValue(SING_UP_NAME, string);
	}

	@When("introduce una contraseña {string}")
	public void introduce_una_contraseña(String string) {
		// setValue(SING_UP_PASS, string);
	}

	@When("introduce nuevamente la contraseña {string}")
	public void introduce_nuevamente_la_contraseña(String string) {
		// setValue(SING_UP_MATCHING_PASS, string);
	}

	@When("hace clic en el botón de registrar")
	public void hace_clic_en_el_botón_de_registrar() {
		// waitUntil(Duration.ofSeconds(1));
		// click(SING_UP_SUBMIT);
	}

	@Then("el visitante es registrado en el sistema")
	public void el_visitante_es_registrado_en_el_sistema() {

	}

	@Then("se muestra un mensaje de bienvenida")
	public void se_muestra_un_mensaje_de_bienvenida() {

	}

}
