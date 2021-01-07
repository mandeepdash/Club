package club;
import java.util.Scanner;
public class PatternCon {
	
	    void display(int n) 
	    { 
	        // sp stands for space 
	        // st stands for number 
	        int sp = n / 2, num = 1; 
	  
	        // Outer for loop for number of lines 
	        for (int i = 1; i <= n; i++) { 
	  
	            // Inner for loop for printing space 
	            for (int j = 1; j <= sp; j++) 
	                System.out.print(" "); 
	  
	            // Inner for loop for printing number 
	            int count = num / 2 + 1; 
	            for (int k = 1; k <= num; k++) { 
	                System.out.print(count); 
	                if (k <= num / 2) 
	                    count--; 
	                else
	                    count++; 
	            } 
	  
	            // To goto next line 
	            System.out.println(); 
	            if (i <= n / 2) { 
	  
	                // sp decreased by 1 
	                // st increased by 2 
	                sp = sp - 1; 
	                num = num + 2; 
	            } 
	  
	            else { 
	  
	                // sp increased by 1 
	                // st decreased by 2 
	                sp = sp + 1; 
	                num = num - 2; 
	            } 
	        } 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        PatternCon p = new PatternCon(); 
	        int n = 9; 
	        p.display(n); 
	    } 
	} 
