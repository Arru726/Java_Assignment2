import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = true;
        
        if(n <= 1) prime = false;
        else {
            for(int i=2; i<=n/2; i++) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        
        if(prime) System.out.println(n + " is prime.");
        else System.out.println(n + " is not prime.");

        System.out.println("Aryaveer Sharma 24csu306");
    }
}
