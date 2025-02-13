function celsiusTofahrenheit(celsius) {
    let fahrenheit = (celsius * 9/5) + 32;
    console.log(`${celsius}°C is ${fahrenheit}°F`);
}

function fahrenheitTocelsius(fahrenheit) {
    let celsius = (fahrenheit - 32) * 5/9;
    console.log(`${fahrenheit}°F is ${celsius}°C`);
}

celsiusTofahrenheit(60);  
fahrenheitTocelsius(45);  
