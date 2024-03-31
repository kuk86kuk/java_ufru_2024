package LABORATORY_WORK_3;

public class Example1 {
    private  static  int step = 0;
    public static void main(String[] args) {
        resursion_1(1);
        resursion_2(1);
        resursion_3(1);
        System.out.println(resursion_4(1));
        System.out.println(resursion_5(1));
    }
    public static void resursion_1(int x) {
        System.out.println("x1=" + x);
        if ((2*x+1) < 20) {
            resursion_1((2*x + 1));
        }
    }
    public static void resursion_2(int x) {
        if ((2*x+1) < 20) {
            resursion_2((2*x + 1));
        }
        System.out.println("x2=" + x);
    }

    public static void resursion_3(int x) {
        space();
        System.out.println("" + x + "->");
        step++;
        if ((2*x+1) < 20) {
            resursion_3((2*x + 1));
        }
        step--;
        space();
        System.out.println("" + x + "<-");
    }
    public static void space() {
        for (int i = 0; i < step; i++){
            System.out.println(" ");
        }
    }
    public static int resursion_4(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        else {
            result = resursion_4(n-1) * n;
            return result;

        }
    }
    public static int resursion_5(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return resursion_5(n-2) + resursion_5(n - 1);
        }
    }
}
