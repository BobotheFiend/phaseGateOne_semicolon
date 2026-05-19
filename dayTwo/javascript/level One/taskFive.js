const prompt = require("prompt-sync")();

let celsius = Number(prompt("Enter the temperature in celcius: "))

let conversion = (celsius * 9/5) + 32
console.log(`${celsius}*C = ${conversion}f`)
