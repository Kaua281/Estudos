//dom(componentes:kauã Oliveira seixas, Marcus vinicius Santos, Pedro Rocha)

const butf =document.querySelector('#butf')
const butit =document.querySelector('#butit')
const butana =document.querySelector('#butana')
const butra =document.querySelector('#butra')

//EVENTOS
butf.addEventListener('click',freira)
butit.addEventListener('click',it)
butana.addEventListener('click',anabele)
butra.addEventListener('click',rambo)

//FUNÇÕES
function freira(){
    imagem.src="images/freira.png"
    p1.textContent="Fazendo parte da franquia Invocação do Mal, em A Freira, após uma irmã cometer suicídio em um convento na Romênia, o Vaticano envia um padre atormentado e uma noviça para investigar o ocorrido. Arriscando suas vidas, a fé e até suas almas, os dois descobrem um segredo profano no local, confrontando-se com uma força do mal que toma a forma de uma freira demoníaca e transforma o convento num campo de batalha espiritual."
    
}  
function it(){
    imagem.src="images/it.png"
    p1.textContent="Um grupo de crianças se une para investigar o misterioso desaparecimento de vários jovens em sua cidade. Eles descobrem que o culpado é Pennywise, um palhaço cruel que se alimenta de seus medos e cuja violência teve origem há vários séculos."
    
}
function anabele(){
    imagem.src="images/annabelle_t84435.jpg"
    p1.textContent="John Form acha que encontrou o presente ideal para sua esposa grávida, uma boneca vintage. No entanto, a alegria do casal não dura muito. Uma noite terrível, membros de uma seita satânica invadem a casa do casal em um ataque violento. Ao tentarem invocar um demônio, eles mancham a boneca de sangue, tornando-a receptora de uma entidade do mal."
}
function rambo(){
    imagem.src="images/rambo.png"
    p1.textContent="O tempo passou para Rambo, que agora vive recluso em um rancho. Sua vida marcada por lutas violentas ficou para trás, mas deixou marcas inesquecíveis. No entanto, quando uma jovem de uma família amiga é sequestrada, Rambo precisa confrontar seu passado e resgatar suas habilidades de combate para enfrentar o mais perigoso cartel mexicano. A busca logo se transforma em uma caçada por justiça, na qual nenhum criminoso é perdoado."
}
