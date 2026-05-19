const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "))


console.log(`The square of ${number} = ${Math.pow(number,2)}`)
