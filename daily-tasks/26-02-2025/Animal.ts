class Animal {
    name: string;
    species: string;

    constructor(name: string, species: string) {
      this.name = name;
      this.species = species;
    }
  }
  
  class Tiger extends Animal {
    roar() {
      console.log(`The tiger named ${this.name} is roaring.`);
    }
  }
  const myTiger = new Tiger("Saber", "Bengal Tiger");
  
  
  myTiger.roar(); 
  