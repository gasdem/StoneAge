package fr.unice.miage.l3.modele;

import java.util.ArrayList;
import java.util.Random;

public class Joueur {
	private String nomJoueur;
	private Couleur couleurFigurine;
	private int scoreJoueur;
	private int nombreDeFigurines;
	private int reserveNourriture;
	private int niveauAgriculture;
	private int stockBois;
	private int stockArgile;
	private int stockPierre;
	private int stockOr;
	private int nombreOutils;
	private CarteBatiment nombreDeCarteBatiment;
	private CarteCivilisation nombreDeCarteCivilisation;
	private boolean passerLaMain;
	private static ArrayList<Integer> placeInterdite;

	public Joueur(String nomJoueur, Couleur couleurFigurine) {
		this.nomJoueur = nomJoueur;
		this.couleurFigurine = couleurFigurine;
		this.nombreDeFigurines = 5;
		this.scoreJoueur = 0;
		this.reserveNourriture = 12;
		this.niveauAgriculture = 0;
		this.stockBois = 0;
		this.stockArgile = 0;
		this.stockPierre = 0;
		this.stockOr = 0;
		this.nombreDeCarteBatiment = new CarteBatiment();
		this.nombreOutils = 0;
		this.nombreDeCarteCivilisation = new CarteCivilisation();
		this.placeInterdite = new ArrayList<>();
	}
	
	
	// La fin de la troisième partie on réinitialise les differents champs 
	// Du plateau de Jeu

	public void nourrirFigurine() {
		// On déduit de la réserve de nourriture le nombre
		// de figurine que le joueur à nourrit
		setReserveNourriture(-getNombreDeFigurines());
	}

	public Couleur getCouleurFigurine() {
		return couleurFigurine;
	}

	public void setCouleurFigurine(Couleur couleurFigurine) {
		this.couleurFigurine = couleurFigurine;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public int getScoreJoueur() {
		return scoreJoueur;
	}

	public void setScoreJoueur(int scoreJoueur) {
		this.scoreJoueur = scoreJoueur;
	}

	public CarteBatiment getNombreDeCarteBatiment() {
		return nombreDeCarteBatiment;
	}

	public void setNombreDeCarteBatiment(CarteBatiment nombreDeCarteBatiment) {
		this.nombreDeCarteBatiment = nombreDeCarteBatiment;
	}

	public int getNombreOutils() {
		return nombreOutils;
	}

	public void setNombreOutils(int nombreOutils) {
		this.nombreOutils = nombreOutils;
	}

	public CarteCivilisation getNombreCarteCivilisation() {
		return nombreDeCarteCivilisation;
	}

	public void setNombreDeCarteCivilisation(CarteCivilisation nombreDeCarteCivilisation) {
		this.nombreDeCarteCivilisation = nombreDeCarteCivilisation;
	}

	public int getNombreDeFigurines() {
		return nombreDeFigurines;
	}

	public void setNombreDeFigurines(int nombreDeFigurines) {
		this.nombreDeFigurines = nombreDeFigurines;
	}

	public int getReserveNourriture() {
		return reserveNourriture;
	}

	public void setReserveNourriture(int reserveNourriture) {
		this.reserveNourriture = reserveNourriture;
	}

	public int getNiveauAgriculture() {
		return niveauAgriculture;
	}

	public void setNiveauAgriculture(int niveauAgriculture) {
		this.niveauAgriculture = niveauAgriculture;
	}

	public int getStockBois() {
		return stockBois;
	}

	public void setStockBois(int stockBois) {
		this.stockBois = stockBois;
	}

	public int getStockArgile() {
		return stockArgile;
	}

	public void setStockArgile(int stockArgile) {
		this.stockArgile = stockArgile;
	}

	public int getStockPierre() {
		return stockPierre;
	}

	public void setStockPierre(int stockPierre) {
		this.stockPierre = stockPierre;
	}

	public int getStockOr() {
		return stockOr;
	}

	public void setStockOr(int stockOr) {
		this.stockOr = stockOr;
	}
	
	

	public ArrayList<Integer> getPlaceInterdite() {
		return placeInterdite;
	}


	public void setPlaceInterdite(int placeInterdite) {
		this.placeInterdite.add(placeInterdite);
	}


	@Override
	public String toString() {
		return "Le joueur " + this.nomJoueur + " a pour scoreJoueur=" + scoreJoueur;
	}
}
