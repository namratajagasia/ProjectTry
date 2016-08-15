
public class Solution {
	 public static boolean solution(int[] A) {
	        // write your code in Java SE 8
		 boolean result=true;
		 
		 for(int i=A.length-1;i>0;i--){
			 
			 if(A[i]<A[i-1])
			 {
				 int outOfPlace = i-1;
				 int k = A.length-1;
				 while(k>=0 && A[k]>A[outOfPlace])
					 k--;
				 
				 int temp = A[k];
				 A[k]= A[outOfPlace];
				 A[outOfPlace]= temp;
				 result= true;
				 break;
				 
			 }
			 
		 }
		 for(int i=1;i<A.length;i++)
			 if(A[i]<A[i-1])
			 {
				 result= false;
				 break;
			 }
		 
		 
		 return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={};
		System.out.println(A.length);
		System.out.println(solution(A));
		

	}

}
