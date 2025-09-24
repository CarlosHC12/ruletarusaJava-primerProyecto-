import java.util.Scanner;
import java.util.Random;
public class calculo {
    public static void main(String[] args) throws Exception {
 int n1;
 int n2;
 int operacion;
 
 while(true){
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba en primer numero para la operacion");
    n1 = sc.nextInt();
    System.out.println("Escriba en Segundo numero para la operacion");
    n2 = sc.nextInt();
    System.out.println("¿que operacion deseas realizar?");
    operacion = sc.nextInt();
    sc.close();//Debemos cerrar siempre el "lector"
    if(operacion == 1){
        sumar(n1,n2);
    }
 }


    }
    
    
    public static void sumar(int num1, int num2){
        int resultado = num1+num2;
        System.out.println("EL RESULTADO ES:" + resultado);
        
    }
}