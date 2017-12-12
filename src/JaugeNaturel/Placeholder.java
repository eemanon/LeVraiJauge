package JaugeNaturel;

public class Placeholder implements Comparable{
	public Placeholder(int entier, float flottant, long tlong) {
		super();
		this.entier = entier;
		this.flottant = flottant;
		this.tlong = tlong;
	}
	public int getEntier() {
		return entier;
	}
	public float getFlottant() {
		return flottant;
	}
	public long getTlong() {
		return tlong;
	}
	private int entier;
	private float flottant;
	private long tlong;
	
	@Override
	public int compareTo(Object o) {
		Placeholder p = (Placeholder)o;
		if(p.flottant > this.flottant || this.entier > this.entier && this.tlong > p.tlong)
			return -1;
		if(p.flottant < this.flottant || this.entier < this.entier && this.tlong < p.tlong)
			return 1;
		return 0;
	}
}
