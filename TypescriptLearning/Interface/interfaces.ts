interface Person{
firstName:string;
lastName:string;
}

function greeter(person:Person){
return "hello, "+person.firstName+" "+person.lastName;
}


let namess={firstName:"Prabhat",lastName:"Dwivedi"};

document.body.textContent=greeter(namess);
