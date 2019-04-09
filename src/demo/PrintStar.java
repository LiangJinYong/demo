package demo;

public class PrintStar {
	public static void main(String[] args) {
		System.out.println("asdf" + 1.20);
		int num = 5;
		for(int i=0; i<num; i++) {
			
			for(int j=0; j<Math.abs(num/2-i); j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<2*(i>num/2 ? num-1-i : i)+1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

4  0
3  1
2  2
1  3
0  4
1  5
2  6
3  7
4  8

1  0  0 
3  1  1
5  2  2
7  3  3
9  4  4
7  5  3
5  6  2
3  7  1
1  8  0

*/
