package oop;

import java.time.LocalDateTime;

import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.component.VToDo;
//event class
public class Event {
    private String name;
    private String date;
    private String description;


    public Event(String name, String date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    static Event createEventFromVEvent(VEvent vEvent) {
        String name = vEvent.getSummary().getValue();
        String date = vEvent.getStartDate().getValue();
        String description = vEvent.getDescription().getValue();

        return new Event(name,date, description);
    }

    static Event createEventFromVToDo(VToDo vToDo){
        String name = vToDo.getSummary().getValue();
        String date = vToDo.getStartDate().getValue();
        String description = vToDo.getDescription().getValue();
        

        return new Event(name,date, description);
    }
    
    public static void showEvents(String icsfile, String command, Event event) {
        System.out.println("Showing Events...");
        LocalDateTime time = Time.timeNow();
        switch (command) {
            case "day":
                if Event.date.isEqual(time.getDayOfMonth() 
                
                break;
            case "week":
                break;
            case "month":
                break;
            case "pastday":
                break;
                
            case "pastweek":
                break;
                
            case "pastmonth":
                break;
                
            case "todo":
                break;
                
            case "due":
                Time.timeNow();
                break;
            default:
                break;
        }
        
        
        

    }

    public static void updateEvents(String icsfile) {
        System.out.println("Updating Events...");
        
        
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    

}







