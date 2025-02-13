
let randomNumber =Math.floor( Math.random()*10);
guessnum=parseInt(prompt("Enter a number between 1 and 10: "));
if(guessnum==randomNumber){
    document.writeln("Good work");
}
else{
    document.writeln("Not matched");
}
console.log(randomNumber)
