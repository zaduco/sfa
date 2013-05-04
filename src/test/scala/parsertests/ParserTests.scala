package parsertests

import parser.MockParseStrategy
import parser.ParseComponent
import parser.MockCompanyProvider
import org.scalatest.FunSuite
import datamodel.MockCompany
import datamodel.MockCompanyEmpty
import parser.MockParser
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


class ParserTests extends FunSuite {

  test("Read data for single company for first time") {

    val mc = new MockCompany()

    val mcs = new MockParseStrategy(new MockParser())
    val cc = new ParseComponent(mcs)
    val mcpy = new MockCompanyProvider(mc)
    val balanceResult = cc.doParseBalance(mcpy)
    val priceResult = cc.doParsePrice(mcpy)

    assert(priceResult.kurs == 4.5)

    balanceResult match {
      case Some(x) => {
        assert(x.gewinne.length > 0)
        assert(x.dividenden.length > 0)
        assert(x.umsatz == 11111)
        assert(x.eigenkapital == 22222)
      }
      case None => assert(false)
    }

  }

  test("Read data for single company with existing balance data") {

    val mc = new MockCompanyEmpty()

    val mcs = new MockParseStrategy(new MockParser())
    val cc = new ParseComponent(mcs)
    val mcpy = new MockCompanyProvider(mc)
    val balanceResult = cc.doParseBalance(mcpy)
    val priceResult = cc.doParsePrice(mcpy)

    assert(priceResult.kurs == 4.5)

    balanceResult match {
      case Some(x) => assert(false)
      case None => assert(true)
    }

  }

}