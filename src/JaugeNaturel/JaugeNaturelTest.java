package JaugeNaturel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JaugeNaturelTest implements IJaugeTest{
	JaugeNaturel jauge, jauge1, jauge2, jauge3, jauge4, jauge5, jaugeBis, jauge6, jauge7, jauge8;
	
	@Before
	public void initialiser() throws Exception{
		jauge = new JaugeNaturel(100, 200, 300);
		jauge1 = new JaugeNaturel(200, 100, 0);
		jauge2 = new JaugeNaturel(100,100,100);
		jauge3 = new JaugeNaturel(-100, -200, 100);
		jauge4 = new JaugeNaturel(100, 200, 150);
		jaugeBis = new JaugeNaturel(100, 200, 301);
		jauge5 = new JaugeNaturel(0,300,321);
		jauge6 = new JaugeNaturel(300,302, 301);
		jauge7 = new JaugeNaturel(300,300,301);
		jauge8 = new JaugeNaturel(300,302, 302);	
	}
	
	@After
	public void nettoyer() throws Exception{
		jauge = null;
		jauge1 = null;
		jauge2 = null;
		jauge3 = null;
		
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
