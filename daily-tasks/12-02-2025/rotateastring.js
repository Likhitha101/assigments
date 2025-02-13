function rotateStringRight(str, interval) {
    let arr = str.split("");
    setInterval(() => {
        let lastChar = arr.pop(); 
        arr.unshift(lastChar); 
        console.log(arr.join("")); 
    }, interval);
}

rotateStringRight("digiterati", 500);
