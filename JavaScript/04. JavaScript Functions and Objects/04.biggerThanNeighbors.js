function biggerThanNeighbors(position, arr) {

    if(arr[position] === undefined) {
        console.log('invalid index');
    }
    else if(position === 0 || position === arr.length-1) {
        console.log('only one neighbor');
    }
    else if(arr[position]) {
        if(arr[position] > arr[position - 1] && arr[position] > arr[position + 1]) {
            console.log('bigger');
        }
        else {
            console.log('not bigger');
        }
    }
}

biggerThanNeighbors(2, [1, 2, 3, 3, 5]);
biggerThanNeighbors(2, [1, 2, 5, 3, 4]);
biggerThanNeighbors(5, [1, 2, 5, 3, 4]);
biggerThanNeighbors(0, [1, 2, 5, 3, 4]);