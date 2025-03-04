type Person = {
    name: string;
    age: number;
    isStudent: boolean;
};

let person1: Person = {
    name: "Alice",
    age: 25,
    isStudent: false
};

console.log(`Person: ${person1.name}, Age: ${person1.age}, Student: ${person1.isStudent}`);
