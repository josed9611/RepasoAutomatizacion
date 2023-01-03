#lenguage: en
Feature: Login Exitoso y Seleccion de productos por categoria en Linio
  Scenario: Buscar en Linio
    Given ingreso a Linio e inicio sesion
    When  me encuentro en Linio
    Then  busco producto y lo agrego al carrito