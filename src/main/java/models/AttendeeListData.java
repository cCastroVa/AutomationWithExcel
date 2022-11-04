package models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AttendeeListData {
    private String attendee_name;
    private String attendee_type;

    public String getAttendee_name() {
        return attendee_name;
    }

    public String getAttendee_type() {
        return attendee_type;
    }

    public static List<AttendeeListData> setData(DataTable dataTable){
        List<AttendeeListData> dates= new ArrayList<>();
        List<Map<String,String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map: mapIfo){
            dates.add(new ObjectMapper().convertValue(map,AttendeeListData.class));
        }
        return dates;
    }
}
