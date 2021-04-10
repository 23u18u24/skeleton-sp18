public class OffByN implements CharacterComparator {
    private int n = 0;

    public OffByN(int N) {
        this.n = N;
    }

    @Override
    public boolean equalChars(char x, char y) {
        int a = Math.abs(x - y);
        return a == n;
    }
}