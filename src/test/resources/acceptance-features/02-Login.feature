Feature: Inicio de sesión en el sitio web
  Como usuario
  Quiero iniciar sesión en el sitio web
  Para poder acceder a mi contenido personalizado

  Scenario: Inicio de sesión exitoso con credenciales correctas
    Given el usuario está en la página de inicio de sesión
    When el usuario introduce un correo electrónico "<correo>" y una contraseña "<contraseña>" válidos
    And hace clic en el botón de iniciar sesión
    Then el usuario es redirigido a la página de inicio
    And se muestra la sección "About Me"

  Scenario Outline: Inicio de sesión con credenciales incorrectas
    Given el usuario está en la página de inicio de sesión
    When el usuario introduce un correo electrónico "<correo>" y una contraseña "<contraseña>"
    And hace clic en el botón de iniciar sesión
    Then se muestra un mensaje de error que dice "<mensaje_error>"

    Examples:
      | correo                | contraseña   | mensaje_error                                  |
      | usuarioincorrecto@ejemplo.com | contraseña123 | Invalid username and password. |
      | usuariovalido@ejemplo.com    | password456   | Invalid username and password. |
      | correoincorrecto@ejemplo.com | pass789       | Invalid username and password. |

