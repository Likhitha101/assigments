class Student {
    name: string;
    rollNumber: number | undefined;
 
    constructor(name: string, rollNumber: number) {
      this.name = name;
      this.rollNumber = rollNumber;
    }
  
  
    constructor(name: string) {
      this.name = name;
    }
  }
  

  const studentWithRollNumber = new Student("Mateo Ishita", 11);
  const studentWithoutRollNumber = new Student("Dvsch Gbjpiij");
  
  console.log("Student with Roll Number:");
  console.log("Name:", studentWithRollNumber.name);
  console.log("Roll Number:", studentWithRollNumber.rollNumber);
  
  console.log("\nStudent without Roll Number:");
  console.log("Name:", studentWithoutRollNumber.name);
  console.log("Roll Number:", studentWithoutRollNumber.rollNumber); 
  