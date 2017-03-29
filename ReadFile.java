import java.io.*;
class ReadFile{
	private static final String FILENAME = "C://New Text Document.txt";
	public static void main(String[] args){
		File f;
		FileReader fr;
		BufferedReader br;
		boolean exist;
		try{
			f = new File(FILENAME);
			if(f.exists()){
				System.out.println("File Exist");	
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String sContinue;
			while((sContinue=br.readLine()) != null){
				System.out.println(sContinue);
			}
		}else{System.err.println("File not found");}
		}catch(IOException e){
				e.printStackTrace();
			}
		}
	}