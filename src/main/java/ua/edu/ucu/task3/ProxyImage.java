package ua.edu.ucu.task3;

public class ProxyImage implements MyImage{
    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        RealImage realImage = new RealImage(filename);
        realImage.display();
    }
}
