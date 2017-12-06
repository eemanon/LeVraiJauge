package JaugeNaturel;

public interface IJauge {
	public boolean estRouge();
	public boolean estVert();
	public boolean estBleu();
	public void incrementer();
	public void decrementer();
}
