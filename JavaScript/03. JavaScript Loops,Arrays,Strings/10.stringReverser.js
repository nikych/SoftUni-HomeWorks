function reverseString(value){
    var arr = [];

    for (var i = 0; i <= value.length; i++) {
        arr.push(value.charAt(value.length - i))
    }

    return arr.join('');
}

console.log(reverseString('sample'));
console.log(reverseString('softUni'));
console.log(reverseString('java script'));