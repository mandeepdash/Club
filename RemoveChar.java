package club;

public class RemoveChar {
 
	    static final int NO_OF_CHARS = 256; 
	    static int[] getCharCountArray(String str) 
	    { 
	       int count[] = new int[NO_OF_CHARS]; 
	       for (int i = 0; i<str.length();  i++) 
	          count[str.charAt(i)]++; 
	         
	       return count; 
	    } 
	     
	    static String removechar(String str, String str2) 
	    { 
	      int count[]  = getCharCountArray(str2); 
	      int ip_ind  = 0, res_ind = 0; 
	      char arr[] = str.toCharArray(); 
	        
	      while (ip_ind != arr.length) 
	      { 
	        char temp = arr[ip_ind]; 
	        if(count[temp] == 0) 
	        { 
	            arr[res_ind] = arr[ip_ind]; 
	            res_ind ++; 
	        } 
	            ip_ind++; 
	          
	      }     
	  
	      str = new String(arr); 
	      return str.substring(0, res_ind); 
	        
	    } 
	    public static void main(String[] args) 
	    { 
	        String str = "I am from Iter"; 
	        String str2 = "for"; 
	        System.out.println(removechar(str, str2)); 
	    } 
	} 	


