function sortNumbers(num1, num2, num3) {
    let largest, middle, smallest;

    if (num1 >= num2 && num1 >= num3) {
        largest = num1;
        if (num2 >= num3) {
            middle = num2;
            smallest = num3;
        } else {
            middle = num3;
            smallest = num2;
        }
    } else if (num2 >= num1 && num2 >= num3) {
        largest = num2;
        if (num1 >= num3) {
            middle = num1;
            smallest = num3;
        } else {
            middle = num3;
            smallest = num1;
        }
    } else {
        largest = num3;
        if (num1 >= num2) {
            middle = num1;
            smallest = num2;
        } else {
            middle = num2;
            smallest = num1;
        }
    }

    alert(`Sorted numbers: ${largest}, ${middle}, ${smallest}`);
}

sortNumbers(0, -1, 4); 
