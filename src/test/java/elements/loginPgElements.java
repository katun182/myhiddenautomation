package elements;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import javax.xml.ws.soap.Addressing;

/**
 * Created by saman on 2/12/17.
 */
public class loginPgElements {

    @AndroidFindBy(id="")
    public WebElement usernameInput;

    @AndroidFindBy(id="")
    public WebElement passwordInput;

    @AndroidFindBy(id="")
    public WebElement loginButton;

}
