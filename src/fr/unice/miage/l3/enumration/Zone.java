package fr.unice.miage.l3.enumration;

public enum Zone {
	FRABICANT_D_OUTILS (1, "Le frabricant d'outils"),
	CHAMP (2, "Le champ"),
	HUTTE (3, "La hutte"),
	CHASSE (4, "La chasse"),
	FORET (5, "La forêt"),
	RIVIERE (6, "La rivière"),
	GLAISIERE (7, "La glaisière"),
	CARRIERE (8, "La carrière"),
	TUILE_BATIMENT (9, "La tuile bâtiment"),
	CARTE_CIVILISATION (10, "La carte civilisation");
	
	// C'est unpeu repétitif mais nous allons corrigé cette partie
	public final static int NUM_FRABICANT_D_OUTILS = 1;
	public final static int NUM_CHAMP = 2;
	public final static int NUM_HUTTE = 3;
	public final static int NUM_CHASSE = 4;
	public final static int NUM_FORET = 5;
	public final static int NUM_RIVIERE = 6;
	public final static int NUM_GLASIERE = 7;
	public final static int NUM_CARRIERE = 8;
	public final static int NUM_TUILE_BATIMENT = 9;
	public final static int NUM_CARTE_DE_CIVILISATION = 10;
	
	private final int numeroDeLaZone;
	private String nomDeLaZone;
	
	Zone(final int numeroDeLaZone, String nomDeLaZone){
		this.numeroDeLaZone = numeroDeLaZone;
		this.nomDeLaZone = nomDeLaZone;
	}

	public int getNumeroDeLaZone() {
		return numeroDeLaZone;
	}

	public String getNomDeLaZone() {
		return nomDeLaZone;
	}

	public void setNomDeLaZone(String nomDeLaZone) {
		this.nomDeLaZone = nomDeLaZone;
	}
}
