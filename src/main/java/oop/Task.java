package oop;

//subclass of event
class Task extends Event {
    private String due;
    private boolean status;

    public Task(String name, String date,String description, String due, boolean status) {
        super(name, date,description);
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

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}