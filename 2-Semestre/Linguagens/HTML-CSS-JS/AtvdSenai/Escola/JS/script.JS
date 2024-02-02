const uni1 = document.querySelector('#uni1')
const uni2 = document.querySelector('#uni2')
const uni3 = document.querySelector('#uni3')
const bt = document.querySelector('button')
const resultado = document.querySelector('#resultado')

bt.addEventListener('click', media)

function media(){
    let nota = (Number(uni1.value)+Number(uni2.value)+Number(uni3.value))/3

    if (nota>=5) {
        resultado.textContent = 'Resultado: '+nota.toFixed(1)+" - Aprovado"   
    } else {
        resultado.textContent = 'Resultado: '+nota.toFixed(1)+" - Reprovado"
    }
}

