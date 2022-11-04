# Autor: ccastrova@choucairtesting.com
@automation
Feature: Practical exercise
  As an operational trainee, I want complete the technical challenge

  Scenario Outline: Create a new meeting
    Given the trainee is on the main page
    When he login on the page
      | user   | password   |
      | <user> | <password> |
    When he program a new meeting
      | meeting_name   | meeting_type   | start_date   | start_hour   | location   | organized_by   | meeting_number   | end_date   | end_hour   | name_unit   | reporter   |
      | <meeting_name> | <meeting_type> | <start_date> | <start_hour> | <location> | <organized_by> | <meeting_number> | <end_date> | <end_hour> | <name_unit> | <reporter> |
    And he program the attendee
      | attendee_name   | attendee_type   |
      | <attendee_name> | <attendee_type> |

    Then he should see the new meeting created in the page
      | meeting_name   |
      | <meeting_name> |
    Examples:
      | user  | password | meeting_name | meeting_type | start_date | start_hour | location | organized_by | meeting_number | end_date   | end_hour | name_unit | reporter    | attendee_name                          | attendee_type |
        ##@externaldata@./src/test/resources/datadriven/data.xlsx@test
   |admin   |serenity   |introduction   |General   |10/20/2022   |10:00   |On Site   |James Brooks   |M001   |10/20/2022   |12:30   |Sales   |Olivia Reed   |Olivia Reed,Alexis Lopez,Dylan Clark   |2,1,2|


