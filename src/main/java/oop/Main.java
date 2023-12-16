package oop;


import java.time.LocalDateTime;
import java.util.List;

import gr.hua.dit.oop2.calendar.TimeEvent;
import gr.hua.dit.oop2.calendar.TimeListener;
import gr.hua.dit.oop2.calendar.TimeService;
import gr.hua.dit.oop2.calendar.TimeTeller;


public class Main {

    public static void main(String[] args) {
        
        if (args.length == 0){
            String command = "day";//args[0];
            String icsFile = "c:\\Users\\UnicorNinja\\Documents\\ical\\calendar1"; //args[1];
            List<Event> events = Parse.parseICalFile(icsFile, command);

            // Use the 'events' list as needed
            for (Event event : events) {
                // Do something with each event
                System.out.println(event);
            }
        }
        else if (args.length == 1){
            String icsFile = args[0];
            Event.updateEvents(icsFile);
        }
        else{
            System.out.println("Usage: java -jar calendar.jar <command(optional)> <icsfile");
            System.out.println("commands: day, week, month, pastday, pastweek, pastmonth, todo, due");
            System.out.println("Command prints a list of events. If no command is included then you may add a new event or create calendar");
            System.out.println("Please input a valid command");
            
        }
        

            
            TimeTeller teller = TimeService.getTeller();
            teller.addTimeListener(new TimeListener() {
                public void timeChanged(TimeEvent e) {
                    System.out.println("Time has changed to " + e.getDateTime());
                }
            });
        TimeService.waitUntilTimeEnds();
        //tha prepei na pairnei ex arxis i efarmogi dio orismata pou tha pernane stin sinexeia sta methods.
        //isos den einai kali idea to menu etsi opos einai

        System.out.println(LocalDateTime.now());

            
        
    }
}