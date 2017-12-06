package JaugeNaturel;

public interface IJaugeTest {
	public void nettoyer() throws Exception;
	public void testEstRouge();
	public void testEstVert();
	public void testEstBleu();
	public void testIncrementer();
	public void testDecrementer();
	public void testDansIntervalle();
	public void testLimiteVgieMaxInferieurVigieMin();
	public void testDeplacement();
	public void testMaxEgalMin() ;
	public void testSuperieurIntervalle();
	public void testInferieurIntervalle();
	public Jauge creerJauge();
}
//voundèrcheun