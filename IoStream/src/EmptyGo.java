import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

public class EmptyGo {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader bf=null;   
	//	FileWriter fw=null;
		try {
			fr=new FileReader("Word.text");
			bf=new BufferedReader(fr);
			while(true) {
			String line=bf.readLine();
				if(!line.isEmpty()) {
				System.out.println(line);
			
				//fw.write(line);
				}	
			}
		}catch(IOException exec) {
		System.out.println(exec);
	}finally {
		try {
			fr.close();
			bf.close();
		//	fw.close();
		}catch(IOException exec) {
			System.out.println(exec);
		}
	}
	}
}
