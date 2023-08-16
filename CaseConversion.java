import java.util.Scanner;

public class CaseConversion{
    public static void convertCase(String s){
        System.out.println("Converted String: ");
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i)))
                System.out.print(Character.toString(s.charAt(i)).toUpperCase());
            else
                System.out.print(Character.toString(s.charAt(i)).toLowerCase());
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a para : ");
        String s=sc.nextLine();
        convertCase(s);
    }
}