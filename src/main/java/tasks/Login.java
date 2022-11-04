package tasks;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;

public class Login implements Task {
    private LoginData loginData;
    public Login(LoginData loginData) {
        this.loginData = loginData;
    }
    public static Login onThePage(LoginData loginData) {
        return Tasks.instrumented(Login.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(loginData.getUser()).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(loginData.getPassword()).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN));
    }
}
