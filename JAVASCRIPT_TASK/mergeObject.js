const objectOne = {
  name: "prosper",
  age: 25
};

const objectTwo= {
  role: "Developer",
  company: "Semicolon"
};

const mergedObject = {
  ...objectOne,
  ...objectTwo,
};

console.log(mergedObject);
