var Student = /** @class */ (function () {
    function Student(name, className) {
        this.name = name;
        this.className = className;
    }
    return Student;
}());
var myStudent = new Student("soni", "Class 7");
console.log("Name:", myStudent.name);
console.log("Class Name:", myStudent.className);
