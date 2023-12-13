package oop;

import gr.hua.dit.oop2.calendar.TimeEvent;
import gr.hua.dit.oop2.calendar.TimeListener;
import gr.hua.dit.oop2.calendar.TimeService;
import gr.hua.dit.oop2.calendar.TimeTeller;

public class Main {

    public static void main(String[] args) {
        TimeTeller teller = TimeService.getTeller();
        teller.addTimeListener(new TimeListener() {
            public void TimeChanged(TimeEvent e) {
            System.out.println("Time has changed to " + e.getDteTime());
            }
        });
        TimeService.waitUntilTimeEnds();
        //tha prepei na pairnei ex arxis i efarmogi dio orismata pou tha pernane stin sinexeia sta methods.
        //isos den einai kali idea to menu etsi opos einai
        new Menu();
    }
}