import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("x = ");
        float x = sc.nextFloat();
        System.out.printf("y = ");
        float y = sc.nextFloat();
        float resultSum = sum(x, y);
        System.out.println(+x+" + "+y+" = "+resultSum);

    }

    public static float sum(float x, float y){

        return x + y;
    }
}
