package userinterfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AnswerMeetingPage extends PageObject {
    @FindBy(className = "s-Pro-Meeting-MeetingLink")
    public List<WebElement> unitCreated;
    public WebElement getMeetingNameCreated(String meetingName) {
        for (WebElement meetingCreated : unitCreated) {
            if (meetingCreated.getText().equals(meetingName)) {
                return meetingCreated;
            }
        }
        return null;
    }
}
