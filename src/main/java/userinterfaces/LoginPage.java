package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Where do we write the username")
            .located(By.name("Username"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password")
            .located(By.name("Password"));
    public static final Target BUTTON_LOGIN = Target.the("Click on the button for confirm to login")
            .located(By.xpath("//button[@type='submit']"));
    public static final Target NAME_PAGE = Target.the("Extract the page name")
            .located(By.xpath("//h1[contains(text(),'Dashboard')]"));
}
