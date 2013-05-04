package parser

import datamodel.ICompany

trait ICompanyProvider {

  def getFundiParseURL ():String
  def getStockParseURL ():String
  
  def getCompany :ICompany
  
}