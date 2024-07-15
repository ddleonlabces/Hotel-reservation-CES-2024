Feature: Registro de usuario en el sistema
  Como visitante del sitio web
  Quiero registrar una nueva cuenta de usuario
  Para poder acceder a las funcionalidades del sitio

  Scenario: Registro exitoso de un nuevo usuario
    Given el visitante está en la página de registro
    When el visitante introduce un correo "<user@server.com>"
    And introduce un nombre de usuario "<username>"
    And introduce una contraseña "<gwNm46owaj%gC#wAgA&>"
    And introduce nuevamente la contraseña "<gwNm46owaj%gC#wAgA&>"
    And hace clic en el botón de registrar
    Then el visitante es registrado en el sistema
    And se muestra un mensaje de bienvenida
