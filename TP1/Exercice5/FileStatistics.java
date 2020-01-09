package Exercice5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FileStatistics {
	private String filename ;
	
	FileStatistics(String filename){
		this.filename=filename;
	}
	
   
	public int getCharCount() {
		 File file = new File( this.filename); 
		 FileInputStream fileStream = null ;
		  int nbrCaractere = 0; 
          String ligne; 
		 
		 try {
			 fileStream  =new FileInputStream(file); 
			 InputStreamReader input = new InputStreamReader(fileStream); 
             BufferedReader reader = new BufferedReader(input); 
        
          try {
			while((ligne = reader.readLine()) != null) 
			  { 
			 if(!(ligne.equals(""))) 
			 { 
			       
				 nbrCaractere += ligne.length(); 
			 }
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			
		} 
   
         
		return nbrCaractere;
	}

  
	
	 public int getWordCount() {
		 File file = new File( this.filename); 
		 FileInputStream fileStream = null ;
		  int mot = 0; 
          String ligne; 
		 
		 try {
			 fileStream  =new FileInputStream(file); 
			 InputStreamReader input = new InputStreamReader(fileStream); 
             BufferedReader reader = new BufferedReader(input); 
        
          try {
			while((ligne = reader.readLine()) != null) 
			  { 
			 if(!(ligne.equals(""))) 
			 { 
				  String[] wordList = ligne.split("\\s+"); 
	              
		            mot += wordList.length; 
			 }
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			
		} 
   
         
		return mot;
	 }
	 
	 
	 
	 public int getSentanceCount() {
		 File file = new File( this.filename); 
		 FileInputStream fileStream = null ;
		  int espace = 0 , phrase = 0; 
          String ligne; 
		 
		 try {
			 fileStream  =new FileInputStream(file); 
			 InputStreamReader input = new InputStreamReader(fileStream); 
             BufferedReader reader = new BufferedReader(input); 
        
          try {
			while((ligne = reader.readLine()) != null) 
			  { 
			 if(!(ligne.equals(""))) 
			 { 
				  int mot = getWordCount();
		    
		            String[] listePhrases = ligne.split("[!?.:]+"); 
		            espace += listePhrases.length; 
			 }
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			
		} 
   
         
		return espace;
	 }
	 
	 
	 
	 
	 public int  getParagrapheCount(){
		 File file = new File( this.filename); 
		 FileInputStream fileStream = null ;
		  int paragraphe = 0 ;
          String ligne; 
		 
		 try {
			 fileStream  =new FileInputStream(file); 
			 InputStreamReader input = new InputStreamReader(fileStream); 
             BufferedReader reader = new BufferedReader(input); 
        
          try {
			while((ligne = reader.readLine()) != null) 
			  { 
				 if(ligne.equals("")) 
			        { 
					 paragraphe++; 
			        } 
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			
		} 
   
         
		return paragraphe;
	 }

	public void saveCounts(String filename){
		File file = new File(filename);
	    FileWriter fw;
	    FileReader fr;
			
	    try { 
	    	
	      fw = new FileWriter(file);
	      String str = "nbr de caracteres __ :" +getCharCount() +" \n nbr de mots __ : " + getWordCount()+" \n nbr de phrases __ :" +getSentanceCount()+" \n nbr de paragraphes __ :" +getParagrapheCount() ;
	    
	      fw.write(str);
	      fw.close();
				
	      fr = new FileReader(file);
	      str = "";
	      int i = 0;
	      
	      while((i = fr.read()) != -1)
	        str += (char)i;

	      //Affichage
	      System.out.println(str);

	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }

	}
	
	
	public void getDictionary(){

	    HashMap<String, Integer>  list ;
		File file = new File(this.filename);
	   
	
		 FileInputStream fileStream = null ;
		  int nbrCaractere = 0; 
         String ligne; 
		 
		 try {
			 list = new HashMap<String, Integer>();
			 fileStream  =new FileInputStream(file); 
			 InputStreamReader input = new InputStreamReader(fileStream); 
            BufferedReader reader = new BufferedReader(input); 
       
         try {
        	 int i = 0;
			while((ligne = reader.readLine()) != null) 
			{
				
			 if(!(ligne.equals(""))) 
			 {   
			       list.put(ligne, i);
					 System.out.println(i);
				i++;
				
			 }
			  }
			 System.out.println(list.size());
			 System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			
		} 
	
	
	
	
	
	
	
	}
	
	
	
}