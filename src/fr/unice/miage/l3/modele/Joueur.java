package fr.unice.miage.l3.modele;

import java.util.ArrayList;

public class Joueur {
	
	public final static int REINITIALISER = 0;
	public final static int AUGMENTER = 1;
	public final static int DIMINUER = 2;
	
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
	private TuileBatiment nombreDeTuilesBatiments;
	private CarteCivilisation nombreDeCarteCivilisation;
	private static ArrayList<Integer> zonesOccupees;
	

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
		this.nombreDeTuilesBatiments = new TuileBatiment();
		this.nombreOutils = 0;
		this.nombreDeCarteCivilisation = new CarteCivilisation();
		this.zonesOccupees = new ArrayList<>();
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
	
	// Todo : à modifier
	public void setScoreJoueur(int scoreJoueur) {
		this.scoreJoueur = scoreJoueur;
	}

	public TuileBatiment getNombreDeTuilesBatiments() {
		return nombreDeTuilesBatiments;
	}

	public void setNombreDeTuilesBatiments(TuileBatiment nombreDeTuilesBatiments, int action) {
		this.nombreDeTuilesBatiments = nombreDeTuilesBatiments;
	}
	
	public CarteCivilisation getNombreCarteCivilisation() {
		return nombreDeCarteCivilisation;
	}

	public void setNombreDeCarteCivilisation(CarteCivilisation nombreDeCarteCivilisation) {
		this.nombreDeCarteCivilisation = nombreDeCarteCivilisation;
	}

	public int getNombreOutils() {
		return nombreOutils;
	}

	public void setNombreOutils(int nombreOutils, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreOutils = nombreOutils;
			break;
		case AUGMENTER:
			this.nombreOutils = this.nombreOutils + nombreOutils;
			break;
		case DIMINUER:
			this.nombreOutils = this.nombreOutils - nombreOutils;
			break;
		}
	}

	public int getNombreDeFigurines() {
		return nombreDeFigurines;
	}

	public void setNombreDeFigurines(int nombreDeFigurines, int action) {
		switch (action) {
		case REINITIALISER:
			this.nombreDeFigurines = nombreDeFigurines;
			break;
		case AUGMENTER:
			this.nombreDeFigurines = this.nombreDeFigurines + nombreDeFigurines;
			break;
		case DIMINUER:
			this.nombreDeFigurines = this.nombreDeFigurines - nombreDeFigurines;
			break;
		}
	}
	
	public int getReserveNourriture() {
		return reserveNourriture;
	}

	public void setReserveNourriture(int reserveNourriture, int action) {
		switch (action) {
		case REINITIALISER:
			this.reserveNourriture = reserveNourriture;
			break;
		case AUGMENTER:
			this.reserveNourriture = this.reserveNourriture + reserveNourriture;
			break;
		case DIMINUER:
			this.reserveNourriture = this.reserveNourriture - reserveNourriture;
			break;
		}
	}

	public int getNiveauAgriculture() {
		return niveauAgriculture;
	}

	public void setNiveauAgriculture(int niveauAgriculture, int action) {
		switch (action) {
		case REINITIALISER:
			this.niveauAgriculture = niveauAgriculture;
			break;
		case AUGMENTER:
			this.niveauAgriculture = this.niveauAgriculture + niveauAgriculture;
			break;
		case DIMINUER:
			this.niveauAgriculture = this.niveauAgriculture - niveauAgriculture;
			break;
		}
	}

	public int getStockBois() {
		return stockBois;
	}

	public void setStockBois(int stockBois, int action) {
		switch (action) {
		case REINITIALISER:
			this.stockBois = stockBois;
			break;
		case AUGMENTER:
			this.stockBois = this.stockBois + stockBois;
			break;
		case DIMINUER:
			this.stockBois = this.stockBois - stockBois;
			break;
		}
	}

	public int getStockArgile() {
		return stockArgile;
	}
	
	public void setStockArgile(int stockArgile, int action) {
		switch (action) {
		case REINITIALISER:
			this.stockArgile = stockArgile;
			break;
		case AUGMENTER:
			this.stockArgile = this.stockArgile + stockArgile;
			break;
		case DIMINUER:
			this.stockArgile = this.stockArgile - stockArgile;
			break;
		}
	}

	public int getStockPierre() {
		return stockPierre;
	}
		
	public void setStockPierre(int stockPierre, int action) {
		switch (action) {
		case REINITIALISER:
			this.stockPierre = stockPierre;
			break;
		case AUGMENTER:
			this.stockPierre = this.stockPierre + stockPierre;
			break;
		case DIMINUER:
			this.stockPierre = this.stockPierre - stockPierre;
			break;
		}
	}

	public int getStockOr() {
		return stockOr;
	}
	
	public void setStockOr(int stockOr, int action) {
		switch (action) {
		case REINITIALISER:
			this.stockOr = stockOr;
			break;
		case AUGMENTER:
			this.stockOr = this.stockOr + stockOr;
			break;
		case DIMINUER:
			this.stockOr = this.stockOr - stockOr;
			break;
		}
	}
	
	public ArrayList<Integer> getZonesOccupees() {
		return zonesOccupees;
	}

	public void setZonesOccupees(int zonesOccupees) {
		this.zonesOccupees.add(zonesOccupees);
	}
	
	public void viderZonesOccupees(){
		this.zonesOccupees.clear();
	}

	@Override
	public String toString() {
		return "Le joueur " + this.nomJoueur + " a pour scoreJoueur=" + scoreJoueur;
	}
}
