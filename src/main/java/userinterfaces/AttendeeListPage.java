package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AttendeeListPage extends PageObject {
    public static final Target SELECT_CONTACT = Target.the("Where we add contact to meeting")
            .located(By.xpath("//span[@id='select2-chosen-12']"));
    public static final Target INPUT_CONTACT = Target.the("Where we write the contact name to add to meeting")
            .located(By.id("s2id_autogen12_search"));
    public static final Target SELECT_ATTENDEE_TYPE = Target.the("Where we select the attendee type to add to meeting")
            .located(By.xpath("//div[@class='slick-cell l2 r2']/select"));
    public static final Target BUTTON_SAVE = Target.the("Click on the button for save the unit busisness")
            .located(By.xpath("//span[contains(text(),'Save')]"));
}
