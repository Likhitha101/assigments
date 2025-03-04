var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Pink"] = 1] = "Pink";
    Color[Color["White"] = 2] = "White";
    Color[Color["Blue"] = 3] = "Blue";
})(Color || (Color = {}));
var selectedColor = Color.Pink;
console.log("Selected color: ".concat(selectedColor));
console.log("Selected color name: ".concat(Color[selectedColor]));
