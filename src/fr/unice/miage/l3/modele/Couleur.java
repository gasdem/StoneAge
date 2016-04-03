package fr.unice.miage.l3.agedepierre.modele.bis;

public enum Couleur {
	BLEU("Couleur Joueur 1"),
	ROUGE("Couleur Joueur 1"),
	VERT("Fond vert carte de civilisation"),
	SABLE("Fond sable de la carte de civilisation");
	
	private String nomCouleur;
	
	Couleur(String nomCouleur){
		this.nomCouleur =nomCouleur; 
	}
	
	public String getNomCouleur(){
		return this.nomCouleur;
	}
	
	public void setNomCouleur(String nomCouleur){
		this.nomCouleur = nomCouleur;
	}
}
