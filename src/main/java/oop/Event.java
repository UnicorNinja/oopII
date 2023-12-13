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
    //tha prepei na einai to arxeio deutero orisma
    public static void showEvents(String typelist,String icsfile) {
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

    public String getEventDescription(){
        return eventDescription;
    }

    public void setEventDescription(String eventDescription){
        this.eventDescription = eventDescription;
    }

    

}







