package oop;

<<<<<<< HEAD
import gr.hua.dit.oop2.calendar.TimeEvent;
import gr.hua.dit.oop2.calendar.TimeListener;
import gr.hua.dit.oop2.calendar.TimeService;
import gr.hua.dit.oop2.calendar.TimeTeller;
=======
import java.time.LocalDateTime;
>>>>>>> fc4d2990af7c4df1ea56d7c590e64a49dc41a8f2

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        TimeTeller teller = TimeService.getTeller();
        teller.addTimeListener(new TimeListener() {
            public void TimeChanged(TimeEvent e) {
            System.out.println("Time has changed to " + e.getDteTime());
            }
        });
        TimeService.waitUntilTimeEnds();
        //tha prepei na pairnei ex arxis i efarmogi dio orismata pou tha pernane stin sinexeia sta methods.
        //isos den einai kali idea to menu etsi opos einai
=======
        System.out.println(LocalDateTime.now());
>>>>>>> fc4d2990af7c4df1ea56d7c590e64a49dc41a8f2
        new Menu();
    }
}