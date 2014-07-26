var sofia = new Date();
var gmt = sofia.getTime() + (sofia.getTimezoneOffset() * 60000);
var gmtime = new Date(gmt);

function convertTime(date) {
    var hours = date.getHours();
    var mins = date.getMinutes();

    if (mins < 10) {
        mins = "0" + mins
    }
    var hm = hours + ":" + mins;
    return hm
}

function timeZone(offset) {
    var milisecs = gmt + (offset * 3600000);
    var time = new Date(milisecs);
    var hmFormated = convertTime(time);
    return hmFormated;
}

var tokyo = timeZone(+9);
var saoPaulo = timeZone(-3);

console.log("Sofia - " + convertTime(sofia));
console.log("GMT - " + convertTime(gmtime));
console.log("Tokyo - " + tokyo);
console.log("Sao Paulo - " + saoPaulo);