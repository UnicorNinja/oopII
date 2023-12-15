package oop;

import net.fortuna.ical4j.model.component.VToDo;

//subclass of event
class Task extends Event {
    private String due;
    private String status;

    public Task(String name, String date, String description, String due, String status) {
        super(name, date,description);
        this.due = due;
        this.status = status;
    }

    
    static Task createEventFromVToDo(VToDo vToDo) {
        String name = vToDo.getSummary().getValue();
        String date = vToDo.getStartDate().getValue();
        String dueDate = vToDo.getDue() != null ? vToDo.getDue().getValue() : null;
        String description = vToDo.getDescription().getValue();
        String status = vToDo.getStatus().getValue();

        return new Task(name, date, dueDate, description, status);
    }
    
    public void showEvents(String icsfile, String command) {
        super.showEvents(icsfile, command);
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