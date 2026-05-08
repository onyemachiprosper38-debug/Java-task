const object = {
    name: "Segun",
    hobby: "football",
    age: 6
}

for(let index in object){
    console.log(object[index]);}
console.log(Object.entries(object))

console.log(object.name)
let item = Object.keys(object)
console.log(item);
let input = Object.entries(object)
console.log(input);

let count = 1;

while(count <= 10){ 
console.log(count);
count++;

}
//for of loop
//for(let number of array){
//console.log(number);
//}

//normal for loop
//for (let index = 1; index <= 10; index++){
//console.log(index)};
