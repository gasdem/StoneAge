package fr.unice.miage.l3.agedepierre.modele.bis;

import java.util.Random;

public class Robot {
	public final static int PHASE_1_POSE_DES_FIGURINES = 1;
	public final static int PHASE_2_REALISATION_DES_ACTIONS = 2;
	public final static int PHASE_3_ALIMENTATION_DES_FIGURINES = 3;

	private Joueur[] listeDesJoueurs;
	private PlateauDeJeu plateauDeJeu;
	// Variable permet d effectuer des selection aléatoires
	private int selectionAleatoire;

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
		if (joueur.getNombreDeFigurines() > 0 || joueur.getPlaceInterdite().contains(zoneSelectionnee)) {
			switch (zoneSelectionnee) {
			case PlateauDeJeu.ZONE_1_FRABICANT_D_OUTILS:
				if (plateauDeJeu.getNombreDePlaceChezLeFrabicantDOutils() == 1) {
					joueur.setNombreDeFigurines(-1);
					plateauDeJeu.setNombreDePlaceChezLeFrabicantDOutils(-1);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine chez le fabricant d'outil.");
				} else {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				}
				break;
				
			case PlateauDeJeu.ZONE_2_CHAMP:
				if (plateauDeJeu.getNombreDePlaceAuChamp() == 1) {
					joueur.setNombreDeFigurines(-1);
					plateauDeJeu.setNombreDePlaceAuChamp(-1);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine au champ.");
				} else {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				}
				break;
				
			case PlateauDeJeu.ZONE_3_HUTTE:
				if (plateauDeJeu.getNombreDePlaceDansLaHutte() == 2) {
					joueur.setNombreDeFigurines(-2);
					plateauDeJeu.setNombreDePlaceDansLaHutte(-2);
					System.out.println(joueur.getNomJoueur() + " a posé deux figurines dans la hutte.");
				} else {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				}
				break;
				
			case PlateauDeJeu.ZONE_4_DE_CHASSE:
				// Dans ce cas on ne vérfie pas le nombre de place car c'est illimité
				
				// On effectue une sélection alétoire des nombres de figurines
				// qu'on mettra dans la forêt
				effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
				joueur.setNombreDeFigurines(getSelectionAleatoire());
				plateauDeJeu.setNombreDePlaceChezLeFrabicantDOutils(-1);
				System.out.println(joueur.getNomJoueur() + " a envoyé des figurines à la chasse");
				break;
				
			case PlateauDeJeu.ZONE_5_FORET:
				if (plateauDeJeu.getNombreDePlaceDansLaForet() != 7) {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				} else {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire());
					plateauDeJeu.setNombreDePlaceDansLaForet(getSelectionAleatoire());
					System.out.println(joueur.getNomJoueur() + " a posé dans la forêt");
				}
				break;
			case PlateauDeJeu.ZONE_6_RIVIERE:
				if (plateauDeJeu.getNombreDePlaceALaRiviere() != 7) {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				} else {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire());
					plateauDeJeu.setNombreDePlaceALaRiviere(getSelectionAleatoire());
					System.out.println(joueur.getNomJoueur() + " a posé une figurine chez le fabricant d'outil.");
				}
				break;
			case PlateauDeJeu.ZONE_7_GLASIERE:
				if (plateauDeJeu.getNombreDePlaceDansLaForet() != 7) {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				} else {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire());
					plateauDeJeu.setNombreDePlaceDansLaForet(getSelectionAleatoire());
					System.out.println(joueur.getNomJoueur() + " a posé une figurine chez le fabricant d'outil.");
				}
				break;
			case PlateauDeJeu.ZONE_8_CARRIERE:
				if (plateauDeJeu.getNombreDePlaceDansLaForet() != 7) {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				} else {
					effectuerSelectionAleatoire(1, joueur.getNombreDeFigurines());
					joueur.setNombreDeFigurines(getSelectionAleatoire());
					plateauDeJeu.setNombreDePlaceDansLaForet(getSelectionAleatoire());
					System.out.println(joueur.getNomJoueur() + " a posé une figurine chez le fabricant d'outil.");
				}
				break;
			case PlateauDeJeu.ZONE_9_CARTE_BATIMENTS:
				if (plateauDeJeu.getNombreDePlaceChezLeFrabicantDOutils() == 1) {
					joueur.setNombreDeFigurines(-1);
					plateauDeJeu.setNombreDePlaceChezLeFrabicantDOutils(-1);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine chez le fabricant d'outil.");
				} else {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				}
				break;
			case PlateauDeJeu.ZONE_10_CARTES_DE_CIVILISATIONS:
				if (plateauDeJeu.getNombreDePlaceChezLeFrabicantDOutils() == 1) {
					joueur.setNombreDeFigurines(-1);
					plateauDeJeu.setNombreDePlaceChezLeFrabicantDOutils(-1);
					System.out.println(joueur.getNomJoueur() + " a posé une figurine chez le fabricant d'outil.");
				} else {
					System.out.println("Cette place est déjà occupée!");
					joueur.setPlaceInterdite(zoneSelectionnee);
				}
				break;

			default:
				break;
			}
		} else {
			System.out.println("Cette place est déjà occupée ou vous n'avez plus de joueur!");

		}
		return leJoueurAFini;
	}

	public void changerDePahse() {

	}

	public void calculerScore() {

	}
}
