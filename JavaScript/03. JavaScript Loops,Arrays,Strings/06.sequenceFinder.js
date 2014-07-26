function findMaxSequence(value){
    var currentSequence = 1, longestSequence = 1, maxSeqNum = value[0];

    for (var i = 1; i < value.length; i++) {
        if(value[i-1] == value[i]) {
            currentSequence++;
            if (currentSequence > longestSequence) {
                longestSequence = currentSequence;
                maxSeqNum = value[i];
            }
        }
        else {
            currentSequence = 1;
        }
    }

    var result = [];
    for (var i = 0; i < longestSequence; i++) {
        result.push(maxSeqNum);
    }

   return '[' + result.join(', ') + ']';
}

console.log(findMaxSequence([2, 1, 1, 2, 3, 3, 2, 2, 2, 1]));
console.log(findMaxSequence(['happy']));
console.log(findMaxSequence([2, 'qwe', 'qwe', 3, 3, '3']));