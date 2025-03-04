class Person {
    name: string;
    age: number;
    constructor(name: string, age: number) {
      this.name = name;
      this.age = age;
    }
  }
  
  class Employee extends Person {
    employeeId: string;
  
    constructor(name: string, age: number, employeeId: string) {
      super(name, age);
  
      this.employeeId = employeeId;
    }
  }
  
  const myEmployee = new Employee("Elmira Ugochi", 40, "EPM-0012");
  console.log("Name:", myEmployee.name);          
  console.log("Age:", myEmployee.age);      
  console.log("Employee ID:", myEmployee.employeeId);
  