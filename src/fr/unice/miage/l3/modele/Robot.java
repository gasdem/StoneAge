package fr.unice.miage.l3.modele;

import java.util.Random;

import fr.unice.miage.l3.enumration.Zone;

public class Robot {
	public final static int PHASE_1_POSE_DES_FIGURINES = 1;
	public final static int PHASE_2_REALISATION_DES_ACTIONS = 2;
	public final static int PHASE_3_ALIMENTATION_DES_FIGURINES = 3;

	private Joueur[] listeDesJoueurs;
	private PlateauDeJeu plateauDeJeu;
	// Variable permet d effectuer des selection aléatoires
	private int selectionAleatoire;
	private boolean mauvaiseZoneSelectionnee = false;

	public Robot(Joueur[] listeDesjoueurs, PlateauDeJeu plateauDeJeu) {
		this.listeDesJoueurs = listeDesjoueurs;
		this.plateauDeJeu = plateauDeJeu;
	}
	
	// Cette méthode permet au joueur de sélectionner aléatoirement une zone ou 
	// des figurines.
	public int effectuerSelectionAleatoire(int min, int max) {
		Random r = new Random();
		selectionAleatoire = r.nextInt(max - min) + min;
		return selectionAleatoire;
	}
	
	public int getSelectionAleatoire(){
		return selectionAleatoire;
	}

	// Cette méthode permet au joueur de placer une ou plusieurs figurines
	// sur une zone chosie précedemment avec la méthode selectionnerUneZone();
	public boolean placerDesFigurinesSurUneZone(Joueur joueur, int zoneSelectionnee) {

		boolean leJoueurAFini = false;
		
		// On vérifie toujours que le joueur à encore des figurines disponibles
		if (joueur.getNombreDeFigurines() > 0 || joueur.getZonesOccupees().contains(zoneSelectionnee)) {
			switch (zoneSelectionnee) {
			case Zone.NUM_FRABICANT_D_OUTILS:
				if (plateauDeJeu.getNombreDePlaceChezLeFrabicantDOutils() == 1) {
					joueur.setNombreDeFigurines(1, Joueur.DIMINUER);
					plateauDeJeu.setNombreDePlaceChezLeFrabicantDOutils(1, PlateauDeJeu.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine chez le fabricant d'outil.");
					mauvaiseZoneSelectionnee = false;
				} else {
					System.out.println("Cette place est déjà occupée!");
					joueur.setZonesOccupees(zoneSelectionnee);
					mauvaiseZoneSelectionnee = true;
				}
				break;
				
			case Zone.NUM_CHAMP:
				if (plateauDeJeu.getNombreDePlaceAuChamp() == 1) {
					joueur.setNombreDeFigurines(1, Joueur.DIMINUER);;
					plateauDeJeu.setNombreDePlaceAuChamp(1, PlateauDeJeu.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine au champ.");
					mauvaiseZoneSelectionnee = false;
				} else {
					afficherMsgZoneOccupee(joueur, Zone.CHAMP);
				}
				break;
				
			case Zone.NUM_HUTTE:
				if (plateauDeJeu.getNombreDePlaceDansLaHutte() == 2) {
					joueur.setNombreDeFigurines(2, Joueur.DIMINUER);
					plateauDeJeu.setNombreDePlaceDansLaHutte(2, Joueur.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé deux figurines dans la hutte.");
					mauvaiseZoneSelectionnee = false;
				} else {
					afficherMsgZoneOccupee(joueur, Zone.HUTTE);
				}
				break;
				
			case Zone.NUM_CHASSE:
				// Dans ce cas on ne vérfie pas le nombre de place car c'est illimité
				
				// On effectue une sélection alétoire des nombres de figurines
				// qu'on mettra dans la forêt
				effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
				joueur.setNombreDeFigurines(getSelectionAleatoire(), Joueur.DIMINUER);
				plateauDeJeu.setNombreDePlaceChezLeFrabicantDOutils(getSelectionAleatoire(), Joueur.DIMINUER);
				System.out.println(joueur.getNomJoueur() + " a envoyé des figurines à la chasse.");
				mauvaiseZoneSelectionnee = false;
				break;
				
			case Zone.NUM_FORET:
				if (plateauDeJeu.getNombreDePlaceDansLaForet() != 7) {
					afficherMsgZoneOccupee(joueur, Zone.FORET);
				} else {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire(), Joueur.DIMINUER);
					plateauDeJeu.setNombreDePlaceDansLaForet(getSelectionAleatoire(),Joueur.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine dans la forêt");
					mauvaiseZoneSelectionnee = false;
				}
				break;
				
			case Zone.NUM_RIVIERE:
				if (plateauDeJeu.getNombreDePlaceALaRiviere() != 7) {
					afficherMsgZoneOccupee(joueur, Zone.RIVIERE);
				} else {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire(), Joueur.DIMINUER);
					plateauDeJeu.setNombreDePlaceALaRiviere(getSelectionAleatoire(), Joueur.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine à la rivière.");
				}
				break;
				
			case Zone.NUM_GLASIERE:
				if (plateauDeJeu.getNombreDePlaceAlaGlaisiere() != 7) {
					afficherMsgZoneOccupee(joueur, Zone.GLAISIERE);
				} else {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire(), Joueur.DIMINUER);
					plateauDeJeu.setNombreDePlaceAlaGlaisiere(getSelectionAleatoire(),Joueur.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine à la glaisière.");
				}
				break;
				
			case Zone.NUM_CARRIERE:
				if (plateauDeJeu.getNombreDePlaceAlaCarriere() != 7) {
					afficherMsgZoneOccupee(joueur, Zone.CARRIERE);
				} else {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire(), Joueur.DIMINUER);
					plateauDeJeu.setNombreDePlaceAlaCarriere(getSelectionAleatoire(), Joueur.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine à la carrière.");
					mauvaiseZoneSelectionnee = false;
				}
				break;
				
			case Zone.NUM_TUILE_BATIMENT:
				if (plateauDeJeu.getNombreDePlaceDeTuilesBatiments() == 2) {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire(), Joueur.DIMINUER);
					plateauDeJeu.setNombreDePlaceDeTuilesBatiments(getSelectionAleatoire(), PlateauDeJeu.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine sur une tuile bâtiment.");
					mauvaiseZoneSelectionnee = false;
				} else {
					afficherMsgZoneOccupee(joueur, Zone.TUILE_BATIMENT);
				}
				break;
				
			case Zone.NUM_CARTE_DE_CIVILISATION:
				if (plateauDeJeu.getNombreDePlaceDesCartesDeCivilisations() == 4) {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire(), Joueur.DIMINUER);
					plateauDeJeu.setNombreDePlaceDesCartesDeCivilisations(getSelectionAleatoire(), PlateauDeJeu.DIMINUER);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine sur une carte de civilisation.");
					mauvaiseZoneSelectionnee = false;
				} else {
					afficherMsgZoneOccupee(joueur, Zone.TUILE_BATIMENT);
				}
				break;

			default:
				break;
			}
		} else {
			System.out.println("Cette place est déjà occupée ou vous n'avez plus de joueur!");
			mauvaiseZoneSelectionnee = true;
		}
		return leJoueurAFini;
	}

	public void changerDePahse() {

	}

	public void calculerScore() {

	}
	
	private void afficherMsgZoneOccupee(Joueur joueur, Zone zoneOccupee){
		System.out.println("Attention "+zoneOccupee.getNomDeLaZone()+" est déjà occupée!");
		joueur.setZonesOccupees(zoneOccupee.getNumeroDeLaZone());
		mauvaiseZoneSelectionnee = true;
	}
}
