const prompt = require('prompt-sync')();
let arr = [];
// função para contar os números positivos, negativos e neutros;
function contarNumeros(arr) {
    let numerosPositivos = 0;
    let numerosNegativos = 0;
    let numerosNeutros = 0;
    for (let i = 0; i < 10; i++) {
        let num = parseInt(prompt(`Entre com o ${i + 1}º número: `));
        arr.push(num);
    }
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            numerosPositivos++;
        } else if (arr[i] < 0) {
            numerosNegativos++;
        } else {
            numerosNeutros++;
        }
    }
    return{
        numerosPositivos,
        numerosNegativos,
        numerosNeutros
    };
}
let resultado = contarNumeros(arr);
console.log("Numeros positivos: " + resultado.numerosPositivos);
console.log(`Numeros negativos: ${resultado.numerosNegativos}`);
console.log(`Números Neutros: ${resultado.numerosNeutros}`);
