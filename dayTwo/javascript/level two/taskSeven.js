const prompt = require("prompt-sync")();

let password = String(prompt("Enter a password "))

if(password === "admin123"){
    console.log(`Password Success!`)
}
else{
    console.log(`$Error! Invalid Password`)
}
