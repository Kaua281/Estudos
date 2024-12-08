//DOM
const horas = document.querySelector('#horas')
const minutos = document.querySelector('#minutos')
const segundos = document.querySelector('#segundos')
const data = document.querySelector('#data-atual')

//EVENTOS
setInterval(relogio, 1000)

//FUNÇÕES

function relogio(){
    let hoje = new Date()
    let data = hoje.getDate()
    let hr = hoje.getHours()
    let min = hoje.getMinutes()
    let sec = hoje.getSeconds()

    if (hr<10)
        hr = "0" + hr;
	if (min < 10)
		min = "0" + min;
	if (sec < 10)
		sec = "0" + sec;

    horas.textContent = hr
    minutos.textContent = min
    segundos.textContent = sec
    data-atual.textContent = data

}

