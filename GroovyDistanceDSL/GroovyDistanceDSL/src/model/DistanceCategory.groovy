package model

class DistanceCategory {
	
	static Distance getMm(Number n) { new Distance(length : n, unit : Unit.mm) }
	
	static Distance getMm(Distance d) {
		new Distance(length : Unit.convertUnit(d, Unit.mm), unit : Unit.mm)
	}
	
	
	static Distance getCm(Number n) { new Distance(length : n, unit : Unit.cm) }
	
	static Distance getCm(Distance d) {
		new Distance(length : Unit.convertUnit(d, Unit.cm), unit : Unit.cm)
	}
	
	static Distance getM(Number n) { new Distance(length : n, unit : Unit.m) }
	
	static Distance getM(Distance d) {
		new Distance(length : Unit.convertUnit(d, Unit.m), unit : Unit.m)
	}
	
	static Distance getKm(Number n) { new Distance(length : n, unit : Unit.km) }
	
	static Distance getKm(Distance d) {
		new Distance(length : Unit.convertUnit(d, Unit.km), unit : Unit.km)
	}
	
	static Distance getYd(Number n) { new Distance(length : n, unit : Unit.yd) }
	
	static Distance getYd(Distance d) {
		new Distance(length : Unit.convertUnit(d, Unit.yd), unit : Unit.yd)
	}
	
	static Distance getMi(Number n) { new Distance(length : n, unit : Unit.mi) }
	
	static Distance getMi(Distance d) {
		new Distance(length : Unit.convertUnit(d, Unit.mi), unit : Unit.mi)
	}
}
