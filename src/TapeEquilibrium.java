import java.util.Arrays;
import java.util.stream.IntStream;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,1,2,4,3};
		
		System.out.println(solution(A));
		
	}
	
	public static int solution(int[] A) {
		
		int resultVal = 0;
		
		if(A == null || A.length < 2 || A.length > 1000000)
			return resultVal;
		
		
		for(int i=0; i<A.length; i++) {
			
			if(A[i] > 1000 || A[i] < -1000) {
				break;
			}
			
			if(i == 0)
				continue;
			
			int sum = arraySum(A, i);
			if(sum == 0) {
				resultVal = 0;
				break;
			}
			else if(i == 1) {
				resultVal = sum;
			}
			else if(resultVal > sum) {
				resultVal = sum;
			}
		}
		
		return resultVal;
	}
	
	public static int arraySum(int[] array, int idx) {
		
		int ASum =0;
		int BSum =0;
		
		for(int i=0; i<array.length; i++) {
			if(i < idx) {
				ASum += array[i];
			}
			else {
				BSum += array[i];
			}
		}
		
		return Math.abs(BSum-ASum);
	}

}
