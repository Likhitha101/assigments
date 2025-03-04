var Student = /** @class */ (function () {
    function Student(name, age) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }
    return Student;
}());
var student1 = new Student("sonia", 22);
var student2 = new Student("Banti", -7);
console.log("Student 1 - Name:", student1.name, "Age:", student1.age);
console.log("Student 2 - Name:", student2.name, "Age:", student2.age);
