import java.util.*;

public class CheckCharacter{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

char ch = Character.toUpperCase(sc.next().charAt(0));

if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

System.out.println("The given character is Vowel.");

} else{

System.out.println("The given character is Consonant.");
}


}

}