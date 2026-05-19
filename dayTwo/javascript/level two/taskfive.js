const prompt = require("prompt-sync")();

let firstNumber = Number(prompt("Enter a number: "))
let secondNumber = Number(prompt("Enter a number: "))
let thirdNumber = Number(prompt("Enter a number: "))

let largest = firstNumber

if(secondNumber > largest){
    largest = secondNumber
    console.log(`The largest is ${secondNumber}`)
}
else if(thirdNumber > largest){
    largest = thirdNumber
    console.log(`The largest is ${thirdNumber}`)
}
else{
    console.log(`The largest is ${firstNumber}`)
}
