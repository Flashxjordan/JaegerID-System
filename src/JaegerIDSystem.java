import java.util.Scanner;

public class JaegerIDSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Jaeger Pilot Identification System");
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
				
		System.out.println("Enter your Jaeger Codename: ");	
		String jaeger = scanner.nextLine();
		
		System.out.println("\n Pilot Verified.");
		System.out.println("👤 Name: " + name);
		System.out.println("🛡️ Jaeger Codename: " + jaeger);
        System.out.println("🌐 Drift Protocol Ready. Launch Authorized.");
		
	}

}
