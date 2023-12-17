package oop;


import java.util.List;



public class Main {

    public static void main(String[] args) {
        
        if (args.length == 0){
            String command = args[0];
            String icsFile = args[1];
            Cache.configureCacheProvider();
            List<Event> events = Parse.parseICalFile(icsFile);
            

            
            for (Event event : events) {
                Event.showEvents(icsFile, command,event);
                
                System.out.println(event);
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
        

        

            
        
    }
}