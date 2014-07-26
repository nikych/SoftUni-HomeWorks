function findNthDigit(args) {
    var position = args[0],
        number = args[1] + '';


    if(number[number.length - position] !== '.') {
        console.log(number[number.length-position])
    }
    else if(number.length === 1 || number.length === position) {
        console.log(number[0]);
    }
    else if(number.indexOf('.') > 0) {
        console.log(number[number.length - position - 1]);
    }
    else {
        console.log("The number doesn’t have " + position + " digits")
    }
}

findNthDigit([1, 6]);
findNthDigit([2, -55]);
findNthDigit([6, 923456]);
findNthDigit([3, 1451.78]);
findNthDigit([6, 888.88]);