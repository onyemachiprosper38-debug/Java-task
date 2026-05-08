const student = {
    Name: "Amaka",
    Score: "75",
}

if (student.Score >= 90){
console.log(student.Name + " Score" + " is" + " A")
}
else if(student.Score > 80 && student.Score <= 89){
console.log(student.Name + " Score" + " is" + " B")
}
else if (student.Score > 70 && student.Score <= 79){
console.log(student.Name + " Score" + " is" + " C")
}
else {
console.log(student.Name + " Score" + " is" + " F")
}
