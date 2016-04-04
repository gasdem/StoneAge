package fr.unice.miage.l3.modele;

public class PlateauDeJeu {
	public final static int ZONE_1_FRABICANT_D_OUTILS = 1;
	public final static int ZONE_2_CHAMP = 2;
	public final static int ZONE_3_HUTTE = 3;
	public final static int ZONE_4_CHASSE = 4;
	public final static int ZONE_5_FORET = 5;
	public final static int ZONE_6_RIVIERE = 6;
	public final static int ZONE_7_GLASIERE = 7;
	public final static int ZONE_8_CARRIERE = 8;
	public final static int ZONE_9_TUILE_BATIMENT = 9;
	public final static int ZONE_10_CARTE_DE_CIVILISATION = 10;

	public final static int REINITIALISER = 0;
	public final static int AUGMENTER = 1;
	public final static int DIMINUER = 2;

	private static int nombreDePlaceChezLeFrabicantDOutils;
	private static int nombreDePlaceAuChamp;
	private static int nombreDePlaceDansLaHutte;
	private static int nombreDePlaceDansLaForet;
	private static int nombreDePlaceALaRiviere;
	private static int nombreDePlaceAlaGlaisiere;
	private static int nombreDePlaceAlaCarriere;
	private static int nombreDePlaceDeTuilesBatiments;
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
		this.nombreDePlaceDeTuilesBatiments = 2;
		this.nombreDePlaceDesCartesDeCivilisations = 4;
		// Normalement cette valeur est illimitée
		// Par covention nous allons lui affecté la
		// valeur maximale de figurine ouvrier du jeu
		// qui vaut 20 pour deux joueurs
		this.nombreDePlaceALaChasse = 20;
	}

	public int getNombreDePlaceChezLeFrabicantDOutils() {
		return nombreDePlaceChezLeFrabicantDOutils;
	}

	public void setNombreDePlaceChezLeFrabicantDOutils(int nombreDePlaceChezLeFrabicantDOutils, int action) {
		this.nombreDePlaceChezLeFrabicantDOutils = nombreDePlaceChezLeFrabicantDOutils;
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceChezLeFrabicantDOutils = nombreDePlaceChezLeFrabicantDOutils;
			break;
		case AUGMENTER:
			this.nombreDePlaceChezLeFrabicantDOutils = this.nombreDePlaceChezLeFrabicantDOutils
					+ nombreDePlaceChezLeFrabicantDOutils;
			break;
		case DIMINUER:
			this.nombreDePlaceChezLeFrabicantDOutils = this.nombreDePlaceChezLeFrabicantDOutils
					- nombreDePlaceChezLeFrabicantDOutils;
			break;
		}
	}

	public int getNombreDePlaceAuChamp() {
		return nombreDePlaceAuChamp;
	}

	public void setNombreDePlaceAuChamp(int nombreDePlaceAuChamp, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceAuChamp = nombreDePlaceAuChamp;
			break;
		case AUGMENTER:
			this.nombreDePlaceAuChamp = this.nombreDePlaceAuChamp + nombreDePlaceAuChamp;
			break;
		case DIMINUER:
			this.nombreDePlaceAuChamp = this.nombreDePlaceAuChamp - nombreDePlaceAuChamp;
			break;
		}
	}

	public int getNombreDePlaceDansLaHutte() {
		return nombreDePlaceDansLaHutte;
	}

	public void setNombreDePlaceDansLaHutte(int nombreDePlaceDansLaHutte, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceDansLaHutte = nombreDePlaceDansLaHutte;
			break;
		case AUGMENTER:
			this.nombreDePlaceDansLaHutte = this.nombreDePlaceDansLaHutte + nombreDePlaceDansLaHutte;
			break;
		case DIMINUER:
			this.nombreDePlaceDansLaHutte = this.nombreDePlaceDansLaHutte - nombreDePlaceDansLaHutte;
			break;
		}
	}

	public int getNombreDePlaceDansLaForet() {
		return nombreDePlaceDansLaForet;
	}

	public void setNombreDePlaceDansLaForet(int nombreDePlaceDansLaForet, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceDansLaForet = nombreDePlaceDansLaForet;
			break;
		case AUGMENTER:
			this.nombreDePlaceDansLaForet = this.nombreDePlaceDansLaForet + nombreDePlaceDansLaForet;
			break;
		case DIMINUER:
			this.nombreDePlaceDansLaForet = this.nombreDePlaceDansLaForet - nombreDePlaceDansLaForet;
			break;
		}
	}

	public int getNombreDePlaceALaRiviere() {
		return nombreDePlaceALaRiviere;
	}

	public void setNombreDePlaceALaRiviere(int nombreDePlaceALaRiviere, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceALaRiviere = nombreDePlaceALaRiviere;
			break;
		case AUGMENTER:
			this.nombreDePlaceALaRiviere = this.nombreDePlaceALaRiviere + nombreDePlaceALaRiviere;
			break;
		case DIMINUER:
			this.nombreDePlaceALaRiviere = this.nombreDePlaceALaRiviere - nombreDePlaceALaRiviere;
			break;
		}
	}

	public int getNombreDePlaceAlaGlaisiere() {
		return nombreDePlaceAlaGlaisiere;
	}

	public void setNombreDePlaceAlaGlaisiere(int nombreDePlaceAlaGlaisiere, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceAlaGlaisiere = nombreDePlaceAlaGlaisiere;
			break;
		case AUGMENTER:
			this.nombreDePlaceAlaGlaisiere = this.nombreDePlaceAlaGlaisiere + nombreDePlaceAlaGlaisiere;
			break;
		case DIMINUER:
			this.nombreDePlaceAlaGlaisiere = this.nombreDePlaceAlaGlaisiere - nombreDePlaceAlaGlaisiere;
			break;
		}
	}

	public int getNombreDePlaceAlaCarriere() {
		return nombreDePlaceAlaCarriere;
	}

	public void setNombreDePlaceAlaCarriere(int nombreDePlaceAlaCarriere, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceAlaCarriere = nombreDePlaceAlaCarriere;
			break;
		case AUGMENTER:
			this.nombreDePlaceAlaCarriere = this.nombreDePlaceAlaCarriere + nombreDePlaceAlaCarriere;
			break;
		case DIMINUER:
			this.nombreDePlaceAlaCarriere = this.nombreDePlaceAlaCarriere - nombreDePlaceAlaCarriere;
			break;
		}
	}

	public int getNombreDePlaceDeTuilesBatiments() {
		return nombreDePlaceDeTuilesBatiments;
	}

	public void setNombreDePlaceDeTuilesBatiments(int nombreDePlaceDeTuilesBatiments, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceDeTuilesBatiments = nombreDePlaceDeTuilesBatiments;
			break;
		case AUGMENTER:
			this.nombreDePlaceDeTuilesBatiments = this.nombreDePlaceDeTuilesBatiments + nombreDePlaceDeTuilesBatiments;
			break;
		case DIMINUER:
			this.nombreDePlaceDeTuilesBatiments = this.nombreDePlaceDeTuilesBatiments - nombreDePlaceDeTuilesBatiments;
			break;
		}
	}

	public int getNombreDePlaceDesCartesDeCivilisations() {
		return nombreDePlaceDesCartesDeCivilisations;
	}

	public void setNombreDePlaceDesCartesDeCivilisations(int nombreDePlaceDesCartesDeCivilisations, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceDesCartesDeCivilisations = nombreDePlaceDesCartesDeCivilisations;
			break;
		case AUGMENTER:
			this.nombreDePlaceDesCartesDeCivilisations = this.nombreDePlaceDesCartesDeCivilisations
					+ nombreDePlaceDesCartesDeCivilisations;
			break;
		case DIMINUER:
			this.nombreDePlaceDesCartesDeCivilisations = this.nombreDePlaceDesCartesDeCivilisations
					- nombreDePlaceDesCartesDeCivilisations;
			break;
		}
	}

	public int getNombreDePlaceALaChasse() {
		return nombreDePlaceALaChasse;
	}

	public void setNombreDePlaceALaChasse(int nombreDePlaceALaChasse, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDePlaceALaChasse = nombreDePlaceALaChasse;
			break;
		case AUGMENTER:
			this.nombreDePlaceALaChasse = this.nombreDePlaceALaChasse + nombreDePlaceALaChasse;
			break;
		case DIMINUER:
			this.nombreDePlaceALaChasse = this.nombreDePlaceALaChasse - nombreDePlaceALaChasse;
			break;
		}
	}

}
