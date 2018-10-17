package pl.waw.sgh;

public class Datatypes {
    public static void main(String[] args) {
        byte b1 = 15;
        byte b2 = 120;
        long i1 = 1352773222;
        long i2 = 874847984;
        int b3 = (b1 + b2);
        long i3 = i1 + i2;

        System.out.println(b3);
        System.out.println("i3" + i3);

        int a = 5;
        int b, bb;
        b = a++;
        bb = ++a;


        System.out.println("b = " + b);
        System.out.println("bb = " + bb);

        double d1 = 2;


        int ii3, ii2;
        ii3 = 4;
        ii2 = 5;

        boolean cond = (ii2 == ii3);

        if (cond) {
            System.out.println("ii3 and ii2 are equal");
        } else {
            System.out.println("ii3, ii2 not equal");
        }

        if ((cond) || (ii2 > 3 && ii3 > 5)) {
            System.out.println("ii2=ii3");
        } else {
            System.out.println("ii2 != ii3");
        }


        int iii = (ii2 > 5 ? 15 : 10);
        if (ii2 > 5) {
            int ii5 = 19;
        } else {
            int ii5 = 10;
        }
    }
}
