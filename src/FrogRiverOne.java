import java.io.File;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file = new File("C:\\tools\\test1\\10\\101");
//		if(!file.exists()) {
//			System.out.println(file.mkdirs());
//		}
		
		int[] A = {1,2,3,4,10,5,6,10};
		int X = 10;
		
		System.out.println(solution(X, A));
		
	}
	
	public static int solution(int X, int[] A) {
        // write your code in Java SE 8
		int idx = -1;
		
		if(A.length < 1 || A.length < X+1 || X < 1 || X > 100000)
            return idx;
        
        for(int i = 1; i<= X+1; i++){
            if(A[i] == X)
                return i;
        }
        
        return idx;
        
    }

}
