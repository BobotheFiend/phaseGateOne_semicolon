const prompt = require("prompt-sync")();

let userNumber = Number(prompt("Enter a number: "))

if(userNumber > 0){
    console.log(`${userNumber} is a Positive Number`)
    }
else if (userNumber < 0){
    console.log(`${userNumber} is a Negative Number!`)
}
else{
    console.log("ZERO!")
}
