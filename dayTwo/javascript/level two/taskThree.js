const prompt = require("prompt-sync")();

let userNumber = Number(prompt("Enter a Score: "))

if(userNumber >= 50 && userNumber <= 100){
    console.log(`${userNumber} Student passed!`)
    }
else if (userNumber >= 0 && userNumber < 50){
    console.log(`${userNumber} Student Failed!`)
}
else{
    console.log("Invalid Grade Score!")
}
