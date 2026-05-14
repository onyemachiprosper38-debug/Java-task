const prompt = require("prompt-sync")()

function user(username, password) {
  if (password == "Lvcky33$" && username == "onyemachi") {
    console.log("Login successful✅");
  } else {
    console.log("Invalid Login❌");
  }
}

const username = prompt("\nEnter Username: ");
const password = prompt("\nEnter password: ");
user(username, password);
