package JaugeNaturel;

public interface IJauge {
	public boolean estRouge();
	public boolean estVert();
	public boolean estBleu();
	public void incrementer();
	public void decrementer();
	public Placeholder getMin();
	public Placeholder getMax();
	public Placeholder getVal();
	public void setVal(Placeholder p);
	public int comparerValeur(Placeholder p);
}
