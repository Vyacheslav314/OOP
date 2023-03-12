package HWOOP3;


public class Capibara extends Animal {
    
    private boolean funny;
    private boolean wantToStroke;
    private int coatLength;


    public Capibara(int weight, boolean mammal, String name, boolean funny, boolean wantToStroke, int coatLength) {
        super(weight, mammal, name);
        this.funny = funny;
        this.wantToStroke = wantToStroke;
        this.coatLength = coatLength;
    }

    @Override
    public String toString() {
        return String.format("Вес: %d\nМлеко: %b\nКличка: %s\nfunny: %b\nMaster: %b\nCluv: %d",weight, mammal, name, funny, wantToStroke, coatLength);
    }
}
