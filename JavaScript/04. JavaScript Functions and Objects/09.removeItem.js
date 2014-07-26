Array.prototype.removeItem = function (value) {
    var items = this.slice(0),
        newArray = [],
        i;

    for(i = 0; i < items.length; i++) {
        if(items[i] === value) {
            continue;
        }
        newArray.push(items[i]);
    }

    return newArray;
};

var arr = [1, 2, 1, 4, 1, 3, 4, 1, 111, 3, 2, 1, '1'];
var newArr = arr.removeItem(1);
console.log(newArr);

var arr = ['hi', 'bye', 'hello' ];
var newArr = arr.removeItem('bye');
console.log(newArr);
