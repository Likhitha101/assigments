function daysUntilChristmas() {
    let today = new Date();
    let currentYear = today.getFullYear();
    let christmasDate = new Date(currentYear, 11, 25); 
    if (today > christmasDate) {
        christmasDate = new Date(currentYear + 1, 11, 25);
    }
    let diffTime = christmasDate - today;
    let diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24)); 
    
    console.log("There are " + diffDays + " days left until Christmas!");
}
daysUntilChristmas();
