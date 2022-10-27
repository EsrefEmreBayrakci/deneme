import java.util.Scanner;

public class ders1{
	
	
	
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	motor motor1 = new motor();
	
	System.out.print("Motor hacmini giriniz : ");
	motor1.setHacim(input.nextDouble());
	motor1.setSilindir(8);
	motor1.setYakit("Benzin");
	
	
	
	
	System.out.println("Motor hacmi : " + motor1.getHacim());
	System.out.println("Silindir Sayısı : " + motor1.getSilindir());
	System.out.println("Yakıt Türü : " + motor1.getYakit());
	
	motor1.start();
	
	
	
	
	
	
	
	
	
	
	
}
}
   


