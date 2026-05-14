const prompt = require("prompt-sync")()

function value(number) {
if (number == 0){
console.log("the number is zero")
}

else if (number < 0){
console.log("the number is negative")
}
}
let number = prompt("Enter number");
value(number);

