import java.util.*;
import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int aCount = 0;
        int bCount = 0;

        List<Integer> compare; 

        Scanner input = new Scanner(System.in);
        //System.out.println("Alice'in puanlarını(problem anlaşılırlığı, orjinallik, zorluk) giriniz.");
        int point1 = input.nextInt();
        int point2 = input.nextInt();
        int point3 = input.nextInt();

        //System.out.println("Bob'un puanlarını(problem anlaşılırlığı, orjinallik, zorluk) giriniz.");
        int point4 = input.nextInt();
        int point5 = input.nextInt();
        int point6 = input.nextInt();

        List<Integer> a = Arrays.asList(point1, point2, point3);
        List<Integer> b = Arrays.asList(point4, point5, point6);
         
         for(int i=0; i<a.size(); i++){
             if(a.get(i)>b.get(i)){
                 aCount++;
             }else if(a.get(i)<b.get(i)){
                 bCount++;
             }
         } 
         compare = Arrays.asList(aCount,bCount);
         System.out.print(compare.get(0)+" "+compare.get(1)); 
    }
}
