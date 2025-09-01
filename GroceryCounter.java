public class GroceryCounter {
    private int value;
    private int overflowCnt;

    public GroceryCounter() { value = 0; overflowCnt = 0; }

    public void tens() {
        value += 1000;
        if (value >= 10000) { overflowCnt += value / 10000; value %= 10000; }
    }

    public void ones() {
        value += 100;
        if (value >= 10000) { overflowCnt += value / 10000; value %= 10000; }
    }

    public void tenths() {
        value += 10;
        if (value >= 10000) { overflowCnt += value / 10000; value %= 10000; }
    }

    public void hundreths() {
        value += 1;
        if (value >= 10000) { overflowCnt += value / 10000; value %= 10000; }
    }

    public String total() {
        int dollars = value / 100;
        int cents = value % 100;
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }

    public int overflows() { return overflowCnt; }

    public void clear() { value = 0; overflowCnt = 0; }

    public static void main(String[] args) {
        GroceryCounter c = new GroceryCounter();
        System.out.println(c.total());
        c.tens(); c.tens(); c.hundreths();
        System.out.println(c.total());
        System.out.println(c.overflows());
        for (int i = 0; i < 35; i++) c.ones();
        System.out.println(c.total());
        System.out.println(c.overflows());
        for (int i = 0; i < 100; i++) c.ones();
        System.out.println(c.total());
        System.out.println(c.overflows());
        c.clear();
        System.out.println(c.total());
        System.out.println(c.overflows());
    }
}