const Gerar = document.querySelector('.Gerar')
const ListarSenhas = document.querySelector('#ListarSenhas')
const Senha = document.querySelector('.Senha')

Gerar.addEventListener('click', gerarSenhaAletoria)

function gerarSenhaAletoria() {
    var senhaAleatoria = ''
    var caracteres = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    
    for (var i = 0; i < 20; i++) {
        senhaAleatoria += caracteres.charAt(Math.floor(Math.random() * caracteres.length));
    }
    
    Senha.textContent = senhaAleatoria
}

