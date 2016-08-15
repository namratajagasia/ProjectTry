
public class Solution2 {
	 public static int solution(int n) {
	        // write your code in Java SE 8
		 int[] d = new int[30];
	        int l = 0;
	        int p;
	        while (n > 0) {
	            d[l] = n % 2;
	            n /= 2;
	            l++;
	        }
	        for (p = 1; p <=(l+1)/2; ++p) {
	            int i;
	            boolean ok = true;
	            for (i = 0; i < l - p; ++i) {
	                if (d[i] != d[i + p]) {
	                    ok = false;
	                    break;
	                }
	            }
	            if (ok) {
	                return p;
	            }
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int A[]={};
		System.out.println(A.length);*/
		int n=955;
		System.out.println(solution(n));
		

	}

}
