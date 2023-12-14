package oop;


import java.time.LocalDateTime;

import gr.hua.dit.oop2.calendar.TimeEvent;
import gr.hua.dit.oop2.calendar.TimeListener;
import gr.hua.dit.oop2.calendar.TimeService;
import gr.hua.dit.oop2.calendar.TimeTeller;


public class Main {

    public static void main(String[] args) {
        if (args.length == 2){
            String command = args[0];
            String icsFile = args[1];

            switch (command){
                case "day":
                    Event.showEvents(icsFile, command);
                    break;
                case "week":
                    Event.showEvents(icsFile, command);
                    break;
                case "month":
                    Event.showEvents(icsFile, command);
                    break;
                case "pastday":
                    Event.showEvents(icsFile, command);
                    break;
                case "pastweek":
                    Event.showEvents(icsFile, command);
                    break;
                case "pastmonth":
                    Event.showEvents(icsFile, command);
                    break;
                case "todo":
                    Event.showEvents(icsFile, command);
                    break;
                case "due":
                    Event.showEvents(icsFile, command);
                    break;
                default:
                    System.out.println("Invalid command");
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