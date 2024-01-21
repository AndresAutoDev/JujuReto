#language:es
@Regresion @CataloRegresion
Característica: como usuario de automationcompani
  quiero poder ingresar al apartado de catalogo
  para visualizar las opciones

  Antecedentes:
    Dado el usuario ingreso a la plataforma
    Cuando el usuario ingrese "usuario" "contraseña" y oprima entrar

  @Catalog
  Escenario: el usuario visualiza la seccion de catalogo
    Dado que el usuario selecciona el apartado de catalogo y de clic en ver mas
    Entonces es redirigido a la seccion de catalogo y visualiza el catalogo

  @Products
  Escenario: el usuario visualiza la seccion de productos destacados
    Dado que el usuario este en el apartado de catalogo
    Entonces visualiza los productos destacados



