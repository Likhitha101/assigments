var today=new Date();
var dd=today.getDate();
var mm=today.getMonth()+1;
var yyyy=today.getFullYear();
if(dd<10){
    dd='0'+dd;
}
if(mm<10){
    mm='0'+mm;
}
curdate=mm+'-'+dd+'-'+yyyy;
console.log("Current date: "+curdate);
curdate2=mm+'/'+dd+'/'+yyyy;
console.log("Current date: "+curdate2);
curdate3=dd+'-'+mm+'-'+yyyy;
console.log("Current date: "+curdate3);
curdate4=dd+'/'+mm+'/'+yyyy;
console.log("Current date: "+curdate4);