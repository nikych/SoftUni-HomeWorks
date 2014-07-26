function findLargestSumOfDigits(args) {
    var maxSum = 0,
        result,
        currentNum,
        currentSum;

    if (arguments.length < 1) {
        return undefined;
    }

    for (var i = 0; i < args.length; i++) {
        if (parseInt(args[i]) !== args[i]) {
            return undefined;
        }
        currentNum = Math.abs(args[i]).toString();
        currentSum = 0;
        for (var j = 0; j < currentNum.length; j++) {
            currentSum += Number(currentNum[j]);
        }

        if (currentSum >= maxSum) {
            result = args[i];
            maxSum = currentSum;
        }
    }

    return result;
}
console.log(findLargestSumOfDigits([5, 10, 15, 111]));
console.log(findLargestSumOfDigits([33, 44, -99, 0, 20]));
console.log(findLargestSumOfDigits(['hello']));
console.log(findLargestSumOfDigits([5, 3.3]));