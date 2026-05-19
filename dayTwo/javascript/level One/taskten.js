const prompt = require("prompt-sync")();

let numberOne = Number(prompt("Enter a number: "))
let numberTwo = Number(prompt("Enter a number: "))
let numberThree = Number(prompt("Enter a number: "))

let average = (numberOne + numberTwo + numberThree) / 3

console.log(`The avearge = ${average}`)
