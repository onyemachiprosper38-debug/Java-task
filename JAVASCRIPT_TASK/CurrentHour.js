const prompt = require("prompt-sync") ();
const current = number(prompt("Enter current hour (0-23): ");
    

    if (currentHour <= 11) {
    console.log("Good Morning!!! ");
 }

  else if (currentHour <= 17) {
   console.log("Good Afternoon!!! ");
}

 else if (currentHour <= 21){
  console.log("Good Eveninng!!! ");
}
   
 else if (currentHour <= 24 ){
 console.log("Good Night!!! ");

 }
    
