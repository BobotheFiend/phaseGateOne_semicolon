const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "))

let number_holder = number

let count = 0

while(number != 0){

    extract = number % 10
 
    extractor_holder = (0 * 10) + extract
        count ++
    number /= 10
}

console.log(`Number is ${count} digits`)
