package toplamveort;
import java.util.Scanner;
public class toplamveort {
	    static Scanner input=new Scanner(System.in);
	    public static void main(String[] args) {
	        System.out.println("Dizinin elemanlarini giriniz.");
	        System.out.println("Dizinin kac karakterden olusacagini giriniz");

	        int adet=input.nextInt();
	        double sum=0;
	        double diziOrtalama=0;
	        int b=1;
	        int[] sayiDizisi=new int[adet];
	        for(int i=0;i<adet;i++){
	            int c=b+i;
	            System.out.println("dizinizin "+c+". karakterini giriniz");
	            sayiDizisi[i]=input.nextInt();
	            sum+=sayiDizisi[i];
	        }

	        System.out.println("dizinizin karakterlerinin toplami = "+sum);
	        diziOrtalama=sum/adet;
	        System.out.println("dizinizin ortalamasi ="+diziOrtalama);
	    }
	}


