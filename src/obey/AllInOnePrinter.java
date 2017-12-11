package obey;

public class AllInOnePrinter implements Print, Scan, Fax {
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Copying...");
    }
}
