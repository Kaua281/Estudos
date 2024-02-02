// Equipe: Kauã Oliveira Seixas; Marcus Vinicius; Pedro Rocha

function calcularIMC() {
            const peso = parseFloat(document.querySelector('#peso').value);
            const altura = parseFloat(document.querySelector('#altura').value);

            if (isNaN(peso) || isNaN(altura) || peso <= 0 || altura <= 0) {
                window.alert("Por favor, preencha os campos corretamente.");
                return;
            }

            const imc = peso / (altura * altura);
            const classificacao = IMCClassificacao(imc);

            document.getElementById("imcResultado").textContent = imc.toFixed(2);
            document.getElementById("imcClassificacao").textContent = classificacao;
        }

        function IMCClassificacao(imc) {
            if (imc < 18.5) {
                return "Abaixo do peso";
            } else if (imc < 24.9) {
                return "Peso saudável";
            } else if (imc < 29.9) {
                return "Sobrepeso";
            } else if (imc < 34.9) {
                return "Obesidade grau I";
            } else if (imc < 39.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III";
            }
        }
