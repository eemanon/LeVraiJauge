package JaugeNaturel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import JaugeNaturel.Jauge.TypeJauge;

public class JaugeTest implements IJaugeTest{
	public enum TypeJauge {
		JaugeDistance, 
		JaugeNaturel,
        JaugeNegatif,
        JaugeReel         			
	};
	public static IJauge creerJauge(TypeJauge type) {
		switch (type) {
		case JaugeDistance:
			return new JaugeDistance(0, 0);
		case JaugeNaturel:
			return new JaugeNaturel(0, 0, 0);
		case JaugeNegatif:
			return new JaugeNegatif(0, 0, 0);
		case JaugeReel:
			return new JaugeReel(0, 0, 0);
		}
		return null;
				
	}
	
	
	
	IJauge jauge, jauge1, jauge2, jauge3, jauge4, jauge5, jaugeBis, jauge6, jauge7, jauge8;
	
	@Before
	public void initialiser() throws Exception{
		jauge = creerJauge(TypeJauge.JaugeNaturel);
		jauge1 = creerJauge(TypeJauge.JaugeNaturel);
		jauge2 = creerJauge(TypeJauge.JaugeNaturel);
		jauge3 = creerJauge(TypeJauge.JaugeNaturel);
		jauge4 = creerJauge(TypeJauge.JaugeNaturel);
		jaugeBis = creerJauge(TypeJauge.JaugeNaturel);
		jauge5 = creerJauge(TypeJauge.JaugeNaturel);
		jauge6 = creerJauge(TypeJauge.JaugeNaturel);
		jauge7 = creerJauge(TypeJauge.JaugeNaturel);
		jauge8 = creerJauge(TypeJauge.JaugeNaturel);
	}
	
	@After
	public void nettoyer() throws Exception{
		jauge = null;
		jauge1 = null;
		jauge2 = null;
		jauge3 = null;
		jauge4 = null;
		jauge5 = null;
		jauge6 = null;
		jauge7 = null;
		jauge8 = null;
		jaugeBis = null;
		
	}
	@Test
	public void testEstRouge() {
		assert(jauge.estRouge());
		assert(jauge2.estRouge());
		assert(jauge3.estRouge());
		assert(jauge1.estRouge());
	}

	@Test
	public void testEstVert() {
		assert(jauge.estVert()):"jauge est pas vert";
		assert(jauge4.estVert());
	}

	@Test
	public void testEstBleu() {
		assert(jauge1.estBleu());
		assert(jauge4.estBleu());
	}

	@Test
	public void testIncrementer() {
		//assert(jauge.incrementer().equals(jaugeBis));
		Placeholder valeur_avant = jauge.getVal();
		jauge.incrementer();
		assert(jauge.getVal().compareTo(valeur_avant) == 1);
		//fuck those. il me faut un moyen de comparer les valeurs de deux jauges
	}

	@Test
	public void testDecrementer() {
		Placeholder valeur_avant = jauge.getVal();
		jauge.decrementer();
		assert(jauge.getVal().compareTo(valeur_avant) == -1):"Valeur n'a pas été décrementée!!!fuckkkk";
	}
	
	@Test
	public void testDansIntervalle() {
		assert(!jauge4.estBleu() && jauge4.estVert() && !jauge4.estRouge()):"La valeur n'est pas dans l'intervalle";
		assert(!jauge5.estBleu() && jauge5.estVert() && !jauge5.estRouge()):"La valeur n'est pas dans l'intervalle";
	}
	@Test
	public void testLimiteVgieMaxInferieurVigieMin() {
		assert(jauge.getMin().compareTo(jauge.getMax()) == -1):"VgieMax n est pas plus grand que VgieMin!";	
	}
	@Test
	public void run() {
			     System.out.print("Test de JaugeNaturel:");

			     System.out.print(".");
			     testDansIntervalle();

			      System.out.print(".");
			      testInferieurIntervalle();

			     System.out.println("OK");
	}
	@Test
	public void testDeplacement() {
		assert(!jauge6.estBleu() && jauge6.estVert() && !jauge6.estRouge()):"La valeur n'est pas dans l'intervalle";
		jauge6.decrementer();
		jauge6.decrementer();
		assert(!jauge6.estBleu() && jauge6.estVert() && !jauge6.estRouge()):"La valeur n'est pas dans l'intervalle";
		jauge6.incrementer();
		jauge6.incrementer();
		assert(!jauge6.estBleu() && jauge6.estVert() && !jauge6.estRouge()):"La valeur n'est pas dans l'intervalle";
	}
	@Test
	public void testMaxEgalMin() {
		assert(jauge1.getMin()==jauge1.getMax()):"VgieMax n est pas egale à VgieMin!";	
	}
	@Test
	public void testSuperieurIntervalle() {
		assert(!jauge.estBleu() && jauge.estRouge() && !jauge.estVert()):"la valeur de départ est supérieure à l'intervalle :( !";	
	}
	@Test
	public void testInferieurIntervalle() {
		assert(!jauge.estBleu() && !jauge.estRouge() && jauge.estVert()):"la val de depart est trop petite!";	
	}
}
