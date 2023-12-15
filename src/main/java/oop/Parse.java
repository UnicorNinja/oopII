package oop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.ComponentList;
import net.fortuna.ical4j.model.component.CalendarComponent;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.component.VToDo;


public class Parse {
    public static List <Event> parseICalFile(String icsFile, String command) {
        List <Event> events = new ArrayList <> ();
        InputStream is = null;

        try {
            is = new FileInputStream(icsFile);
            CalendarBuilder builder = new CalendarBuilder();
            Calendar calendar = builder.build(is);
            ComponentList<CalendarComponent> components = calendar.getComponents();
            for (CalendarComponent component : components) {
                
                if (component instanceof VEvent) {
                    VEvent vEvent = (VEvent) component;
                    events.add(Event.createEventFromVEvent(vEvent));
                }
                else if(component instanceof VToDo){
                    VToDo vToDo = (VToDo) component;
                    events.add(Task.createEventFromVToDo(vToDo));
                }
            }
        } catch (IOException | ParserException e) {
            e.printStackTrace();
        } finally {
            if (is!= null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return events;
    }
}
