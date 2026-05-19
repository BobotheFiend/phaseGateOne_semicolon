const prompt = require("prompt-sync")();

let day = Number(prompt("Enter a day of the week[1-7]: "))

switch(day){
    case 1: console.log("Monday")
    case 2: console.log("Tuesday")
    case 3: console.log("Wednesday")
    case 4: console.log("Thursday")
    case 5: console.log("Friday")
    case 6: console.log("Saturday")
    case 7: console.log("Sunday") 
    default: console.log("Invalid Day")
}
