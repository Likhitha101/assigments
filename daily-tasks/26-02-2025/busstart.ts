class Bus {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
      this.make = make;
      this.model = model;
      this.year = year;
    }
    start() {
      console.log(`The ${this.make} ${this.model} (Year: ${this.year}) is starting.`);
    }
  }
  
  const myBus = new Bus("Volvo", "9400 B11R", 2019);
  myBus.start(); 
  