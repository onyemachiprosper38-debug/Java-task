const prompt = require("prompt-sync")()
let number = prompt("\nEnter a number");
if (number % 2 == 0){
console.log(number, " is Even number ")
}
else{
    console.log(number, " is Odd number")
    }
