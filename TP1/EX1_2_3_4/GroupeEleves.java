package EX1_2_3_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class GroupeEleves {
  private  ArrayList<Eleve> eleves = new ArrayList<Eleve>();
  
  public int nombre() {
	  return eleves.size();
  }
  
  public ArrayList<Eleve> getListe(){
	  return this.eleves;
  }
  public void ajouterEleve(Eleve eleve) {
	  this.eleves.add(eleve);
	  
	  
  }
  
  public Eleve chercher(String nom) {
	  Eleve student =null;
       for (Eleve ele : this.eleves)  {
    	   if(ele.getNom()==nom) 
    		   return ele;
    	   student = ele;
       }
       return student;
	  
  }
  
  public void lister() {
	  for (Eleve ele : this.eleves)  {
   	 System.out.println(ele.toString());
      }
  }
  
   public Eleve meilleurEleve() { 
	   return Collections.max(eleves);
   }
   public void trierEleves() { 
	   Collections.sort(eleves);

   }
}
