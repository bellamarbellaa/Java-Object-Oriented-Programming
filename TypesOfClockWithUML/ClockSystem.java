import java.util.Scanner;

class Clock {
    protected String time;
    protected boolean is24Hour;
    protected String alarmTime;

    // Constructor: Handles the "Input Data" that changes for every clock instance
    public Clock(String time, boolean is24Hour, String alarmTime) {
        this.time = time;
        this.is24Hour = is24Hour;
        this.alarmTime = alarmTime;
    }

    // Concrete method that returns the format text label based on the boolean state entered
    public String getFormat() {
        return is24Hour ? "24-hour" : "12-hour";
    }

    // Identity method meant to be overridden by subclasses to provide specific class names
    public String getClockType() {
        return "Generic Clock";
    }

    // Logical check to ensures not displaying a null or empty string as an alarm
    public String getAlarmTime() {
        if (alarmTime != null && !alarmTime.trim().isEmpty()) {
            return this.alarmTime;
        } else {
            return "No alarm set";
        }
    }

    // Complete method to display clock information, directly inherited by subclasses
    public void displayTime() {
        System.out.println("Clock type   : " + getClockType());
        System.out.println("Current time : " + time);
        System.out.println("Format       : " + getFormat());
        System.out.println("Alarm set for: " + getAlarmTime());
    }
}

// Subclasses demonstrating Inheritance and method overriding

class AlarmClock extends Clock {
    public AlarmClock(String t, boolean f, String a) { 
        super(t, f, a); // Super to pass data to parent constructor
    }
    @Override public String getClockType() { return "Alarm Clock"; }
}

class DigitalClock extends Clock {
    public DigitalClock(String t, boolean f, String a) { super(t, f, a); }
    @Override public String getClockType() { return "Digital Clock"; }
}

class WallClock extends Clock {
    public WallClock(String t, boolean f, String a) { super(t, f, a); }
    @Override public String getClockType() { return "Wall Clock"; }
}

class PocketWatch extends Clock {
    public PocketWatch(String t, boolean f, String a) { super(t, f, a); }
    @Override public String getClockType() { return "Pocket Watch"; }
}

class SmartWatch extends Clock {
    public SmartWatch(String t, boolean f, String a) { super(t, f, a); }
    @Override public String getClockType() { return "Smart Watch"; }
}

public class ClockSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Create a fixed-size Array stored with parent-type references to demonstrate Polymorphism
        Clock[] clocks = new Clock[5];

        // Use a loop to gather data and create specific object instances of the subclasses
        for (int i = 0; i < clocks.length; i++) {
            System.out.println("\n--- Setup Clock " + (i + 1) + " ---");
            System.out.println("1:Alarm, 2:Digital, 3:Wall, 4:Pocket, 5:Smart");
            System.out.print("Select Type: ");
            int type = scan.nextInt();
            scan.nextLine(); // BUFFER CLEAR: Essential after nextInt() to prevent skipping

            System.out.print("Enter current time (e.g., 14:30): ");
            String time = scan.nextLine(); 

            System.out.print("Is it 24-hour format? (true/false): ");
            boolean is24 = scan.nextBoolean();
            scan.nextLine(); // BUFFER CLEAR: Essential after nextBoolean()

            System.out.print("Enter alarm time (leave blank for none): ");
            String alarm = scan.nextLine();

            // Use Polymorphism to store different subclass types into a parent-type array
            if (type == 1) clocks[i] = new AlarmClock(time, is24, alarm);
            else if (type == 2) clocks[i] = new DigitalClock(time, is24, alarm);
            else if (type == 3) clocks[i] = new WallClock(time, is24, alarm);
            else if (type == 4) clocks[i] = new PocketWatch(time, is24, alarm);
            else if (type == 5) clocks[i] = new SmartWatch(time, is24, alarm);
            else clocks[i] = new Clock(time, is24, alarm);
        }

        System.out.println("\n--- Displaying Clock Information ---");
        
        // Use Polymorphic Loop for printing different subclass instances as much as the array size allows
        for (Clock c : clocks) {
            // Demonstrates Dynamic Binding to choose the correct method for each object at runtime
            c.displayTime();
            System.out.println("-------------------------------------------");
        }

        scan.close(); // Best practice: close the scanner when finished
    }
}