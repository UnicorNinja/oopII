package oop;

//event class
class Event {
    private String eventName;
    private String eventDate;
    private String eventDescription;


    public Event(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
    }

    public static void showEvents() {
        System.out.println("Showing Events...");
        // Implement logic to show events
    }

    public static void updateEvents() {
        System.out.println("Updating Events...");
        // Implement logic to update events
    }

    //getters and setters

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void getEventDescription(){
        return eventDescritpion;
    }

    public String setEventDescription(String eventDescription){
        this.eventDescription = eventDescription;
    }

    

}







