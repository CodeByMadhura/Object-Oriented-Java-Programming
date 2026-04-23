import java.util.*;

public class FibonacciSeries{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of terms : ");
int n = sc.nextInt();

int a = 0, b = 1;
int next;

System.out.print(a + " " + b + " ");

for(int i = 2; i < n; i++ ){
next = a + b;
a = b;
b = next;

System.out.print(next + " ");

}

}


}