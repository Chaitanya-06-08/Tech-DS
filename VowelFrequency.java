import java.util.Scanner;

public class VowelFrequency {
    public static void vowelFreq(String s){
        int vowels=0;
        String lower=s.toLowerCase();
        for(int i=0;i<lower.length();i++){
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
