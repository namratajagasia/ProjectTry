// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Codility1 {
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	if(A.length==1)
    		return 1;
    	if(A.length==2)
    		return 2;
        int maxDistanceBetweenIndices=-1;
        int i;
        
        for(int startIndex=0;startIndex<A.length;startIndex++){
        	 HashSet<Integer> hs = new HashSet<Integer>();
	        for(i=startIndex;i<A.length;i++){
	           
	            
	            
	            	if(!hs.contains(A[i])){
	            		if(hs.size()<2)
	            			hs.add(A[i]);
	            		else 
	            			break;
	            	}
	            
	            
	        }
	            
	            int temp = i-startIndex;
	            if(temp>maxDistanceBetweenIndices)
	            	maxDistanceBetweenIndices= temp;
	            
	            
	        }
        return maxDistanceBetweenIndices;
	         
            
        
    }
    public static void main(String args[]){
    	int A[]={5,4,4,5,0,12};
    	System.out.println(solution(A));
    }
}