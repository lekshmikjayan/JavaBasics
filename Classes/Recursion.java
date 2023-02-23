
public class Recursion {
	
		static int sum(int x, int y) {
			if (y<x) {
				return 0;
			}
			else {
			return y + sum(x,y-1);
	}
			
			
		}
}

//3,7
//x + (x-1)

//3, (3, 3+1)
//4, 4+1     x, ()
//5, 5+1,
//6, 6+1
//
//
//7 + sum(3,6)
//6 + sum (3,5)
//5+ sum(3,4)
//4+ sum(3,3)
//3 + sum(3,2)