const Fundo = document.querySelector('body');
const btClaro = document.querySelector('#Claro');
const btEscuro = document.querySelector('#Escuro');

btClaro.addEventListener('click', () => {
    Fundo.className = 'Light'
    /*Fundo.classList.add('Light')
    Fundo.classList.remove('Dark')*/
})

btEscuro.addEventListener('click', () => {
    Fundo.className = 'Dark'
    /*Fundo.classList.add('Dark')
    Fundo.classList.remove('Light')*/
})

