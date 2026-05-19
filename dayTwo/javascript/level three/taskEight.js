const prompt = require("prompt-sync")();

console.log("\nThe Sum of numbers")
let sum_input = 0
let user_input = Number(prompt("Enter a number [input 0 to stop]:"))
if (user_input != 0){
    while(user_input != 0){
        sum_input += user_input
        user_input = Number(prompt("Enter a number to get its sum[0 to stop]: "))
        console.log(`${user_input} +`)
    }
}
console.log("=",sum_input)
