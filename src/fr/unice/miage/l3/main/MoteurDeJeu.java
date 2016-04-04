package fr.unice.miage.l3.main;

import java.util.ArrayList;

import fr.unice.miage.l3.modele.Couleur;
import fr.unice.miage.l3.modele.Joueur;
import fr.unice.miage.l3.modele.PlateauDeJeu;
import fr.unice.miage.l3.modele.Robot;

public class MoteurDeJeu {

	public static void main(String[] args) {
		Joueur Maguette = new Joueur("Maguette", Couleur.BLEU);
		Joueur Fatou = new Joueur("Fatou", Couleur.ROUGE);
		ArrayList<Joueur> listeDesJoueurs = new ArrayList<>();
		listeDesJoueurs.add(Maguette);
		listeDesJoueurs.add(Fatou);
		
		System.out.println("\n\n**********Bienvenue dans L'Age De Pierre !***************");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\nLes Deux joueurs sont Maguette et Fatou.\n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("***********PHASE1: POSIIONNEMENT DES FIGURINES********************\n");
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
								robot.effectuerSelectionAleatoire(1, 10));
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (robot.debut == false){
					terminee=false;
					System.out.println("\n*************FIN DE POSITIONNEMENT DES FIGURINES************");
				}

			}
		}

	}
}
