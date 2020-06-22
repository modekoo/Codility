import java.util.stream.IntStream;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9,3,9,3,9,7,9};
		int returnVal = -1;
		
		if(A.length < 1 || A.length > 1000000){
            System.out.println(returnVal);
            return;
        }
        
        if(IntStream.of(A).anyMatch(i -> i > 1000000000 || i < 1)) {
        	System.out.println(returnVal);
            return;
		}
		
		while(A.length > 0) {
			int first = A[0];
			if(checkVal(A, first) % 2 != 0) {
				returnVal = first;
				System.out.println(returnVal);
				break;
			}
			else {
				A = IntStream.of(A).parallel().filter(i -> i != first).toArray();
			}
		}
	}
	
	public static int checkVal(int[]A, int K) {
		int count = 0;
		for(int i=0; i<A.length; i++) {
			if(A[i] == K) {
				count++;
			}
		}
		return count;
	}
}
