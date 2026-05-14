function checkDay(day) {
  switch (day.toLowerCase()) {
    case "monday":
    case "tuesday":
    case "wednesday":
    case "thursday":
    case "friday":
      console.log(day + " is a Weekday");
      break;
    
    case "saturday":
    case "sunday":
      console.log(day + " is a Weekend");
      break;
    
    default:
      console.log(day + " is not a valid day");
  }
}


checkDay("Monday");
checkDay("Friday");
checkDay("Saturday");
checkDay("Sunday");
checkDay("Funday");
