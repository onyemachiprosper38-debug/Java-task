 const menu = """ 
Welcome to income tax filing status:
0. single filers:
1. married filing jointly or qualified widow(er):  
2. married filing separately:
3. head of household:
                        
 """;

     
    console.log(menu);
 const prompt = require("prompt-sync") ();
const filingStatus = number(prompt("Enter filing status"))
 

 if (filingStatus == 0){
 let filingleStatus = """
   Single statusS :

    10%       $0-$8,350 
    15%   $8,351-$33,950
    25%  $33,951-$82,250
    28%  $82,251-$171,550
    33% $171,551-$372,950
    35%    $372,951+
""";
console.log(singleStatus);
 }

else if (filingStatus == 1){
let MarriedFilingJointlyOrQualifiedWidow = """
Married filing jointly qualified widow(er) status:
    
    10%        $0-$16,700
    15%   $16,701-$67,900
    25%   $67,901-$137,050
    28%  $137,051-$208,850
    33%  $208,851-$372,950
    35%      $372,951+
""";
console.log(MarriedFilingJointlyOrQualifiedWidow);

 }

else if (filingStatus == 2){
let MarriedFilingSeparately = """
Married filing separately satus:

    10%       $0-$8,350
    15%   $8,351-$33,950
    25%  $33,951-$68,525
    28%  $68,526-$104,425
    33% $104,426-$186,475
    35%     $186,476+

""";
console.log(MarriedFilingSeparately);
 }

else if (filingStatus == 3){
let HeadOfhouseold = """
Head of household status:

    10%        $0-$11,950
    15%   $11,951-$45,500
    25%   $45,501-$117,450
    28%  $117,451-$190,200
    33%  $190,201-$372,950
    35%     $372,951+


""";
console.log(HeadOfhouseold);
 }

