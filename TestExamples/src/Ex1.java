
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] argument =new String[2][2];
		int x;
		argument[0]=args;
		x=argument[0].length;
		for(int y=0;y<x;y++)
			System.out.println(" " +argument[0][y]);
	}

}
