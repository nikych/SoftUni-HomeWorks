function findMostFreqWord(input){
    var punctuation = ['"', "'", ",", ";", ".", "+"];
    var inp = input.split(" ");
    var finArray = [];
    var wordArray = [];
    var numArray = [];
    for (var i = 0; i < inp.length; i++) {
        for (var j = 0; j < punctuation.length; j++) {
            while (inp[i].indexOf(punctuation[j]) != -1) {
                inp[i] = inp[i].replace(punctuation[j], "");
            };
        };
    };
    for (var i = 0; i < inp.length; i++) {
        var result = 0;
        for (var j = 0; j < inp.length; j++) {
            if (inp[i].toLowerCase() == inp[j].toLowerCase()) {
                result += 1;
            };
        };
        finArray.push({
            name: inp[i].toLowerCase(),
            count: result
        });
    };
    for (var i = 0; i < finArray.length; i++) {
        for (var j = 0; j < finArray.length; j++) {
            if (finArray[i].name == finArray[j].name && j != i) {
                finArray.splice(j, 1)
            };
        };
    };
    var largestIndex = 0;
    var largestIndexArr = [];
    for (var i = 0; i < finArray.length; i++) {
        if (finArray[i].count > largestIndex) {
            largestIndex = finArray[i].count;
        }
    }
    for (var i = 0; i < finArray.length; i++) {
        if (finArray[i].count == largestIndex) {
            wordArray.push(finArray[i].name);
            numArray.push(finArray[i].count)
        };
    };
    for (var i = 0; i < wordArray.length; i++) {
        return wordArray[i] + " -> " + numArray[i] + ' times';
    };
}

console.log(findMostFreqWord('in the middle of the night'));
console.log(findMostFreqWord('Welcome to SoftUni. Welcome to Java. Welcome everyone.'));
console.log(findMostFreqWord('Hello my friend, hello my darling. Come on, come here. Welcome, welcome darling.'));