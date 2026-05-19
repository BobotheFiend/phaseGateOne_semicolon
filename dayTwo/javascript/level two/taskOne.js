const prompt = require("prompt-sync")();

let userNumber = Number(prompt("Enter a number: "))

if(userNumber % 2 == 0){
    console.log(`${userNumber} is an Even Number`)
    }
else{
    console.log(`${userNumber} is an Odd Number!`)
}
