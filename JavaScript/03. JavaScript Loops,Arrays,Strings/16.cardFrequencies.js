function findCardFrequency(value){
    var cards = value.split(' ');
    var cardsFaces = [];
    var cardsAppearance = [];
    var i;
    for (i = 0; i < cards.length; i += 1) {
        var currentCard = cards[i];
        var cardFace = currentCard[0];
        var cardCounter = 0;

        if (cardsFaces.indexOf(cardFace) > -1) {
            continue;
        }
        cardsFaces.push(cardFace);

        for (var j = i; j < cards.length; j++) {
            var targetCard = cards[j];
            var targetCardFace = targetCard[0];

            if (targetCardFace === cardFace) {
                cardCounter += 1;
            }
        }
        cardsAppearance.push(cardCounter);
    }

    for (i = 0; i < cardsFaces.length; i += 1) {
        var percentage = (cardsAppearance[i] / cards.length * 100).toFixed(2);

        if (cardsFaces[i] === '1') {
            console.log('10 -> ' + percentage + '%');

        } else {
            console.log(cardsFaces[i] + ' -> ' + percentage + '%');
        }
    }

}

console.log(findCardFrequency('8¦ 2¦ 4¦ 10¦ J¦ A¦ K¦ 10¦ K¦ K¦'));
console.log(findCardFrequency('J¦ 2¦ 2¦ 2¦ 2¦ 2¦ 2¦ J¦ 2¦'));
console.log(findCardFrequency('10¦ 10¦'));