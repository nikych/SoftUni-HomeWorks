function findMostFreqNum(value){
    var sorted = [];

    for (var i = 0; i < value.length - 1; i++) {
        var min = i;
        for (var j = i + 1; j < value.length; j++) {
            if (value[j] < value[min]) {
                min = j;
            }
        }

        if (min != i) {
            var temp = 0;
            temp = value[i];
            value[i] = value[min];
            value[min] = temp;
        }
    }

    for (var i = 0; i < value.length; i++) {
        sorted.push(value[i]);
    }

    var currentSequence = 1,
    longestSequence = 1,
    mostFrequentNum = sorted[0];

    for (var i = 0; i < sorted.length - 1; i++) {
        if (sorted[i] == sorted[i + 1]) {
            currentSequence++;
            if (longestSequence <= currentSequence) {
                longestSequence = currentSequence;
                mostFrequentNum = sorted[i];
            }
        }
        else {
            currentSequence = 1;
        }
    }

    return mostFrequentNum + " (" + longestSequence + " times)";
}

console.log(findMostFreqNum([4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3]));
console.log(findMostFreqNum([2, 1, 1, 5, 7, 1, 2, 5, 7, 3, 87, 2, 12, 634, 123, 51, 1]));
console.log(findMostFreqNum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]));