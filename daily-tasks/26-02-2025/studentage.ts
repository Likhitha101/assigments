class Student {
    name: string;
    age: number;
    constructor(name: string, age: number) {
      this.name = name;
      if (age > 0) {
        this.age = age;
      } else {
        this.age = 0;
      }
    }
  }
  
  const student1 = new Student("sonia", 22);    
  const student2 = new Student("Banti", -7);  
  console.log("Student 1 - Name:", student1.name, "Age:", student1.age); 
  console.log("Student 2 - Name:", student2.name, "Age:", student2.age); 
  