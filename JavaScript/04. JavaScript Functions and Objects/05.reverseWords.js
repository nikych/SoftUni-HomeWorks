function reverseWordsInString(str) {
    var arrStrings = str.split(' '),
        result = '',
        word,
        i,
        j;

    for(i = 0; i < arrStrings.length; i++) {
        word = arrStrings[i];
        for(j = word.length-1; j >= 0; j--) {
            result += word[j];
        }

        result += ' ';
    }

    console.log(result);
}

reverseWordsInString('Hello, how are you.');
reverseWordsInString('Life is pretty good, isn’t it?');