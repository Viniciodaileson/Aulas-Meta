const prompt = require("prompt-sync")();
function contagemRegressiva(){
    let numero = Number(prompt("Digite um número para iniciar a contagem regressiva: "));
    while (numero >= 0) {
        console.log(numero);
        numero--;
    }
}
contagemRegressiva();