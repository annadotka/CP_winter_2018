package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!!!");
        System.out.println("Hello");
        if (args.length > 0){
            System.out.println("ARG" + args[0]);
        }

        double height = 4.3;
        double width =  5.1;
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.getHigh());

    }



}
