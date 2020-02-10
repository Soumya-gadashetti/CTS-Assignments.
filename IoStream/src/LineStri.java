import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineStri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader bf=null;
		FileWriter fw=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some word");
		String word=null;
		word=sc.nextLine();
		try {
			fr=new FileReader("Word.text");
			bf=new BufferedReader(fr);
			fw=new FileWriter("Ans.text");
			while(true) {
				String line=bf.readLine();
				if(line==null)
					break;
				String[] names=line.split(" ");
				for(String name:names) {
					if(word.equals(name)) {
					fw.write(line+"\n");
						System.out.println(line);
					}
			}
			}
		}catch(IOException exec) {
			System.out.println(exec);
		}
	
	finally {
		try {
			fr.close();
			bf.close();
			fw.close();
			sc.close();
		}catch(IOException exec) {
			System.out.println(exec);
		}
	}

}
}
