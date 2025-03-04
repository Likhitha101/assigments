class Bus {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
      this.make = make;
      this.model = model;
      this.year = year;
    }
  }
  
  const myBus = new Bus("SuperDeluxe", "250XS", 2019);
  
  console.log("Make:", myBus.make);     
  console.log("Model:", myBus.model);   
  console.log("Year:", myBus.year);     
  