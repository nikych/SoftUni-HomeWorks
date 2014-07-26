function countDivs(input) {
    var divs = 0,
        arr = input.split(' '),
        i;
    for(i = 0; i < arr.length; i++) {
        if(arr[i].indexOf('div') > 0) {
            divs++;
        }
    }

    console.log(divs);
}

countDivs(
    '<!DOCTYPE html> \
    <html> \
    <head lang="en"> \
        <meta charset="UTF-8"> \
            <title>index</title> \
            <script src="/yourScript.js" defer></script> \
        </head> \
        <body> \
            <div id="outerDiv"> \
                <div \
                class="first"> \
                    <div><div>hello</div></div> \
                </div> \
                <div>hi<div></div></div> \
                <div>I am a div</div> \
            </div> \
        </body> \
    </html> \
');