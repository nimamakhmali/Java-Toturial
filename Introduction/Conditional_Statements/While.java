package Conditional_Statements;

public class While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; 

        while (i < 100) {
            sum += i;  
            i += 2;    
        }

        System.out.println("Sum of numbers less than 100 is : " + sum);
    }
}
