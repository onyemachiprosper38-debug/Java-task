const account = {balance: 50, isBlock: "blocked"}

if (account.isBlock == "blocked"){
console.log("Account blocked")
}
else if (account.balance < 100){
console.log("Low Balance ")
}
else{
console.log("OK")
}
