import java.util.*;


public class NextPrevChar{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

char ch = sc.next().charAt(0);

char next = (char)(ch + 1);
char prev = (char)(ch - 1);

System.out.println("Character : " + ch);
System.out.println("Mext Character : " + next);
System.out.println("Previous Character : " + prev);

}

}