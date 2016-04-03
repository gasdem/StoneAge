package fr.unice.miage.l3.modele;

public class PlateauDeJeu {
	public final static int ZONE_1_FRABICANT_D_OUTILS = 1;
	public final static int ZONE_2_CHAMP = 2;
	public final static int ZONE_3_HUTTE = 3;
	public final static int ZONE_4_DE_CHASSE = 4;
	public final static int ZONE_5_FORET = 5;
	public final static int ZONE_6_RIVIERE = 6;
	public final static int ZONE_7_GLASIERE = 7;
	public final static int ZONE_8_CARRIERE = 8;
	public final static int ZONE_9_CARTE_BATIMENTS = 9;
	public final static int ZONE_10_CARTES_DE_CIVILISATIONS = 10;
	
	private static int nombreDePlaceChezLeFrabicantDOutils;
	private static int nombreDePlaceAuChamp;
	private static int nombreDePlaceDansLaHutte;
	private static int nombreDePlaceDansLaForet;
	private static int nombreDePlaceALaRiviere;
	private static int nombreDePlaceAlaGlaisiere;
	private static int nombreDePlaceAlaCarriere;
	private static int nombreDePlaceDesCartesBatiments;
	private static int nombreDePlaceDesCartesDeCivilisations;
	private static int nombreDePlaceALaChasse;
	
	public PlateauDeJeu() {
		this.nombreDePlaceChezLeFrabicantDOutils = 1;
		this.nombreDePlaceAuChamp = 1;
		this.nombreDePlaceDansLaHutte = 2;
		this.nombreDePlaceDansLaForet = 7;
		this.nombreDePlaceALaRiviere = 7;
		this.nombreDePlaceAlaGlaisiere = 7;
		this.nombreDePlaceAlaCarriere = 7;
		this.nombreDePlaceDesCartesBatiments = 2;
		this.nombreDePlaceDesCartesDeCivilisations = 2;
		// Normalement cette valeur est illimitée
		// Par covention nous allons lui affecté la
		// valeur maximale de figurine ouvrier du jeu 
		// qui vaut 20 pour deux joueurs 
		this.nombreDePlaceALaChasse = 20;
	}

	public int getNombreDePlaceChezLeFrabicantDOutils() {
		return nombreDePlaceChezLeFrabicantDOutils;
	}

	public void setNombreDePlaceChezLeFrabicantDOutils(int nombreDePlaceChezLeFrabicantDOutils) {
		this.nombreDePlaceChezLeFrabicantDOutils = nombreDePlaceChezLeFrabicantDOutils;
	}

	public int getNombreDePlaceAuChamp() {
		return nombreDePlaceAuChamp;
	}

	public void setNombreDePlaceAuChamp(int nombreDePlaceAuChamp) {
		this.nombreDePlaceAuChamp = nombreDePlaceAuChamp;
	}

	public int getNombreDePlaceDansLaHutte() {
		return nombreDePlaceDansLaHutte;
	}

	public void setNombreDePlaceDansLaHutte(int nombreDePlaceDansLaHutte) {
		this.nombreDePlaceDansLaHutte = nombreDePlaceDansLaHutte;
	}

	public int getNombreDePlaceDansLaForet() {
		return nombreDePlaceDansLaForet;
	}

	public void setNombreDePlaceDansLaForet(int nombreDePlaceDansLaForet) {
		this.nombreDePlaceDansLaForet = nombreDePlaceDansLaForet;
	}

	public int getNombreDePlaceALaRiviere() {
		return nombreDePlaceALaRiviere;
	}

	public void setNombreDePlaceALaRiviere(int nombreDePlaceALaRiviere) {
		this.nombreDePlaceALaRiviere = nombreDePlaceALaRiviere;
	}

	public int getNombreDePlaceAlaGlaisiere() {
		return nombreDePlaceAlaGlaisiere;
	}

	public void setNombreDePlaceAlaGlaisiere(int nombreDePlaceAlaGlaisiere) {
		this.nombreDePlaceAlaGlaisiere = nombreDePlaceAlaGlaisiere;
	}

	public int getNombreDePlaceAlaCarriere() {
		return nombreDePlaceAlaCarriere;
	}

	public void setNombreDePlaceAlaCarriere(int nombreDePlaceAlaCarriere) {
		this.nombreDePlaceAlaCarriere = nombreDePlaceAlaCarriere;
	}

	public int getNombreDePlaceDesCartesBatiments() {
		return nombreDePlaceDesCartesBatiments;
	}

	public void setNombreDePlaceDesCartesBatiments(int nombreDePlaceDesCartesBatiments) {
		this.nombreDePlaceDesCartesBatiments = nombreDePlaceDesCartesBatiments;
	}

	public int getNombreDePlaceDesCartesDeCivilisations() {
		return nombreDePlaceDesCartesDeCivilisations;
	}

	public void setNombreDePlaceDesCartesDeCivilisations(int nombreDePlaceDesCartesDeCivilisations) {
		this.nombreDePlaceDesCartesDeCivilisations = nombreDePlaceDesCartesDeCivilisations;
	}

	public int getNombreDePlaceALaChasse() {
		return nombreDePlaceALaChasse;
	}

	public void setNombreDePlaceALaChasse(int nombreDePlaceALaChasse) {
		this.nombreDePlaceALaChasse = nombreDePlaceALaChasse;
	}
	
	
	

}
