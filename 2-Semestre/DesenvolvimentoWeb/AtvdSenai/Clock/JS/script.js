const BtClaro = document.querySelector('#claro')
const BtEscuro = document.querySelector('#escuro')
const fundo = document.querySelector('body')

BtClaro.addEventListener('click', claro)
BtEscuro.addEventListener('click', escuro)

function claro(){
    //?   classList.add()
    //?   classList.remove()
    fundo.classList.add('claro')
    fundo.classList.remove('escuro')
}

function escuro(){
    fundo.classList.add('escuro')
    fundo.classList.remove('claro')
}