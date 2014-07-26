function printNumbers(n){
    var nums = [];
    for (var i = 1; i <= n; i++) {
        if ((i % 4 == 0) || (i % 5 == 0)) {
            continue;
        }
        nums.push(i);
    }
    return nums.join(',');
}

console.log(printNumbers(20));
console.log(printNumbers(1));
console.log(printNumbers(13));