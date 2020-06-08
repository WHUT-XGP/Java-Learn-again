public class Learn {
    private int dps(int q, int p) {
        if (p == 0) {
            return q;
        }
        int r = q % p;
        return dps(p, r);
    }

    public static void main(String[] args) {
        int count = 1;
        Learn t1 = new Learn();
        count = t1.dps(5,10);
        System.out.println(count);
        System.out.println("Hello Java");
    }

}
