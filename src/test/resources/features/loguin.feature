#language:es
@LoguinRegresion @Regresion
Característica: como usuario de automationcompani
  quiero poder loguearme a la pagina web
  cuando ingrese usuario y contraseña validos
  entonces se visualizara el home de la pagina web

  @HappyPathLoguin
  Escenario: : que el usuario ingresa con credenciales correctas
    Dado el usuario ingreso a la plataforma
    Cuando el usuario ingrese "usuario" "contraseña" y oprima entrar
    Entonces el usuario es redirigido a la pagina de inicio y visualiza el mensaje de bienvenida
    Y el usuario cierra sesion

  @UnHappyPathLoguin
  Escenario: que el usuario ingresa con credenciales incorrectas
    Dado el usuario ingreso a la plataforma
    Cuando el usuario ingrese "usuario" "contraseña" incorrectas y oprima entrar
    Entonces el usuario visualiza el mensaje de credenciales incorrectas
