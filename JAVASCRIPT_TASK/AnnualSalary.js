const prompt = require("prompt-sync") ();
const monthly salary = Number(prompt("Enter monthly salary: "));

double annualSalary = monthlySalary * 12;

double tax = 0;
if  (annualSalary <= 300000) {
   
   tax = 0;
}
  else if (annualSalary <=600000) {

 double taxableAmount = annualSalary - 300000;
 
  tax = taxableAmount * 0.15;
}
        
  else {
   double firstTax = 45000;

   double remaining = annualSalary - 600000;

   double secondTax = remaining * 0.25;

      tax = firstTax + secondTax;
}

        consloe.log("Annual Salary is: " + annualSalary);

       console.log("Tax to pay is: " + tax);
   }
