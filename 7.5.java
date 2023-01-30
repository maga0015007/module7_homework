class Included {
    constructor(name) {
     this.material = 'Метал';
     this.name = name;
    }
    getLaptop(on, power){
      if (on === 'вкл'){
      return(`Потребляемая мошность ${power} Вт`)
    } else {
      return(`Потребляемая мошность 0 Вт`)
    }  
   }    
    getPhone(on, power){
     if (on === 'вкл'){
      return(`Потребляемая мошность ${power} Вт`)
    } else {
      return(`Потребляемая мошность 0 Вт`) 
    }
   } 
  }
  const laptop = new Included('msi');
  const phone = new Included('samsung');
  console.log(laptop.getLaptop('вкл', 150))
  console.log(phone.getPhone('вкл', 10))