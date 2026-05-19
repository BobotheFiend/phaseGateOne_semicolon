const prompt = require("prompt-sync")();

let firstNumber = Number(prompt("Enter a number: "))
let secondNumber = Number(prompt("Enter a number: "))

console.log(`${firstNumber} + ${secondNumber} = ${firstNumber + secondNumber}`)
