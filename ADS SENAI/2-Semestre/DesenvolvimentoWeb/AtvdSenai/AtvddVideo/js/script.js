const Video = document.querySelector('video');
const btPlay = document.querySelector('#Play');
const btPause = document.querySelector('#Pause');
const btStop = document.querySelector('#Stop');
const btAcelerar = document.querySelector('#Acelerar');
const btDesacelerar = document.querySelector('#Desacelerar');

btPlay.addEventListener('click', () => {
    Video.play()
    Video.playbackRate = 1
})
btPause.addEventListener('click', () => {
    Video.pause()
})
btStop.addEventListener('click', () => {
    Video.pause()
    Video.currentTime = 0
})
btAcelerar.addEventListener('click', () => {
    Video.playbackRate += 0.5
})

btDesacelerar.addEventListener('click', () => {
    Video.playbackRate -= 0.5
})

Video.addEventListener('click', () => {
    Video.requestFullscreen()
})