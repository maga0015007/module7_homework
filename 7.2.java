function func1 (a, b){ 
    console.log(a in b);
  }
  const avto = {
      a: "red",
      b: "black"
  } 
  func1("a", avto)