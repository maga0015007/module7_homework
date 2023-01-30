function Included(name) { 
    this.material = 'Метал',
    this.name = name
  }
  Included.prototype.getLaptop = function(on, power){
    if (on === 'вкл'){
      return(`Потребляемая мошность ${power} Вт`)
    } else {
      return(`Потребляемая мошность 0 Вт`)
    }
  }
  Included.prototype.getPhone = function(on, power){
    if (on === 'вкл'){
      return(`Потребляемая мошность ${power} Вт`)
    } else {
      return(`Потребляемая мошность 0 Вт`)
    }
  }
  const laptop = new Included('msi');
  const phone = new Included('samsung');
  console.log(laptop.getLaptop('вкл', 150))
  console.log(phone.getPhone('вкл', 10))