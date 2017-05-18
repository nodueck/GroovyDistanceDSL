package model

class Distance implements Comparable{
	
	BigDecimal length
	Unit unit

	Distance plus(Distance operand) {
		def newLength = this.length + Unit.convertUnit(operand, this.unit)
		new Distance(length : newLength, unit : this.unit)
	}
	
	
	Distance minus(Distance operand) {
		def newLength = this.length - Unit.convertUnit(operand, this.unit)
		new Distance(length : newLength, unit : this.unit)
	}
	
	int compareTo(other) {
		if(this.unit == other.unit)
			return this.length <=> other.length
		return this.length <=> Unit.convertUnit(other, this.unit)
	}

	String toString() {
		"$length $unit.name"
	}

}
