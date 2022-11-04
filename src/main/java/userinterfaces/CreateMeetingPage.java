package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateMeetingPage extends PageObject {
    public static final Target MEETING = Target.the("Click on the option of meeting")
            .located(By.xpath("//*[text()='Meeting']"));
    public static final Target MEETINGS = Target.the("Click on the option of meetings")
            .located(By.xpath("//*[text()='Meetings']"));
    public static final Target NEW_MEETING = Target.the("Click on the option of new meeting")
            .located(By.xpath("//span[contains(text(),'New Meeting')]"));
    public static final Target INPUT_MEETING_NAME = Target.the("Where we write the meeting name")
            .located(By.name("MeetingName"));
    public static final Target SELECT_INPUT_MEETING_TYPE = Target.the("Click on the meeting type")
            .located(By.id("select2-chosen-6"));
    public static final Target INPUT_MEETING_TYPE = Target.the("Where we write the meeting type")
            .located(By.id("s2id_autogen6_search"));
    public static final Target START_DATE = Target.the("Where we write the start date of the meeting")
            .located(By.name("StartDate"));
    public static final Target STAR_HOUR = Target.the("Where we write the start hour of the meeting")
            .located(By.xpath("//div[@class='field StartDate col-sm-6']/select"));
    public static final Target SELECT_MEETING_LOCATION = Target.the("Click on the meeting location")
            .located(By.id("select2-chosen-7"));
    public static final Target INPUT_MEETING_LOCATION = Target.the("Where we write the meeting location")
            .located(By.id("s2id_autogen7_search"));
    public static final Target SELECT_ORGANIZED_BY = Target.the("Click on the input organize by")
            .located(By.id("select2-chosen-9"));
    public static final Target INPUT_ORGANIZED_BY = Target.the("Where we write, who organize the meeting ")
            .located(By.id("s2id_autogen9_search"));
    public static final Target INPUT_MEETING_NUMBER = Target.the("Where we write the number of the meeting ")
            .located(By.name("MeetingNumber"));
    public static final Target END_DATE = Target.the("Where we write the start date of the meeting")
            .located(By.name("EndDate"));
    public static final Target END_HOUR = Target.the("Where we write the start hour of the meeting")
            .located(By.xpath("//div[@class='field EndDate col-sm-6']/select"));
    public static final Target SELECT_UNIT = Target.the("Click in the unit of the meeting ")
            .located(By.id("select2-chosen-8"));
    public static final Target INPUT_MEETING_UNIT = Target.the("Click on the unit of the meeting")
            .located(By.id("s2id_autogen8_search"));
    public static final Target SELECT_REPORTER = Target.the("Click in the unit of the meeting ")
            .located(By.id("select2-chosen-10"));
    public static final Target INPUT_MEETING_REPORTER = Target.the("Click on the reporter of the meeting")
            .located(By.id("s2id_autogen10_search"));
}
