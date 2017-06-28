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

  // def nameMatch(name: Option[String]): Boolean = name match {
  // }

  def main(args: Array[String]) = {
    val hyphenName = HybridName.apply("Keith", "Cissell")
    println(hyphenName)
    val tupleName = HybridName.unapply(hyphenName)
    println(tupleName)
    //val nonHyphen = HybridName.unapply("Georgia")
    //println(nonHyphen)
  }

}
