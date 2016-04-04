package fr.unice.miage.l3.main;

import java.util.ArrayList;

import fr.unice.miage.l3.modele.Couleur;
import fr.unice.miage.l3.modele.Joueur;
import fr.unice.miage.l3.modele.PlateauDeJeu;
import fr.unice.miage.l3.modele.Robot;

public class MoteurDeJeu {

	public static void main(String[] args) {
		Joueur Amadou = new Joueur("Ahmed", Couleur.BLEU);
		Joueur Fatou = new Joueur("Fatou", Couleur.ROUGE);
		ArrayList<Joueur> listeDesJoueurs = new ArrayList<>();
		listeDesJoueurs.add(Amadou);
		listeDesJoueurs.add(Fatou);
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

				for (int j = 0; j < 50; j++) {
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
					if (j == 50)
						terminee = false;
				}

			}
		}

	}
}
