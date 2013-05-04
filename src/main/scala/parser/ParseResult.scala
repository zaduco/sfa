package parser

case class YearValueList(year:Int, value:Int)
case class PriceValues(kurs: Double)
case class BalanceValues(gewinne: List[YearValueList], umsatz: Int, dividenden: List[YearValueList], eigenkapital: Int)
