package etatPassager;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import etatPassager.EtatPassager.Etat;

public class EtatPassagerTest {
	EtatPassager eP1, eP2,eP3;
	@Before
	public void initialiser() {
		eP1 = new EtatPassager(Etat.ASSIS);
		eP2 = new EtatPassager(Etat.DEBOUT);
		eP3 = new EtatPassager(Etat.DEHORS);
	}
	@After
	public void netttoyer() {
		eP1 = null;
		eP2 = null;
		eP3 = null;
		
	}
	
	@Test
	public void testEtatPassager() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstExterieur() {
		//assert(!eP1.estAssis() && eP1.estExterieur() && !eP1.estDebout()):"Il est pas dehors!";
		//assert(!eP2.estAssis() && eP2.estExterieur() && !eP2.estDebout()):"Il est pas dehors!";
		assert(!eP3.estAssis() && eP3.estExterieur() && !eP3.estDebout()):"Il est pas dehors!";
	}

	@Test
	public void testEstAssis() {
		assert(eP1.estAssis() && !eP1.estExterieur() && !eP1.estDebout()):"Il est pas assis!";
		//assert(eP2.estAssis() && !eP2.estExterieur() && !eP2.estDebout()):"Il est pas assis!";
		//assert(eP3.estAssis() && !eP3.estExterieur() && !eP3.estDebout()):"Il est pas assis!";
		
	}

	@Test
	public void testEstDebout() {
		//assert(!eP1.estAssis() && !eP1.estExterieur() && eP1.estDebout()):"Il est pas debout!";
		assert(!eP2.estAssis() && !eP2.estExterieur() && eP2.estDebout()):"Il est pas debout!";
		//assert(!eP3.estAssis() && !eP3.estExterieur() && eP3.estDebout()):"Il est pas debout!";
	}

	@Test
	public void testEstInterieur() {
		assert(eP1.estInterieur()):"Il est dehors!";
		assert(eP2.estInterieur()):"Il est dehors!";
		//assert(eP3.estInterieur()):"Il est dehors!";
	}
}
