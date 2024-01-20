#language:es
@Catalog @Regresion
Característica: como usuario de automationcompani
  quiero poder ingresar al apartado de catalogo
  para visualizar las opciones

  Antecedentes:
    Dado el usuario ingreso a la plataforma
    Cuando el usuario ingrese "usuario" "contraseña" y oprima entrar

  Escenario: el usuario visualiza la seccion de catalogo
    Dado que el usuario selecciona el apartado de catalogo
    Cuando selecciona la opcion de ver mas
    Entonces es redirigido a la seccion de catalogo y visualiza el catalogo


