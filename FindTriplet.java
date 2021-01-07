package club;

public class FindTriplet {

	boolean find3Numbers(int A[], int arr_size, int sum) 
    { 
        int l, r;  
        for (int i = 0; i < arr_size - 2; i++) 
         {
            for (int j = i + 1; j < arr_size - 1; j++) {  
                for (int k = j + 1; k < arr_size; k++) { 
                    if (A[i] + A[j] + A[k] == sum) { 
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]); 
                        return true; 
                    } 
                } 
            } 
        } 
        return false; 
    } 
    public static void main(String[] args) 
    { 
        FindTriplet triplet = new FindTriplet(); 
        int A[] = { 1, 5, 32, 9, 15, 2 }; 
        int sum = 29; 
        int arr_size = A.length; 
  
        triplet.find3Numbers(A, arr_size, sum); 
    } 
  }

