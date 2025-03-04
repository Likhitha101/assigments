var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Car = /** @class */ (function () {
    function Car(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    Car.prototype.start = function () {
        console.log("The ".concat(this.make, " ").concat(this.model, " (Year: ").concat(this.year, ") is starting."));
    };
    return Car;
}());
var SUV = /** @class */ (function (_super) {
    __extends(SUV, _super);
    function SUV(make, model, year, offRoadCapable) {
        var _this = _super.call(this, make, model, year) || this;
        _this.offRoadCapable = offRoadCapable;
        return _this;
    }
    SUV.prototype.toggleOffRoadMode = function () {
        if (this.offRoadCapable) {
            console.log("The ".concat(this.make, " ").concat(this.model, " is now in off-road mode."));
        }
        else {
            console.log("The ".concat(this.make, " ").concat(this.model, " is not suitable for off-road driving."));
        }
    };
    return SUV;
}(Car));
var mySUV = new SUV("Toyota", "Fortuner", 2023, true);
mySUV.start();
mySUV.toggleOffRoadMode();
