import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 10;
        int a = 0;
        while(a==0){
            double m = (n+(x/n))/2;
            if(Math.abs(n-m)<0.000001){
                break;
            }
            n=m;
        }
        
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int r = x;
        for(int i = x-1; i > 0; i--){
            r = i*r;
        }
        if(x == 0){
            r = 1;
        }
        return r;
    }
     

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        int x = 0;
		
		double s = 0;
        while(Math.abs(Math.E - s) > 0.00000001) {
        int r = x;
		for(int i = x-1; i > 0; i--){
            r = r*i;
        }
        if(x == 0){
            r = 1;
        }
        x++;
        s = s + 1.0/r;
        }        
        return s;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plase enter a number");
        int x = scan.nextInt();
        System.out.println("The squart root of the number is "+babylonian(x));
        System.out.println("The value of e is roughly"+calculateE());        

        scan.close();
    }
}
