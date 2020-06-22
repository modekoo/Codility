
public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution(10, 85, 30));
	}
	
	public static class Solution {
		public static int solution(int X, int Y, int D) {

			int count = 0;
			
			if(!validation(X, Y, D))
				return count;
			
			count = (Y - X) % D > 0 ? (Y - X) / D + 1 : (Y - X) / D;
			
//			while(X < Y) {
//				X = X + D;
//				count++;
//			}
			
			return count;
		}
		
		public static boolean validation(int X, int Y, int D) {
			
			int max = (int) Math.pow(10, 9);
			int min = 1;
			
			if(X > Y)
				return false;
			
			if(X < min || Y < min || D < min || X > max || Y > max || D > max) 
				return false;
			
			return true;
		}
	}
	
}


