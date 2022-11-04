package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreatedMeetingAnswerData {
    private String meeting_name;
    public String getMeeting_name() {
        return meeting_name;
    }

    public static List<CreatedMeetingAnswerData> setData(DataTable dataTable){
        List<CreatedMeetingAnswerData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,CreatedMeetingAnswerData.class));
        }
        return dates;
    }
}
