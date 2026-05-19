const prompt = require("prompt-sync")();

let yearInput = Number(prompt("Enter a year: "))

if(yearInput % 4 == 0 || yearInput % 400 == 0){
    console.log(`${yearInput} is a Leap year!`)
}
else{
    console.log(`${yearIinput} Not a Leap year!`)
}
