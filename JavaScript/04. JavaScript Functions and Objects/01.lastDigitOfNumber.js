function lastDigitAsText(value) {
    var digit = value % 10,
        name;

    if(digit < 0){
        digit*=-1;
    }

    switch (digit) {
        case 0: name = 'Zero';
            break;
        case 1: name = 'One';
            break;
        case 2: name = 'Two';
            break;
        case 3: name = 'Three';
            break;
        case 4: name = 'Four';
            break;
        case 5: name = 'Five';
            break;
        case 6: name = 'Six';
            break;
        case 7: name = 'Seven';
            break;
        case 8: name = 'Eight';
            break;
        case 9: name = 'Nine';
            break;
    }

    console.log(name);
}

lastDigitAsText(6);
lastDigitAsText(-55);
lastDigitAsText(133);
lastDigitAsText(14567);