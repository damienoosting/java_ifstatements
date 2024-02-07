import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("enter age: ");
        int age = SaxionApp.readInt();
        SaxionApp.print("enter position: ");
        String p = SaxionApp.readString();

        if ((p.equalsIgnoreCase("striker") && age <= 20) || (p.equalsIgnoreCase("midfielder") && age <= 23) || (p.equalsIgnoreCase("defender")&& age <= 30)){
            SaxionApp.printLine("suitable player", Color.GREEN);}
            else{
                SaxionApp.printLine("nope... next", Color.red);
        }
}}

