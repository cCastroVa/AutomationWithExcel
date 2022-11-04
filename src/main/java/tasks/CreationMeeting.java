package tasks;

import models.MeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.Keys;
import userinterfaces.CreateMeetingPage;

public class CreationMeeting implements Task {
    private MeetingData meetingData;

    public CreationMeeting(MeetingData meetingData) {
        this.meetingData = meetingData;
    }
    public static CreationMeeting ofUnit(MeetingData meetingData) {
        return Tasks.instrumented(CreationMeeting.class, meetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CreateMeetingPage.MEETING),
                Click.on(CreateMeetingPage.MEETINGS),
                Click.on(CreateMeetingPage.NEW_MEETING),
                Enter.theValue(meetingData.getMeeting_name()).into(CreateMeetingPage.INPUT_MEETING_NAME),
                Click.on(CreateMeetingPage.SELECT_INPUT_MEETING_TYPE),
                Enter.theValue(meetingData.getMeeting_type()).into(CreateMeetingPage.INPUT_MEETING_TYPE).thenHit(Keys.ENTER),
                Enter.theValue(meetingData.getStart_date()).into(CreateMeetingPage.START_DATE),
                Select.value(meetingData.getStart_hour()).from(CreateMeetingPage.STAR_HOUR),
                Click.on(CreateMeetingPage.SELECT_MEETING_LOCATION),
                Enter.theValue(meetingData.getLocation()).into(CreateMeetingPage.INPUT_MEETING_LOCATION).thenHit(Keys.ENTER),
                Click.on(CreateMeetingPage.SELECT_ORGANIZED_BY),
                Enter.theValue(meetingData.getOrganized_by()).into(CreateMeetingPage.INPUT_ORGANIZED_BY).thenHit(Keys.ENTER),
                Enter.theValue(meetingData.getMeeting_number()).into(CreateMeetingPage.INPUT_MEETING_NUMBER),
                Enter.theValue(meetingData.getEnd_date()).into(CreateMeetingPage.END_DATE),
                Select.value(meetingData.getEnd_hour()).from(CreateMeetingPage.END_HOUR),
                Click.on(CreateMeetingPage.SELECT_UNIT),
                Enter.theValue(meetingData.getName_unit()).into(CreateMeetingPage.INPUT_MEETING_UNIT).thenHit(Keys.ENTER),
                Click.on(CreateMeetingPage.SELECT_REPORTER),
                Enter.theValue(meetingData.getReporter()).into(CreateMeetingPage.INPUT_MEETING_REPORTER).thenHit(Keys.ENTER));
    }
}
