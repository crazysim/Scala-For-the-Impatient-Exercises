class Time(val hours: Int, val minutes: Int) {
  def before(other: Time) = {
    if ((other.hours * 60 + other.minutes) > hours * 60 + minutes) {
      true
    } else {
      false
    }
  }
}

println("Is 2:45 before 3:45? : " + new Time(2,45).before(new Time(3,45)))
println("Is 4:15 before 3:45? : " + new Time(4,15).before(new Time(3,45)))
