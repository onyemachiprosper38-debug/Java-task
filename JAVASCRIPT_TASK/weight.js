const prompt = require("prompt-sync") ();
const weight = Number(prompt("Enter weight (in kg) "));

const height = Number(prompt("Enter Height (in meters) "))

 let bmi = weight / (height * height);

console.log(bmi);


   if (bmi < 18.5) {
   console.log("You are underweight ");

}
else if (bmi >= 18.5 &&  bmi <= 24.9){
  console.log("Your weight is normal ");

 }

else if (bmi >= 25 && bmi <= 29.9){
console.log("You are overweight ");

}
else if (bmi >= 30){
console.log("obese ");
}
  
