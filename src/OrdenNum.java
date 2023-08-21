import java.util.Scanner;
public class OrdenNum {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int primer = 0, segundo = 0, tercero = 0, cuarto = 0;

        System.out.println("Ingrese el valor del primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el valor del segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el valor del tercer número: ");
        int num3 = sc.nextInt();
        System.out.println("Ingrese el valor del cuarto número: ");
        int num4 = sc.nextInt();

        // Evaluación del primer valor

        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            primer = num1;
        }
        else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            primer = num2;
        }
        else if (num3 <= num2 && num3 <= num1 && num3 <= num4) {
            primer = num3;
        }
        else {
            primer = num4;
        }

        if (num1 == primer) {
            if (num2 <= num3 && num2 <= num4) {
                segundo = num2;
            } else if (num3 <= num2 && num3 <= num4) {
                segundo = num3;
            } else {
                segundo = num4;
            }
        }

        if (num2 == primer) {
            if (num1 <= num3 && num1 <= num4) {
                segundo = num1;
            } else if (num3 <= num1 && num3 <= num4) {
                segundo = num3;
            } else {
                segundo = num4;
            }
        }
        if (num3 == primer) {
            if (num1 <= num2 && num1 <= num4) {
                    segundo = num1;
            } else if (num2 <= num1 && num2 <= num4) {
                    segundo = num2;
            } else {
                segundo = num4;
            }
        }
        if (num4 == primer) {
            if (num1 <= num3 && num1 <= num2) {
                segundo = num1;
            }
            else if (num3 <= num1 && num3 <= num2) {
                segundo = num3;
            }
            else {
                segundo = num2;
            }
        }

        if (num1 == primer && num2 == segundo || num1 == segundo && num2 == primer){
            if (num3 <= num4){
                tercero = num3;
            }
            else if (num4 <= num3){
                tercero = num4;
            }
        }
        if (num1 == primer && num3 == segundo || num1 == segundo && num3 == primer) {
            if (num2 <= num4) {
                tercero = num2;
            } else if (num4 <= num2) {
                tercero = num4;
            }
        }
        if (num1 == primer && num4 == segundo || num1 == segundo && num4 == primer) {
            if (num2 <= num3) {
                tercero = num2;
            } else if (num3 <= num2) {
                tercero = num3;
            }
        }
            if (num2 == primer && num3 == segundo || num2 == segundo && num3 == primer) {
                if (num1 <= num4) {
                tercero = num1;
            }
                else if (num4 <= num1) {
                tercero = num4;
            }
        }
        if (num2 == primer && num4 == segundo || num2 == segundo && num4 == primer) {
            if (num1 <= num3) {
                tercero = num1;
            } else if (num3 <= num1) {
                tercero = num3;
            }
        }
        if (num3 == primer && num4 == segundo || num3 == segundo && num4 == primer) {
            if (num2 <= num1) {
                tercero = num2;
            } else if (num1 <= num2) {
                tercero = num1;
            }
        }

        if (num1 == primer){
            if (num2 == segundo && num3 == tercero || num2 == tercero && num3 == segundo) {
                cuarto = num4;
            }
            else if (num2 == segundo && num4 == tercero || num2 == tercero && num4 == segundo){
                cuarto = num3;
            }
            else{
                cuarto = num2;
            }
        }
        if (num2 == primer){
            if (num1 == segundo && num3 == tercero || num1 == tercero && num3 == segundo){
                cuarto = num4;
            }
            else if (num1 == segundo && num4 == tercero || num1 == tercero && num4 == segundo){
                cuarto = num3;
            }
            else{
                cuarto = num1;
            }
        }
        if (num3 == primer){
            if (num2 == segundo && num1 == tercero || num2 == tercero && num1 == segundo){
                cuarto = num4;
            }
            else if (num2 == segundo && num4 == tercero || num2 == tercero && num4 == segundo){
                cuarto = num1;
            }
            else{
                cuarto = num2;
            }
        }
        if (num4 == primer){
            if (num2 == segundo && num3 == tercero || num2 == tercero && num3 == segundo){
                cuarto = num1;
            }
            else if (num2 == segundo && num1 == tercero || num2 == tercero && num1 == segundo){
                cuarto = num3;
            }
            else{
                cuarto = num2;
            }
        }

        System.out.println(primer);
        System.out.println(segundo);
        System.out.println(tercero);
        System.out.println(cuarto);
    }
}