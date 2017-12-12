package JaugeNaturel;

public class JaugeDistance implements IJauge {
	  private long valeur;
	  private final long distanceVigi1;
	  private final long distanceVigi2;

	  /**
	   * Construit une instance en précisant la valeur de départ de la Jauge
	   * et l'intervalle de vigie.
	   *
	   * @param vigieMin valeur minimale de l'intervalle de vigie.
	   * @param vigieMax valeur maximale de l'intervalle de vigie.
	   * @param depart   valeur initiale de la jauge.
	 */  
	  public JaugeDistance(long vigieMin, long vigieMax) {
	    distanceVigi1 = vigieMin;
	    distanceVigi2 = vigieMax;
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
	    return 0 > distanceVigi2;
	  }

	  /**
	   * L'état de la jauge est-il vert ?
	   *
	   * @return vrai si niveau appartient à ]vigieMin, vigieMax[.
	   *
	   */
	  public boolean estVert() {
	    //return !(estBleu() && estRouge());
	    return distanceVigi1>0 && distanceVigi2 > 0;
	  }

	  /**
	   * L'état de la jauge est-il bleu ?
	   *
	   * @return vrai si niveau <= vigieMin.
	   */
	  public boolean estBleu() {
	    return distanceVigi1<0;
	  }

	  /**
	   * Incrémente le niveau d'une unité.
	   * L'état peut devenir supérieur à vigieMax.
	   */
	  public void incrementer() {
	    valeur =+ 1;
	  }

	  /**
	   * Décrémente le niveau d'une unité.
	   * L'état peut devenir inférieur à la vigieMin.
	   */
	  public void decrementer() {
		    valeur= - 1;
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
	  public String toString() {
	    return "<" + getVal().getTlong() + " [" + getMin() + "," + getMax() + "]>";
	  }
	
		public Placeholder getMax() {
			return new Placeholder(0,0,this.distanceVigi2);
		}
	
	
		public Placeholder getMin() {
			return new Placeholder(0,0,this.distanceVigi1);
		}
	
	
		@Override
		public Placeholder getVal() {
			return new Placeholder(0,0,this.valeur);
		}
	
	
		@Override
		public void setVal(Placeholder p) {
			this.valeur = p.getTlong();
			
		}
}
