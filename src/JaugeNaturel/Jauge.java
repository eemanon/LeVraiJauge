package JaugeNaturel;


public class Jauge {
	public enum TypeJauge {
		JaugeDistance, 
        JaugeNaturel,  
        JaugeNegatif,
        JaugeReel         			
	};
	public static Jauge creerJauge(TypeJauge type) {
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
}
