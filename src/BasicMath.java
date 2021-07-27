/**
 * @author ngocson
 * @email phamngocson7a1@gmail.com
 * @create date 2021-07-26 13:54:57
 * @modify date 2021-07-26 13:54:57
 * @desc [Phép tính toán cơ bản gồm: cộng trừ nhân chia]
 */
import java.util.Scanner;

public class BasicMath {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runMenu();
    }

    public static void runMenu(){
        boolean dieuKien = true;
       
        do {
            int num; 
            
            menu();
            num = sc.nextInt();
            
            switch (num) {
                case 1:
                System.out.println(addition());
                    break;
                case 2:
                System.out.println(subtraction());
                    break;
                case 3:
                System.out.println(multiplication());
                    break;
                case 4:
                System.out.println(division());
                    break;
                case 5:
                System.out.println("Ct đã dừng");
                dieuKien = false;
                break;

                default:
                System.out.println("Ko có chức năng bạn chọn, hãy chọn lại");
                dieuKien = true;   
                break;
            }
            
        }while (dieuKien);
           
        
    }
    public static void menu(){
        System.out.println("Tính toán 2 số ");
        System.out.println("1. Cộng ");
        System.out.println("2. Trừ ");
        System.out.println("3. Nhân ");
        System.out.println("4. Chia ");
        System.out.println("5. Dừng chương trình");
        System.out.printf("Mời bạn chọn chức năng: ");

    }
    //phép cộng
    public static float addition(){
        float x,y;
        System.out.printf("x = ");
        x = sc.nextFloat();
        System.out.printf("y = ");
        y = sc.nextFloat();
        System.out.println(+x+" + "+y+" = " );     
         return  x + y;
    }
    //phép trừ
    public static float subtraction(){
        float x,y;
        System.out.printf("x = ");
        x = sc.nextFloat();
        System.out.printf("y = ");
        y = sc.nextFloat();
        System.out.println(+x+" + "+y+" = " );   
        return x - y;
    }
    //phép nhân
    public static float multiplication(){
        float x,y;
        System.out.printf("x = ");
        x = sc.nextFloat();
        System.out.printf("y = ");
        y = sc.nextFloat();
        System.out.println(+x+" + "+y+" = " );   
        return x * y;
    }
    //phép chia
    public static float division(){
        float x,y;
        System.out.printf("x = ");
        x = sc.nextFloat();
        System.out.printf("y = ");
        y = sc.nextFloat();
        System.out.println(+x+" + "+y+" = " );   
        return x / y;
    }
}
