package oop;

//subclass of event
class Appointment extends Event {
    private String time;
    private String duration;

    public Appointment(String eventName, String eventDate, String time, String duration) {
        super(eventName, eventDate);
        this.time = time;
        this.duration = duration;
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