function largestnumber(num1,num2){
    if(num1>num2){
        console.log(`${num1} is the largest number`);
    }
    else if(num1<num2){
        console.log(`${num2} is the largest number`);
    }
    else{
        console.log("Both numbers are equal");
    }
}
largestnumber(5,7);