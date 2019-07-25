package pageObject;

import objects.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

import java.util.List;

public class BasePage extends BasePO{

    protected NavigateBar bar;
    protected Search search;
    protected Order order;

    public BasePage(WebDriver driver){
        super(driver);
        bar = new NavigateBar(driver);
        search = new Search(driver);
        order = new Order();
    }

    public PORegistrarUsuario clickToRegister(){
        return bar.clickInRegister();
    }
    public LogIn clickToLogin(){
        return bar.clickInLogin();
    }
    public HomePage clickToLogout() { return bar.clickInLogout(); }
    public SearchResult goTobuscarProducto(String producto){
        return search.buscarProducto(producto);
    }

    public void clickElement(WebElement webElement){
        SeleniumUtils.clickElement(webElement, wait);
    }
    public void setText(WebElement webElement, String text){ SeleniumUtils.setText(webElement, wait, text); }
    public void selectByValue(WebElement webElement, String value){
        SeleniumUtils.selectByValue(webElement, value, wait);
    }
    public void selectByText(WebElement webElement, String text){
        SeleniumUtils.selectByText(webElement, text, wait);
    }
    public WebElement findElement(By locator){
        return SeleniumUtils.findElement(driver, locator);
    }
    public List<WebElement> findElements(By locator){
        return SeleniumUtils.findElements(driver, locator);
    }
    public void scrollIntoView(WebElement webElement){
        SeleniumUtils.scrollIntoView(driver, webElement);
    }
}
