

function squareDigits(num){
  
    let numString = num.toString();
    let resultado = '';
  
    for (let i = 0; i < numString.length; i++) {
      let digito = parseInt(numString.charAt(i));
      let square = digito ** 2;
      resultado += square.toString();
    }
  
    return parseInt(resultado);
    console.log(squareDigits(123));
  }