const prompt = require("prompt-sync")();

let price = Number(prompt("Enter the price: "))

let tax = price + (price * 0.10)

console.log(`The price of the item = ${price}\nThe total = ${price}\nThe tax amount to pay = ${price * 0.10}\nThe subtotal = ${tax}\n------------------Thank You!------------------`)
