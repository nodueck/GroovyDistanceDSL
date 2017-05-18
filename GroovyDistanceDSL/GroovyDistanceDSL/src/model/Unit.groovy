package model

class Unit {
	def ratio
	String name
	
	static def convertUnit(Distance d, Unit newUnit) {
		def factor = ratioTable[d.unit.ratio][newUnit.ratio]
		if(factor)
			return d.length * factor
		else
			return d.length / ratioTable[newUnit.ratio][d.unit.ratio]
	}
	
	static ratioTable = [
	//        mm,         cm,          m,        km,    y,   mi
	[          1,          0,          0,         0,    0, 0 ],    // mm
	[         10,          1,          0,         0,    0, 0 ],    // cm
	[        1e3,        1e2,          1,         0,    0, 0 ],    //  m
	[        1e6,        1e5,        1e3,         1,    0, 0 ],    // km
	[      914.4,      91.44,     0.9144, 0.9144e-3,    1, 0 ],    // yd
	[ 1.609344e6, 1.609344e5, 1.609344e3,  1.609344, 1760, 1 ],    // mi
	]
	
	public static final mm = new Unit(ratio : 0, name : "millimeter")
	public static final cm = new Unit(ratio : 1, name : "centimeter")
	public static final  m = new Unit(ratio : 2, name : "meter")
	public static final km = new Unit(ratio : 3, name : "kilometer")
	public static final yd = new Unit(ratio : 4, name : "yard")
	public static final mi = new Unit(ratio : 5, name : "mile(s)")
}
