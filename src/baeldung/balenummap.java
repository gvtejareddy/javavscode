package baeldung;

import java.util.EnumMap;
import java.util.Map;

public class balenummap {

    public static void main(String[] args) {
        Map<DayOfWeek, String> activityMap = new EnumMap<>(DayOfWeek.class);

        activityMap.put(DayOfWeek.MONDAY, "cricket");
        activityMap.put(DayOfWeek.MONDAY, "basketball");

        activityMap.forEach((key,value)->{
            System.out.println(key + ":" + value);
        });
    }

}