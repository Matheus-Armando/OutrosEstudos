//pega cada digito de num e faz a sua potencia depois faz o append para voltar a ser um digito so
function squareDigits(num) {
  let numString = num.toString();
  let resultado = "";

  for (let i = 0; i < numString.length; i++) {
    let digito = parseInt(numString.charAt(i));
    let square = digito ** 2;
    resultado += square.toString();
  }
  
  return parseInt(resultado);
}

//console.log(squareDigits(123));

var isSquare = function(n) {
  let raiz = Math.sqrt(n);
  let final;
  if (Number.isInteger(raiz)) {
    final = true;
  } else {
    final = false;
  }
  return final;
}

//console.log(isSquare(4));

function tribonacci(signature, n) {
  if (n <= 0) {
    return [];
  } else if (n <= 3) {
    return signature.slice(0, n);
  }

  for (let i = 2; i < n -1 ; i++) {
    let soma = signature[i] + signature[i - 1] + signature[i - 2];
    signature.push(soma); /* push serve para adicionar o numero da soma na array*/
  }

  return signature;
}

//console.log(tribonacci([0, 1, 1], 10));


function persistence(num) {
  if (num < 10) {
    return 0; 
  }
  
  let count = 0;
  
  while (num >= 10) {
    let digits = num.toString().split('').map(Number); /*aqui ele converte para string com a função toString() e usa slipt('') para dividir a string em um
    array de caracteres individuais e então utiliza o map que é uma função usada para uma função a cada elemento do array aplicando a função Number que 
    converte cada caractere em seu equivalente numerico */
    num = digits.reduce((a, b) => a * b); /*função reduce serve para reduzir um array a um único valor, basicamente ele faz a soma dos valores do array,
     onde (a,b) é a função de redução (callback Uma função que é executada em cada elemento do array. Essa função recebe dois argumentos: um acumulador 
     (também chamado de valor anterior ou parcial) e o elemento atual sendo processado.) e a função é passada em seguida (a * b), ela é opcional caso não
     passe ele vai somar por padrão(eu acho) */
    count++;
  }
  
  return count;
}

//console.log(persistence(39));
//console.log(persistence(999)); 
  
