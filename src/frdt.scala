import java.time.format.{DateTimeFormatter, FormatStyle}
import java.time.LocalDate
import java.util.Locale.*
import scala.collection.mutable.ListBuffer


val list: List[Any] = List(
  "a string",
  732, // число
  'c', // буква
  true, // булево значение
  () => "an anonymous function returning a string"
)

val listInt: List[Int] = List(
  1, 2, 89
)
def double(ints: List[Int]): List[Int] =
  val buffer = new ListBuffer[Int]()
  for i <- ints do
    buffer += i * 2
  buffer.toList

val oldNumbers = List(1, 2, 3)
val newNumbers = double(oldNumbers)
@main
def FrenchDate: Unit =
  var myList = List[Int]
  val now = LocalDate.now
  val df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(FRENCH)
  println(df.format(now))
  println(FRENCH.toString)
  list.foreach(element => println(element))
  double(listInt)

  for li <- listInt do {
    println(li)
  }

  for lAny <- list do
    println(lAny)



