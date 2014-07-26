function soothsayer(work,language,city,car){
    return "You will work "+work[1]+" years on "+language[3]+".\nYou will live in "+city[4]+" and drive "+car[4];
}
console.log(soothsayer([3, 5, 2, 7, 9], ["Java", "Python", "C#", "JavaScript", "Ruby"],
    ["Silicon Valley","London", "Las Vegas", "Paris", "Sofia"],["BMW","Audi","Lada","Skoda","Opel"]));