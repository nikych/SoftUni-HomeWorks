var _ = require("underscore");

var Person = (function () {

    var Person = function(firstName, lastName, age) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.age = age;
    };

    return Person;
})();

function group (object, value) {
    var grouped = _.groupBy(object, value.toLowerCase());
    _.each(grouped, function(key, item) {

        var result = 'Group ' + item + ' [ ';
        _.each(key, function(someKay) {
            result += someKay.firstname + ' ' + someKay.lastname + '(age ' + someKay.age + '), ';
        });
        result = result.substr(0, result.length-2) + ' ]';

        console.log(result);
    });
}

var persons = [];
persons.push(new Person("Scott", "Guthrie", 38));
persons.push(new Person("Scott", "Johns", 36));
persons.push(new Person("Scott", "Hanselman", 39));
persons.push(new Person("Jesse", "Liberty", 57));
persons.push(new Person("Jon", "Skeet", 38));

group(persons, 'firstName');


