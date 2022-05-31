
public class MatrixName {
	public static void main (String[] args) {
		
		int a = 0,b = 0,c= 0,d = 0;
		int e = 1,f = 1,g = 1,h = 1;		
		
		for (int i=0; i<=99999999; i++) {
			System.out.println(c+""+g+""+d+""+h+" Maik "+a+""+e+""+b+""+f);
			
			if (c == 1) {				
				a = 0; b = 0; c= 0; d = 0;
				e = 1; f = 1; g = 1; h = 1;
			} else {
				c = 1; g = 0; d = 1; h = 0;
				a = 1; e = 0; b = 1; f = 0;
			}			
		}		
	}
}
