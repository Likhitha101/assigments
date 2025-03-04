var Engine = /** @class */ (function () {
    function Engine(horsepower, fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
    return Engine;
}());
var Car = /** @class */ (function () {
    function Car(make, model, year, engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    Car.prototype.start = function () {
        console.log("The ".concat(this.make, " ").concat(this.model, " (Year: ").concat(this.year, ") is starting."));
    };
    Car.prototype.printCarDetails = function () {
        console.log("Car Details:");
        console.log("Make: ".concat(this.make));
        console.log("Model: ".concat(this.model));
        console.log("Year: ".concat(this.year));
        console.log("Engine Details:");
        console.log("Horsepower: ".concat(this.engine.horsepower));
        console.log("Fuel Type: ".concat(this.engine.fuelType));
    };
    return Car;
}());
var myEngine = new Engine(200, "Gasoline");
var myCar = new Car("Audi", "A3", 2023, myEngine);
myCar.start();
myCar.printCarDetails();
