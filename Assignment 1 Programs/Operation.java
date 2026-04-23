import java.util.*;


public class Operation{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
double b = sc.nextDouble();

double sum = a + b;

double div = a/b;

int castResult = (int) sum;

System.out.println("Addition : " + sum);
System.out.println("Division : " + div);
System.out.println("Cast to Result : " + castResult);

}


}