public class FourSides {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public FourSides()
    {
        this(1,2,3,4);
    }

    public FourSides(int a){
        this(a,2,3, 4);
    }

    public FourSides(int a, int b)
    {
        this(a,b,3,4);
    }

    public FourSides(int a, int b, int c)
    {
        this(a, b, c, 4);
    }

    public FourSides(int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA(){
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void displaySides(){
        System.out.println("side a: " + a);
        System.out.println("side b: " + b);
        System.out.println("side c: " + c);
        System.out.println("side d: " + d);

    }
}
