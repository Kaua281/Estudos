import openpyxl;
from docxtpl import DocxTemplate;
import datetime

arquivo = "Pasta1.xlsx"
abrirArquivo = openpyxl.load_workbook(arquivo)
planilha = abrirArquivo.active

valores = list(planilha.values)
print(valores)

doc = DocxTemplate('Convite para festa.docx')

for x in valores [1:]:
    doc.render({
        'Nome':x[0],
        'Matricula':x[1],
        'DataDeInscricao':x[2]
    })
    certificado = f'Convite de {x[0]}.docx'
    doc.save(certificado)