package JaugeNaturel;

public class JaugeReel extends Jauge implements IJauge{
	  private float valeur;
	  private final float min;
	  private final float max;

	  /**
	   * Construit une instance en précisant la valeur de départ de la Jauge
	   * et l'intervalle de vigie.
	   *
	   * @param vigieMin valeur minimale de l'intervalle de vigie.
	   * @param vigieMax valeur maximale de l'intervalle de vigie.
	   * @param depart   valeur initiale de la jauge.
	 */  
	  public JaugeReel(float vigieMin, float vigieMax, float depart) {
	    setValeur(depart);
	    min = vigieMin;
	    max = vigieMax;
	    /* Le constructeur d'une classe permet d'initialiser l'etat de l'instance creee.
	     * Son nom correspond toujours au nom de la classe. Il n'y a pas de type de retour.
	     */
	  }


	  /**
	   * L'état de la jauge est-il rouge ?
	   *
	   * @return vrai si niveau >=  vigieMax.
	   *
	   */
	  public boolean estRouge() {
	    return getValeur() >= getMax();
	  }

	  /**
	   * L'état de la jauge est-il vert ?
	   *
	   * @return vrai si niveau appartient à ]vigieMin, vigieMax[.
	   *
	   */
	  public boolean estVert() {
	    //return !(estBleu() && estRouge());
	    return getValeur() > getMin() && getValeur() < getMax();
	  }

	  /**
	   * L'état de la jauge est-il bleu ?
	   *
	   * @return vrai si niveau <= vigieMin.
	   */
	  public boolean estBleu() {
	    return getValeur() <= getMin();
	  }

	  /**
	   * Incrémente le niveau d'une unité.
	   * L'état peut devenir supérieur à vigieMax.
	   */
	  public void incrementer() {
	    setValeur(getValeur() + 1);
	  }

	  /**
	   * Décrémente le niveau d'une unité.
	   * L'état peut devenir inférieur à la vigieMin.
	   */
	  public void decrementer() {
		    setValeur(getValeur() - 1);
	  }


	  /**
	   * Cette méthode est héritée de la classe {@link java.lang.Object}.
	   * Très utile pour le débogage, elle permet de fournir une
	   * chaîne de caractères correspondant a l'état d'un objet.
	   * <p> Un code par défaut est définit dans
	   * {@link java.lang.Object#toString() la classe Object}
	   * Il faut adapter (redéfinir) le code de cette méthode à chaque classe.
	   *
	   * Pour les chaînes de cararctères, l'opérateur + correspond a la concaténation.
	   * Les valeurs numériques sont alors convertit en ascii.
	   * Si l'état d'une instance de cette classe est min=-456, max=23,
	   * valeur=-7, la concaténation donne la chaîne "<-7 [-456,23]>".
	   */
	  @Override
	  public String toString() {
	    return "<" + getValeur() + " [" + getMin() + "," + getMax() + "]>";
	  }

	public float getValeur() {
		return valeur;
	}


	public void setValeur(float valeur) {
		this.valeur = valeur;
	}


	public float getMax() {
		return max;
	}


	public float getMin() {
		return min;
	}
}
