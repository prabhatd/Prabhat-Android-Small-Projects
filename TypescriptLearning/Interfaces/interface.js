function greeter(person) {
    return "Hello, " + person.firstName + " " + person.lastName;
}
var names = { firstName: "Prabhat", lastName: "Dwivedi" };
document.body.textContent = greeter(names);
