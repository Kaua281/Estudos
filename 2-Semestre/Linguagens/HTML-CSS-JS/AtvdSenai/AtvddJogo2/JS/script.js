const Mario = document.querySelector('.Mario');
const Pipe = document.querySelector('.Pipe');

const Jump = () => {
    Mario.classList.add('Jump');
    setTimeout(() => {
        Mario.classList.remove('Jump');
    }, 500)
}

const loop = setInterval(()=>{
    const pipePosition = Pipe.offsetLeft;
    const marioPosition = +window.getComputedStyle(Mario).bottom.replace('px', '');

    if (pipePosition <= 120 && pipePosition >0 && marioPosition < 80){
        Pipe.style.animation = 'none';
        Pipe.style.left = `${pipePosition}px`;

        Mario.style.animation = 'none';
        Mario.style.bottom = `${marioPosition}px`;

        Mario.src = './images/game-over.png';
        Mario.style.width = '75px'
        Mario.style.marginLeft = '50px'

        clearInterval(loop);
    }
},10)

document.addEventListener('keydown', Jump);