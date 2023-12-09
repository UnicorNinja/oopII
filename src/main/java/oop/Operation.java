package oop;

//subclass of event
class Operation extends Event {
    private String due;
    private String status;

    public Operation(String eventName, String eventDate, String due, String status) {
        super(eventName, eventDate);
        this.due = due;
        this.status = status;
    }

    //getters and setters

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}