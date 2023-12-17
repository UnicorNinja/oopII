package oop;

import java.time.LocalDateTime;

import gr.hua.dit.oop2.calendar.TimeEvent;
import gr.hua.dit.oop2.calendar.TimeListener;
import gr.hua.dit.oop2.calendar.TimeService;
import gr.hua.dit.oop2.calendar.TimeTeller;

public class Time {

    public static LocalDateTime timeNow() {
        TimeTeller teller = TimeService.getTeller();

        teller.addTimeListener(new TimeListener() {
            public void timeChanged(TimeEvent e) {
                System.out.println("Time has changed to " + e.getDateTime());
            }
        });

        TimeService.waitUntilTimeEnds();

        return(LocalDateTime.now());
    }
}