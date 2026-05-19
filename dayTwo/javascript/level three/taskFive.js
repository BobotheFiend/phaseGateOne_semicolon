const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number to see it's multiplication table\nEnter number:"))

console.log(`----------------------The factorial of ${number}----------------------\n`)
let factorial = 1;
let count = number
 for(;count >= 1;count--){
    factorial *= count
    console.log(`${count} x`)
}
console.log("=", factorial)
