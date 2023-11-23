import java.util.Scanner;

public class DuplicateCharacterMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        char ch[];
        ch = a.toCharArray();
        boolean alreadyPrinted=false;
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
            	 if (ch[i] == ch[j] && i != j && !alreadyPrinted)  {
                    System.out.println(ch[i]);
                    alreadyPrinted= true;
                   // i = ch.length; 
                   // break;         
                }
            }
        }
    }
}
