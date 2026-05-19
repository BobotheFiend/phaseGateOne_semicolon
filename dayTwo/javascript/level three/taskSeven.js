const prompt = require("prompt-sync")();

let sum = 0;
let count = 1
 for(;count <= 5;count++){
    let number = Number(prompt("Enter a number to see it's multiplication table\nEnter number:"))
    sum +=  number
    console.log(`${number} +`)
}
console.log("=", sum)
