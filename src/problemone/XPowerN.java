package problemone;
public class XPowerN {
    //Homework 3 - problem one
    public static double powerExp(double x, int n)
    {
        if (n==1) return x;
        else return x * powerExp(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(powerExp(2, 12));

    }
}
