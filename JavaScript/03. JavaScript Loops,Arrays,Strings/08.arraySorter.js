function sortArray(value){
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

    return sorted.join(', ');
}

console.log(sortArray([5, 4, 3, 2, 1]));
console.log(sortArray([12, 12, 50, 2, 6, 22, 51, 712, 6, 3, 3]));