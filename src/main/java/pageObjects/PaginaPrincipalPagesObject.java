package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://librerianacional.com/")
public class PaginaPrincipalPagesObject extends PageObject {
    private By Btn_micuenta = By.xpath("(//button[contains(text(), 'Mi cuenta')])[2]");
    private By Btn_InicioSesion = By.xpath("(//a[@href='/usuario/ingresar'])[2]");
    private By Btn_EmailYContrasena = By.xpath("(//i[@class='fas fa-lock text--gray text--lg mr-2 mr-md-3'])[1]");
    private By Txt_usuario = By.xpath("//input[@name='usuario']");
    private By Txt_contrasena = By.xpath("//input[@name='contrasena']");

    private By Btn_iniciar = By.xpath("//button[@class='d-block px-5 py-3 btn-red-medium border-0 border-radius-0 bs-none outline-0 text-center text--upper text-white text--xl text--extrabold text-center']");
    private By Btn_libros = By.xpath("(//a[@href='/categoria/libros'])[2]");

    private By Btn_Producto1 = By.xpath("(//a[@href='/producto/luna-latina-en-manhattan'])[1]");
    private By Btn_carrito = By.xpath("(//button[@class='btn d-flex align-items-center py-2 px-3 btn-blue-medium border-0 border-radius-0 bs-none outline-0 text-center text--upper text-white text--xl text--extrabold h-100'])[1]");

    private By Btn_SeguirComprando = By.xpath("//a[@class='text--blue text--semibold text--xm']");
    private By Txt_barraBuscar = By.xpath("(//input[@formcontrolname='buscar'])[2]");

    private By Btn_Producto2 = By.xpath("(//a[@href='/producto/los-demonios-del-reich'])[1]");

    private By Lbl_producto = By.xpath("//h1[contains(text(),'LOS DEMONIOS DEL REICH')]");






    public By getBtn_micuenta() {
        return Btn_micuenta;
    }

    public By getBtn_InicioSesion() {
        return Btn_InicioSesion;
    }

    public By getBtn_EmailYContrasena() {
        return Btn_EmailYContrasena;
    }

    public By getTxt_usuario() {
        return Txt_usuario;
    }

    public By getTxt_contrasena() {
        return Txt_contrasena;
    }

    public By getBtn_iniciar() {
        return Btn_iniciar;
    }

    public By getBtn_libros() {
        return Btn_libros;
    }

    public By getBtn_Producto1() {
        return Btn_Producto1;
    }

    public By getBtn_SeguirComprando() {
        return Btn_SeguirComprando;
    }

    public By getBtn_carrito() {
        return Btn_carrito;
    }

    public By getTxt_barraBuscar() {
        return Txt_barraBuscar;
    }

    public By getBtn_Producto2() {
        return Btn_Producto2;
    }

    public By getLbl_producto() {
        return Lbl_producto;
    }
}
