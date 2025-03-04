let numbers: number[] = [10, 20, 30, 40];
numbers.push(50);
console.log("After push:", numbers);
//removing last number
numbers.pop();
console.log("After pop:", numbers);

// Iterating through array
numbers.forEach(num => console.log(`Number: ${num}`));
