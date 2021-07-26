/**
 * @author ngocson
 * @email phamngocson7a1@gmail.com
 * @create date 2021-07-26 13:54:57
 * @modify date 2021-07-26 13:54:57
 * @desc [Phép tính toán cơ bản gồm: cộng trừ nhân chia]
 */
import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("x = ");
        float x = sc.nextFloat();
        System.out.printf("y = ");
        float y = sc.nextFloat();
        float resultSum = addition(x, y);
        System.out.println(+x+" + "+y+" = "+resultSum);

    }
    //phép cộng
    public static float addition(float x, float y){

        return x + y;
    }
    //phép trừ
    public static int subtraction(int x, int y){

        return x - y;
    }
    //phép nhân
    public static float multiplication(float x, float y){

        return x * y;
    }
    //phép chia
    public static float division(float x, float y){

        return x / y;
    }
}
