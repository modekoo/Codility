import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,1,3,6};
		
		System.out.println(Solution.solution(A));
		
	}
	
	
	public static class Solution{
		public static int solution(int[] A) {
			
			int count = 1;
			
			if(A.length < 1 || A.length > 100000) {
				return count;
			}
			
			Arrays.sort(A);
			HashSet setA = new HashSet(IntStream.of(A).boxed().collect(Collectors.toList()));
			
			if(setA.size() != A.length)
				return count;
			
			if(!setA.contains(A.length + 1))
				return A.length + 1;
			
			Iterator i = setA.iterator();
			while(i.hasNext()) {
				int valA = (int) i.next();
				System.out.println(valA);
				if(count != valA) {
					break;
				}
				count++;
			}
			
			return count;
		}
		
	}
}
