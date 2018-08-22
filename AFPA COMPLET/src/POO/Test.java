package POO;



class Test {

	public static void main(String[] args) {
		// mot clé FINAL: 
		// une classe définie par le mot clé final ne peut pas avoir de sous classe
		// une méthode de classe définie par le mot clé final ne peut être redéfinie dans une sous classe (polymorphisme)
		// un attribut défini en final ne peut pas voir sa valeur changer
		// on a crée une classe ville maintenant il faut instancer l'objet
		

			
		Ville_moi v = new Ville_moi();
		Ville_moi v1 = new Ville_moi("Lille", 232741, "France");       
		Ville_moi v2 = new Ville_moi("Tokyo", 13622267, "Japan");
		Ville_moi v3 = new Ville_moi("Köln",1046680,"Deutchland");
		Ville_moi v4 = new Ville_moi("Helsinki",642045, "Finland");
		Ville_moi v5 = new Ville_moi("Revelles", 534, "France");
		Ville_moi v6 = new Ville_moi ("Wambrechie",9875, "France");
		
		
		System.out.println("\n v = "+v.getNomVille()+" ville de  "+v.getNbreHabitants()+ " habitants se situant en/au "+v.getNomPays());
		System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en/au "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant in "+v2.getNomPays()+"\n\n");
		System.out.println(" v3 = "+v3.getNomVille()+" ville de  "+v3.getNbreHabitants()+ " habitants se situant en/au "+v3.getNomPays());
		System.out.println(" v4 = "+v4.getNomVille()+" ville de  "+v4.getNbreHabitants()+ " habitants se situant in "+v4.getNomPays()+"\n\n");  
		System.out.println(" v5 = "+v5.getNomVille()+" ville de  "+v5.getNbreHabitants()+ " habitants se situant en/au "+v5.getNomPays());
		System.out.println(" v4 = "+v6.getNomVille()+" ville de  "+v6.getNbreHabitants()+ " habitants se situant in "+v6.getNomPays()+"\n\n");
		/*
		  Nous allons interchanger les Villes v1 et v2
		  tout ça par l'intermédiaire d'un autre objet Ville.        
		       
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		       
		System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en/au "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en/au "+v2.getNomPays()+"\n\n");

	     
		  Nous allons maintenant interchanger leurs noms
		  cette fois par le biais de leurs mutateurs.
	   
		v1.setNomVille("Hong Kong");
		v2.setNomVille("Stockholm");
		      
		System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en/au "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en/au "+v2.getNomPays()+"\n\n");
		*/

		// capitale
		
		Capitale Tokyo= new Capitale ("Tokyo", 13622267,"Japon", "sanctuaire shinto Meji" );
		System.out.println("Pays : "+Tokyo.getNomPays()+" Monument "+Tokyo.getMonument());
		System.out.println(v2.decrisToi());
		System.out.println(Tokyo.decrisToi());
		
		v1.finalize();
		
		System.out.println(v4.decrisToi());
		
	}

}
