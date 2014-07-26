function findYoungestPerson (args) {
    var person = args[0],
        minAge = person.age,
        i;

    for(i = 1; i < args.length; i++) {
        if(minAge > args[i].age) {
            person = args[i];
            minAge = person.age;
        }
    }

    console.log('The youngest person is ' + person.firstname + ' ' + person.lastname);
}

var persons = [
    { firstname : 'George', lastname: 'Kolev', age: 32},
    { firstname : 'Bay', lastname: 'Ivan', age: 81},
    { firstname : 'Baba', lastname: 'Ginka', age: 40}];
findYoungestPerson(persons);
