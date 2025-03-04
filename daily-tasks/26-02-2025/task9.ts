enum Color {
    Red,
    Pink,
    White,
    Blue
}

let selectedColor: Color = Color.Pink;
console.log(`Selected color: ${selectedColor}`); 
console.log(`Selected color name: ${Color[selectedColor]}`);
