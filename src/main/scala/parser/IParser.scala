package parser

trait IParser {
	def gewinne: List[YearValueList]
	def umsatz: Int
	def dividenden: List[YearValueList]
	def eigenkapital: Int
	def kurs:Double
}