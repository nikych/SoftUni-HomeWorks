function createArray(value){
    var array = new Array(20);
    for (var i = 0; i < array.length; i++) {
        array[i] = i * 5;
    }
    
    return array.join(", ");
}

console.log(createArray());