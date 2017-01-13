import week3.{Cons, Nil}

object nth {

  def nth[T](index: Int, list: List[T]): T =
    if(list.isEmpty) throw new IndexOutOfBoundsException
    else if (index == 0) list.head
    else nth(index - 1, list.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
  nth(2, list)

  nth(4, list)
  //nth(-1, list)


}