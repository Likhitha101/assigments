class Student {
    name: string;
    className: string;
    constructor(name: string, className: string) {
      this.name = name;
      this.className = className;
    }
  }
  
  const myStudent = new Student("soni", "Class 7");
  console.log("Name:", myStudent.name);      
  console.log("Class Name:", myStudent.className);
  