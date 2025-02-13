function areaoftriangle(side1,side2,side3){
    s=(side1+side2+side3)/2;
    area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
}
console.log(areaoftriangle(5,6,7));