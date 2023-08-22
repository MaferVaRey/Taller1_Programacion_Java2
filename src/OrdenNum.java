import java.util.Scanner;
public class OrdenNum {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int aux1;

        System.out.println("Ingrese el valor del primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el valor del segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el valor del tercer número: ");
        int num3 = sc.nextInt();
        System.out.println("Ingrese el valor del cuarto número: ");
        int num4 = sc.nextInt();

        if (num1 > num2){
            aux1 = num2;
            num2 = num1;
            num1 = aux1;
        }
        if (num1 > num3){
            aux1 = num3;
            num3 = num1;
            num1 = aux1;
        }
        if (num1 > num4){
            aux1 = num4;
            num4 = num1;
            num1 = aux1;
        }
        if (num2 > num3){
            aux1 = num3;
            num3 = num2;
            num2 = aux1;
        }
        if (num2 > num4){
            aux1 = num4;
            num4 = num2;
            num2 = aux1;
        }
        if (num3 > num4){
            aux1 = num4;
            num4 = num3;
            num3 = aux1;
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}