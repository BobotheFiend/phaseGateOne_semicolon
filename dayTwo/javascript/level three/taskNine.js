
for (let count = 1; count <= 10; count++){
    for (let inner = count; inner >= 1; inner--){
        process.stdout.write("*", end="")
    }
    console.log()
}
