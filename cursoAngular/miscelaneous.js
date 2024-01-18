let dobro = function (a) {
    return 2 * a
}

// Arrow function

dobro = (a) => {
    return 2 * a
}

dobro = a => 2 * a // return implicito

console.log(dobro(Math.PI))

let ola = function () {
    return 'Olá'
}

ola = () => 'Olá' // Arrow function sem parametro
ola = _ => 'Olá' // Arrow function com parametro
//------------------------------------------------------------------------------------------------------------------------

const fabricantes = ["Mercedes", "Audi", "BMW"]

function imprimir(nome, indice) {
    console.log(`${indice + 1}. ${nome}`)
}

fabricantes.forEach(imprimir) // forEach é uma função de callback
fabricantes.forEach(fabricante => console.log(fabricante))

// Callback é passar uma função e quando um evento acontecer essa função será chamada de volta
const notas = [7.7, 6.5, 5.2, 8.9, 3.6, 7.1, 9.0]

// Sem callback
let notasBaixas = []
for (let i in notas) {
    if (notas[i] < 7) {
        notasBaixas.push(notas[i])
    }
}

console.log(notasBaixas)

// Com callback
notasBaixas1 = notas.filter(function (nota) {
    return nota < 7
})
console.log(notasBaixas1)
// filter é uma função que filtra os elementos de um array de acordo com uma condição
notasBaixas2 = notas.filter(nota => nota < 7)
console.log(notasBaixas2)

