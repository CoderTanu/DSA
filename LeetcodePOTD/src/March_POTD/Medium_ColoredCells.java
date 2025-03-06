package March_POTD;


/**
 * 2579. Count Total Number of Colored Cells
 */
public class Medium_ColoredCells {
	
	 public static long coloredCells(int n) {
         return 1 + (long) n * (n-1)  * 2;
    }

	public static void main(String[] args) {
		int n = 3;
		long v = coloredCells(n);
		System.out.println(v);
	}

}
