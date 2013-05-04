package parser

import java.util.Date
import java.text.SimpleDateFormat

class ParseComponent(parseStrategy: IParseStrategy) {
  def doParseBalance(companyprov: ICompanyProvider): Option[BalanceValues] = {
    val now = new Date
    val df = new SimpleDateFormat("yyyy")

    if (companyprov.getCompany.hasBalanceDataOfYear(df.format(now).toInt - 1)) {
      parseStrategy.parseBalance(companyprov)
    } else {
      None
    }
  }

  def doParsePrice(company: ICompanyProvider): PriceValues = {
    parseStrategy.parsePrice(company);
  }

}