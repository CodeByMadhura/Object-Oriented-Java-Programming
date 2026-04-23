import java.util.*;

public class CheckNumber{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int num = sc.nextInt();

if(num > 0){
   System.out.println("The given number is positive.");
}else if(num < 0){
  System.out.println("The given number is negative.");
}else{
System.out.println("The given number is zero.");
}


}

}