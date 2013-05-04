package parser

trait IParseStrategy {
	def parseBalance(company:ICompanyProvider): Option[BalanceValues] ;
	def parsePrice(company:ICompanyProvider): PriceValues ;
}