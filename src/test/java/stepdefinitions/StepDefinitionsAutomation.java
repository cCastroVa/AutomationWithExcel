package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.AttendeeListData;
import models.CreatedMeetingAnswerData;
import models.LoginData;
import models.MeetingData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.MeetingCreationAnswer;
import tasks.Attendee;
import tasks.CreationMeeting;
import tasks.Login;
import tasks.OpenUp;

public class StepDefinitionsAutomation {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("the trainee is on the main page")
    public void theTraineeIsOnTheMainPage() {
        OnStage.theActorCalled("trainee").wasAbleTo(OpenUp.thePage());
    }
    @When("he login on the page")
    public void heLoginOnThePage(DataTable data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(LoginData.setData(data).get(0)));
    }
    @When("he program a new meeting")
    public void heProgramANewMeeting(DataTable meetingTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreationMeeting.ofUnit(MeetingData.setData(meetingTable).get(0)));
    }
    @When("he program the attendee")
    public void heProgramTheAttendee(DataTable listAttendee) {
        OnStage.theActorInTheSpotlight().attemptsTo(Attendee.List(AttendeeListData.setData(listAttendee).get(0)));
    }
    @Then("he should see the new meeting created in the page")
    public void heShouldSeeTheNewMeetingCreatedInThePage(DataTable table) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MeetingCreationAnswer.toThe(CreatedMeetingAnswerData
                .setData(table).get(0))));
    }
}
