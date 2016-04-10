package fr.unice.miage.l3.main;

import java.util.ArrayList;

import fr.unice.miage.l3.enumration.Couleur;
import fr.unice.miage.l3.modele.Joueur;
import fr.unice.miage.l3.modele.JoueurFaible;
import fr.unice.miage.l3.modele.JoueurFort;
import fr.unice.miage.l3.modele.PlateauDeJeu;
import fr.unice.miage.l3.modele.Robot;

public class MoteurDeJeu {

	public static void main(String[] args) {
		JoueurFaible Maguette = new JoueurFaible("Maguette", Couleur.BLEU);
		JoueurFort Fatou = new JoueurFort("Fatou", Couleur.ROUGE);
		ArrayList<Joueur> listeDesJoueurs = new ArrayList<>();
		listeDesJoueurs.add(Maguette);
		listeDesJoueurs.add(Fatou);
		
		System.out.println("\n**********Bienvenue dans L'Age De Pierre !*********************");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\n+++++++++Les Deux adversaires sont Maguette et Fatou.++++++++++\n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("**********PHASE1: POSIIONNEMENT DES FIGURINES********************\n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PlateauDeJeu plateauDeJeu = new PlateauDeJeu();
		Robot robot = new Robot(listeDesJoueurs, plateauDeJeu);
		
		Thread t = new Thread(new Moteur(robot));
		t.start();

	}

	static class Moteur implements Runnable {

		private Robot robot;
		private int nombreMinimumDeZones = 1;
		private int nombreMaximumDeZones = 10;
		

		public Moteur(Robot robot) {
			this.robot = robot;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			boolean terminee = true;
			while (terminee) {

					for (int i = 0; i < robot.getListeDesJoueurs().size(); i++) {
						robot.placerDesFigurinesSurUneZone(robot.getListeDesJoueurs().get(i),
								robot.effectuerSelectionAleatoire(nombreMinimumDeZones, nombreMaximumDeZones));
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					if (robot.getPhaseDeJeu() == Robot.PHASE_2_REALISATION_DES_ACTIONS){
					terminee=false;
					System.out.println("\n**********FIN DE POSITIONNEMENT DES FIGURINES******************\n");
					System.out.println("\n**********PHASE 2: REALISATION DES ACTIONS*********************");
				}

			}
		}

	}
}
