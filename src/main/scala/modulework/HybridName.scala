package modulework

object HybridName {

  def apply(f: String, l: String): String = f + "-" + l

  def unapply(h: String): Option[(String,String)] = {
    val hSplit = h.split("-")
    if (hSplit.size == 2) Some((hSplit(0), hSplit(1))) else None
  }

}

import modulework._
object HybridNameTest {

  def nameMatch(name: String): Boolean = name match {
    case HybridName(f, l) if f == "Cissell" || l == "Cissell" => true
    case _ => false
  }

  def main(args: Array[String]) = {
    val hyphenName = HybridName.apply("Keith", "Cissell")
    println(hyphenName + ": " + nameMatch(hyphenName))
    val HybridName(fName, lName) = hyphenName
    println(s"First Name: $fName\nLast Name: $lName")
    val nonHyphen = HybridName.unapply("Georgia")
    println(nonHyphen)
  }

}
