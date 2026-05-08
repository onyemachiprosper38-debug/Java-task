const prompt = require("prompt-sync") ();
const hour = number(prompt("Enter hour : "))

   const minutes = number(prompt("Enter minutes: ");

    const hourTwo = number(prompt("Enter hour ");

   const minutesTwo = number("enter minutes ");
   
  console.log(hour + ":" + minutes);

    console.log(hourTwo + ":" + minutesTwo);
    
    let finalHour = hour + hourTwo;

    let finalMinute = minutes + minutesTwo;

    if (finalMinute >= 60) {
   finalMinute = finalMinute - 60;
    finalHour = finalHour + 1; 
  
}
  else if (finalHour <= 12) {
    finalHour = finalHour - 12; 
 } 

