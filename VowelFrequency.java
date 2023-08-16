import java.util.Scanner;

public class VowelFrequency {
    public static void vowelFreq(String s){
        int vowels=0;
        for(int i=0;i<s.length();i++){
            String lower=s.toLowerCase();
            char letter=lower.charAt(i);
            if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
                vowels++;
        }
        System.out.println("Frequency of vowels in given para: "+vowels);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a paragraph: ");
        String s= sc.nextLine();
        vowelFreq(s);
    }
}
