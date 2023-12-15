package oop;

import net.fortuna.ical4j.model.component.VEvent;

//subclass of event
class Appointment extends Event {
    private String time;
    private String duration;

    public Appointment(String name, String date,String description, String time, String duration) {
        super(name, date, description);
        this.time = time;
        this.duration = duration;
    }

    
    static Appointment createEventFromVEvent(VEvent vEvent) {
        String name = vEvent.getSummary().getValue();
        String date = vEvent.getStartDate().getValue();
        String description = vEvent.getDescription().getValue();
        String time = vEvent.getStartDate().getValue();
        String duration = vEvent.getDuration().getValue();

        return new Appointment(name, date, time, description, duration);
        
    }
    @Override
    public void showEvents(String icsfile, String command) {
        super.showEvents(icsfile, command);
    }

    // Getter and setter for location (you can add more methods as needed)

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration(){
        return duration;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }
}