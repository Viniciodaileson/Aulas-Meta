const promt = require('prompt-sync')();
 function inverterLista(){
    let lista = [];
    let tamanho = parseInt(promt("Digite o tamanho da lista: "));
    for(let i = 0; i < tamanho; i++){
        let elemento = promt(`Digite o elemento ${i + 1}: `);
        lista.push(elemento);
    } 
   let listaInvertida = [];
   for(let i = lista.length - 1; i >= 0; i--){
       listaInvertida.push(lista[i]);
   }
   console.log("Lista original: ", lista);
   console.log("Lista invertida: ", listaInvertida);
}   