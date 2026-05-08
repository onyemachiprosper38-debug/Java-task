const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a Number: "));

if (number > 1) {
    console.log("Positive");
} else {
    console.log("Not Positive");
}
