var Student = /** @class */ (function () {
    function Student(name, rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    return Student;
}());
var studentWithRollNumber = new Student("Mateo Ishita", 11);
var studentWithoutRollNumber = new Student("Dvsch Gbjpiij");
console.log("Student with Roll Number:");
console.log("Name:", studentWithRollNumber.name);
console.log("Roll Number:", studentWithRollNumber.rollNumber);
console.log("\nStudent without Roll Number:");
console.log("Name:", studentWithoutRollNumber.name);
console.log("Roll Number:", studentWithoutRollNumber.rollNumber);
