import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3, 8, 9, 7, 6};
		int K= 3;
		
		A = rightShift(A, K);
		IntStream.of(A).forEach(i -> System.out.println(i));
	}
	
	static int[] rightShift(int[] A, int K) {
		
		//제약조건 + 배열의 크기가 K와 같을 경우
		if(A.length < 1 || A.length > 100 || K < 1 || K > 100 || A.length == K) {
			return A;
		}
		
		if(IntStream.of(A).anyMatch(i -> i > 1000 || i < -1000)) {
			return A;
		}
		
		//배열에 전부 같은 값이 있을 경우
		if(IntStream.of(A).distinct().count() == 1) {
			return A;
		}
		
		for(int i =0; i<K; i++) {
			int last = A[A.length-1];
			List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
			list.remove(A.length-1);
			list.add(0, last);
			A = list.stream().mapToInt(j -> j).toArray();
		}
		return A;
		
	}

}
