package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_Product {

    WebDriver driver;

    public P04_Product(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-wishlist-button-4")
    public WebElement WhishlistIcon;

    @FindBy(id = "add-to-cart-button-4")
    public WebElement addCart;

}
}
