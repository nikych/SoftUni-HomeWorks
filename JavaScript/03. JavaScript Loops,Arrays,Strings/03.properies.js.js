function displayProperties(value){
    var properties = [];
    for (var info in window) {
        properties.push(info);
    }

    properties.sort();

    return properties.join('/n');
}

console.log(displayProperties());