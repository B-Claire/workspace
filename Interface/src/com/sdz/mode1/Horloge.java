package com.sdz.mode1;

import java.util.Calendar;

public class Horloge {

		  //Objet calendrier pour r�cup�rer l'heure courante
		  private Calendar cal;
		  private String hour = "";
			
		  public void run() {
		    while(true){
		    //On r�cup�re l'instance d'un calendrier � chaque tour 
		    //Elle va nous permettre de r�cup�rer l'heure actuelle
		    this.cal = Calendar.getInstance();
		    this.hour =  //Les heures
		      this.cal.get(Calendar.HOUR_OF_DAY) + " : " 
		      + 
		      (    //Les minutes
		        this.cal.get(Calendar.MINUTE) < 10
		        ? "0" + this.cal.get(Calendar.MINUTE)
		        : this.cal.get(Calendar.MINUTE)
		      )
		      + " : " 
		      +
		      (    //Les secondes
		        (this.cal.get(Calendar.SECOND)< 10) 
		        ? "0"+this.cal.get(Calendar.SECOND) 
		        : this.cal.get(Calendar.SECOND)
		      );
		      try {
		        Thread.sleep(1000);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		    }
		  }
		
}
