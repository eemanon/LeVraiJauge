package JaugeNaturel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JaugeTest implements IJaugeTest{
	Jauge jauge, jauge1, jauge2, jauge3, jauge4, jauge5, jaugeBis, jauge6, jauge7, jauge8;
	
	@Before
	public void initialiser() throws Exception{
		jauge = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge1 = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge2 = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge3 = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge4 = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jaugeBis = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge5 = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge6 = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge7 = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge8 = Jauge.creerJauge(Jauge.TypeJauge.JaugeNaturel);
		jauge.
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
	@Override
	public Jauge creerJauge() {
		// TODO Auto-generated method stub
		return null;
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
		long valeur_avant = jauge.getValeur();
		jauge.incrementer();
		assert(jauge.getValeur() == valeur_avant + 1);
	}

	@Test
	public void testDecrementer() {
		long valeur_avant = jauge.getValeur();
		jauge.decrementer();
		assert(jauge.getValeur() == valeur_avant - 1):"Valeur n'a pas été décrementée!!!fuckkkk";
	}
	
	@Test
	public void testDansIntervalle() {
		assert(!jauge4.estBleu() && jauge4.estVert() && !jauge4.estRouge()):"La valeur n'est pas dans l'intervalle";
		assert(!jauge5.estBleu() && jauge5.estVert() && !jauge5.estRouge()):"La valeur n'est pas dans l'intervalle";
	}
	@Test
	public void testLimiteVgieMaxInferieurVigieMin() {
		assert(jauge1.getMin()<jauge1.getMax()):"VgieMax n est pas plus grand que VgieMin!";	
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
