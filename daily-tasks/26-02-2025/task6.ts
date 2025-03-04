let someValue: unknown = "123";
let strLength: number = (someValue as string).length;
console.log(`Length of string: ${strLength}`);
let numString: string = "42";
let numValue: number = parseInt(numString);
console.log(`Converted number: ${numValue}`);
