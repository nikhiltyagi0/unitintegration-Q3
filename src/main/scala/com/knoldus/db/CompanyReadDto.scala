package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  val TOTHEKNEWCompany: Company = Company("TOTHENEW", "knoldus@gmail.com", "Noida")
  val ACCENTURECompany: Company = Company("ACCENTURE", "philips@gmail.com", "Noida")
  val Companies: HashMap[String, Company] = HashMap("TOTHENEW" -> TOTHEKNEWCompany, "ACCENTURE" -> ACCENTURECompany)

  def getCompanyByName(name: String): Option[Company] = Companies.get(name)

}
