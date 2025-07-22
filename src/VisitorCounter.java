public class VisitorCounter {
    // Static variable to count total visitors
    private static int totalVisitors = 0;

    // Non-static variable for individual session
    private int sessionVisits;
    private String visitorName;

    // Constructor
    public VisitorCounter(String name) {
        this.visitorName = name;
        this.sessionVisits = 0;
        totalVisitors++; // Increment total when new visitor is created
    }

    // Non-static method
    public void recordVisit() {
        sessionVisits++;
        System.out.println(visitorName + " visited. Session visits: " + sessionVisits);
    }

    // Static method
    public static void displayTotalVisitors() {
        System.out.println("Total visitors today: " + totalVisitors);
    }

    // Static method to get total (getter)
    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static void main(String[] args) {
        // Create 3 different visitors
        // Have each visitor record some visits
        // Display total visitors using static method

        VisitorCounter vister1 = new VisitorCounter("vister1");
        vister1.recordVisit();
        vister1.recordVisit();
        vister1.recordVisit();
        displayTotalVisitors();

        VisitorCounter vister2 = new VisitorCounter("vister2");
        vister2.recordVisit();
        displayTotalVisitors();

        VisitorCounter vister3 = new VisitorCounter("vister3");
        vister3.recordVisit();
        displayTotalVisitors();

        System.out.println("record >>");
        vister1.recordVisit();
        vister2.recordVisit();
        vister3.recordVisit();
    }
}
