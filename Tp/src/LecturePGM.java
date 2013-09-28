import java.io.IOException;


public class LecturePGM {

	private char c;
	String nomFichier;
	
	
	public LecturePGM (String nomFichier) {
		this.nomFichier=nomFichier;
	}

	//lire un caractère 
	 public void getChar() {
	 //c = (char) read();
	}
	

	// passer une ligne  
	 public void skipLine() {
		    while ( c != '\n' )
		      getChar();
	 }
	 
	 //passer les lignes commentées
	 public void skipComment(char code) {
		    getChar();
		    while ( c == code ) {
		      skipLine();
		      getChar();
		    }
		  }

 public int getInt() {
	//lire les valeurs 
	 String s = "";
	 
	 // while it is not a space or end of line
	 	while ( (c != '\n') && Character.isSpaceChar(c) ) 
	 		getChar();
		
	 	while ( (c != '\n') && !Character.isSpaceChar(c) ) {
		    s = s + c;
		    getChar();
		    }      
	return Integer.parseInt(s);
		  }

 public byte[] loadData(int size) throws IOException {
	    byte[] data = new byte[size];
	   // read(data, 0, size);
	    return data;
	  }
public static void main(String[] args) {

	System.out.println("helloworld");
	
}
}
