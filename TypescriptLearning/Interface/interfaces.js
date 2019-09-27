function greeter(person) {
    return "hello, " + person.firstName + " " + person.lastName;
}
var namess = { firstName: "Prabhat", lastName: "Dwivedi" };
document.body.textContent = greeter(namess);
