package oop;

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
    
    public void showEvents(String icsfile, String command) {

        
        System.out.println("Showing Events...");
        //diavazo to ical
        System.out.println("MMMPPPPRRR tipono tin event list");

    }

    public static void updateEvents(String icsfile) {
        System.out.println("Updating Events...");
        //diavazo to ical arxeio xoris allo orisma me ena mono orisma anoigei to edit mode
        if (icsfile.exists()) {
            Event.addEvent(icsfile);
        } else {
            System.out.println("MMPPPPRRRR kano update to iparxon event");
        }
        
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







