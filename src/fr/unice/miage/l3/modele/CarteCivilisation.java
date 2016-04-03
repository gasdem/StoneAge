package fr.unice.miage.l3.agedepierre.modele.bis;

public class CarteCivilisation {
	private int nbreDePoint;
	private int ressourcesDeLacarte;
	private Couleur couleurDeFond;
	
	

	public CarteCivilisation() {
		this.nbreDePoint = 0;
		this.ressourcesDeLacarte = 0;
		this.couleurDeFond = null;
	}

	public CarteCivilisation(int nbreDePoint, int ressourcesDeLacarte, Couleur couleurDeFond) {
		this.nbreDePoint = nbreDePoint;
		this.ressourcesDeLacarte = ressourcesDeLacarte;
		this.couleurDeFond = couleurDeFond;
	}

	public int getPoint() {
		return nbreDePoint;
	}

	public void setPoint(int nbreDePoint) {
		this.nbreDePoint = nbreDePoint;
	}

	public int getRessourcesDeLacarte() {
		return ressourcesDeLacarte;
	}

	public void setRessourcesDeLacarte(int ressourcesDeLacarte) {
		this.ressourcesDeLacarte = ressourcesDeLacarte;
	}

	@Override
	public String toString() {
		return "Cette CarteBatiment rapporte " + nbreDePoint + ", elle coûte " + ressourcesDeLacarte + "\n"
				+ "Sa couleur de fond est le " + this.couleurDeFond;
	}

}
