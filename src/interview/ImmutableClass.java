package interview;

public final class ImmutableClass {
    private final int numberEggs;
    public ImmutableClass(int numberEggs) {
    this.numberEggs = numberEggs;
    }
    public int getNumberEggs() {
    return numberEggs;
    
}
}