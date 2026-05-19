const prompt = require("prompt-sync")();

let radius = Number(prompt("Enter a radius: "))

let radiusSquare = Math.pow(radius,2)
let circumference = Math.round(2 * (Math.PI * radiusSquare))

console.log(`The Circumfrence of a circle = ${circumference}`)
