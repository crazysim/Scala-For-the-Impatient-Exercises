class Time(val hours: Int, val minutes: Int) {
  private var min_since_midnight = hours * 60 + minutes
  def before(other: Time) = {
    if (min_since_midnight < other.min_since_midnight) {
      true
    } else {
      false
    }
  }
}

println("Is 2:45 before 3:45? : " + new Time(2,45).before(new Time(3,45)))
println("Is 4:15 before 3:45? : " + new Time(4,15).before(new Time(3,45)))
