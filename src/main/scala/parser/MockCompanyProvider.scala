package parser

import datamodel.ICompany

class MockCompanyProvider(company: ICompany) extends ICompanyProvider {

  def getFundiParseURL(): String = ""
  def getStockParseURL(): String = ""

  def getCompany: ICompany = company
}