const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number to see it's multiplication table\nEnter number:"))

console.log(`----------------------The Sum of ${number}----------------------\n`)
let sum = 0;
let count = 1
 for(;count <= number;count++){
    sum +=  count
    console.log(`${count} +`)
}
console.log("=", sum)
