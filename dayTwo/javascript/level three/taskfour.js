const prompt = require("prompt-sync")();

const number = Number(prompt("Enter a number to see it's multiplication table\nEnter number:"))

console.log(`----------------------${number}x Multiplication Table----------------------\n`)
let count = 1
 for(;count <=12;count++){
    multiplication = number * count
    console.log(`\t\t${number}\t x \t${count}\t = \t${multiplication} `)
}
