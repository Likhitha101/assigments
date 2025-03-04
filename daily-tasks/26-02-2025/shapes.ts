class Shape {
    color: string;
    constructor(color: string) {
      this.color = color;
    }
  }
  
  class Circle extends Shape {
    radius: number;
    constructor(color: string, radius: number) {
      super(color);

      this.radius = radius;
    }
  }
  
  const myCircle = new Circle("Black", 7);
  console.log("Color:", myCircle.color);   
  console.log("Radius:", myCircle.radius); 
  