const Fundo = document.querySelector('body')
const btDarius = document.querySelector('#Darius')
const btRiven = document.querySelector('#Riven')
const btMordekaiser = document.querySelector('#Mordekaiser')
const btLeeSin = document.querySelector('#LeeSin')
const btUdyr = document.querySelector('#Udyr')

btDarius.onmouseover = function () {
    Fundo.style.background = 'linear-gradient(150deg, rgb(39,36,35), rgb(73, 71, 70), rgb(139, 148, 149))' 
}

btRiven.onmouseover = function(){
    Fundo.style.background = 'linear-gradient(150deg, rgb(199, 41, 70), rgb(100, 67, 84), rgb(251, 235, 236))'
}

btMordekaiser.onmouseover = function() {
    Fundo.style.background = 'linear-gradient(150deg, rgb(96, 122, 159), rgb(161, 185, 219), white )'
}

btLeeSin.onmouseover = function() {
    Fundo.style.background = 'linear-gradient(150deg, rgb(81, 127, 210  ), rgb(66, 253, 254), white)'
}

btUdyr.onmouseover = function() {
    Fundo.style.background = 'linear-gradient(150deg, rgb(155, 81, 42), rgb(217, 98, 13), white)'
}

onmouseout = function() {
    Fundo.style.background = 'linear-gradient(150deg, white, gray,white)'
}