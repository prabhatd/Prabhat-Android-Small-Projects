interface Person{
firstName :string;
lastName :string;
}

function greeter(person:Person){
return "Hello, "+person.firstName+" "+person.lastName; 
} 

let names={firstName:"Prabhat",lastName:"Dwivedi"};

document.body.textContent=greeter(names);

