class Counter {
  private var value: BigInt = 0
  def increment() { value += 1}
  def current() = value
}

val myCounter = new Counter()
myCounter.increment()

println("Value is: " + myCounter.current)
