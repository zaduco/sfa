package parser

 

class MockParser extends IParser {

  val yvlist = List(new YearValueList(2011,111),new YearValueList(2012,222),new YearValueList(2013,333))
  
  def gewinne  = yvlist
  def umsatz: Int = 11111
  def dividenden  = yvlist
  def eigenkapital: Int = 22222
  def kurs: Double = 4.5
}