import java.util.Scanner;

class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter coefficients a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double d = b*b - 4*a*c;
        
        if(d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Roots: " + r1 + " and " + r2);
        } else if(d == 0) {
            double r = -b / (2.0*a);
            System.out.println("Root: " + r);
        } else {
            System.out.println("Roots are imaginary.");

            System.out.println("Aryaveer Sharma 24csu306");
        }
    }
}
