 // Your First Program

import java.util.*;
import java.time.*;


class Main {
    public static void main(String[] args) {
        System.out.println("Real time is shown below , it's live");

        Date date = new Date();
 
        LocalDateTime d = LocalDateTime.now();
 
        ZonedDateTime UTCtime = d.atZone(ZoneId.of("UTC"));
        //"d" is the current date and
        //"ZonedDateTime" accepts "d" as UTC
        //"atZone" specifies the time zone
 
        // converting to IST
        ZonedDateTime ISTtime = UTCtime.withZoneSameInstant(
            ZoneId.of("Asia/Kolkata"));
        //"withZoneSameInstant" convert the time
        // to given time zone
 
        System.out.println(ISTtime);
    }
}