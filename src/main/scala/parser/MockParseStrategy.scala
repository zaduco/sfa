package parser
 

class MockParseStrategy(parser: IParser) extends IParseStrategy {

  def parseBalance(company: ICompanyProvider) :Option[BalanceValues] = Some(BalanceValues(parser.gewinne, parser.umsatz, parser.dividenden, parser.eigenkapital))
  def parsePrice(company: ICompanyProvider) :PriceValues = PriceValues(parser.kurs)

}