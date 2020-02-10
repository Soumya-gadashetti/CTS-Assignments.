
public class MatrixMul{
   public static void main(String args[]){
	int[][] a={{1,3},{4,5}};
	int[][] b={{6,4},{3,8}};
	int c[][]=new int[2][2];
	//int m=a.length;
        //int n=b.length;
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
		System.out.println(a[i][j]);
		}
	}
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.println(b[i][j]);
		}
	}
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			c[i][j]=a[i][j]*b[i][j];
		}
	}
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.println(c[i][j]);
		}
	}
} 
}

