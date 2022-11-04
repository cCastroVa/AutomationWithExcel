package questions;

import models.CreatedMeetingAnswerData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.AnswerMeetingPage;

public class MeetingCreationAnswer implements Question<Boolean> {
    private CreatedMeetingAnswerData createdMeetingAnswerData;
    private AnswerMeetingPage answerMeetingPage;
    public MeetingCreationAnswer(CreatedMeetingAnswerData createdMeetingAnswerData) {
        this.createdMeetingAnswerData = createdMeetingAnswerData;
    }
    public static MeetingCreationAnswer toThe(CreatedMeetingAnswerData createdMeetingAnswerData) {
        return new MeetingCreationAnswer(createdMeetingAnswerData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String meetingCreated = answerMeetingPage.getMeetingNameCreated(createdMeetingAnswerData.getMeeting_name()).getText();
        if (createdMeetingAnswerData.getMeeting_name().equals(meetingCreated)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
