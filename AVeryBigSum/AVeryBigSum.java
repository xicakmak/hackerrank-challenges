import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        //System.out.println("Dizinin eleman sayısını giriniz.");
        int lengthOfArray = input.nextInt();
        
        long[] numbers = new long[lengthOfArray];
        
        //System.out.println("Dizinin elemanlarını giriniz.");
        for(int i=0; i<lengthOfArray; i++){
            numbers[i] = input.nextInt();
        }

        long sum = 0;

        for(int j=0; j<numbers.length; j++){
            sum = sum + numbers[j];
        }
        System.out.print(sum);
    }
}
