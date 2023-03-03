import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Area{
    @Override
    public void area(float radius) {
        System.out.println("area of circle");
    }

    @Override
    public void area(float num1, float num2) {
        System.out.println("area of rectangle");
    }

    public enum Shape {
        RADIUS , SIDE ;
    }
    public static void main(String[] args) {
        Area area_a = new area_a()
        {
            @Override
            public void area(float num1, float num2) {
                float area_rec=num1*num2;
            }
            @Override
            public void area(float radius) {
                final float pi = (int) 3.14;
                float area_cir=radius*radius*pi;
            }
        };

        //final float pi = (int) 3.14;
        Shape shape=Shape.RADIUS;
        Scanner in=new Scanner(System.in);
        switch (shape)
        {
            case RADIUS:
                System.out.println("enter the numbers that you want" );
                int num=in.nextInt();
                ArrayList<Integer>list= new ArrayList<>(num);
                for (int i=0 ; i<list.size() ; i++)
                {
                    area_a.area(i);
                    System.out.println(area_a);
                }
                break;
            case SIDE:
                System.out.println("enter the first number");
                int num_1=in.nextInt();
                System.out.println("enter the second number");
                int num_2=in.nextInt();
                area_a.area(num_1,num_2);
                System.out.println(area_a);
                break;
        }
    }
}
//Polymorphism
//Compilation
//At Compile Time
//Encapsulation
//True