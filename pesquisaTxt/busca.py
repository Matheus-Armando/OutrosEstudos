"""
import os

# Diretório onde os documentos RTM estão localizados
diretorio = r'D:\\Repositories\\OutrosEstudos\\pesquisaTxt\\relatoriobk'

# Palavra-chave que você deseja procurar
palavra_chave = '18/12/2014'

# Lista para armazenar os nomes dos documentos que contêm a palavra-chave no conteúdo
documentos_com_palavra_chave = []

# Percorre todos os arquivos no diretório
for nome_arquivo in os.listdir(diretorio):
    if nome_arquivo.endswith('.rtm'):
        caminho_arquivo = os.path.join(diretorio, nome_arquivo)
        
        # Abre o arquivo e verifica se a palavra-chave está presente no conteúdo
        with open(caminho_arquivo, 'r', encoding='ISO-8859-1') as arquivo:
            conteudo = arquivo.read()
            if palavra_chave in conteudo:
                documentos_com_palavra_chave.append(nome_arquivo)

# Exibe os nomes dos documentos que contêm a palavra-chave no conteúdo
print("Documentos com a palavra-chave no conteúdo:")
for nome_documento in documentos_com_palavra_chave:
    print(nome_documento) 
"""

import os

diretorio = input("Digite o diretório onde os documentos estão localizados: ")

palavra_chave = input("Digite a palavra-chave que deseja procurar: ")

encoding = input("Digite o encoding a ser usado (ex: utf-8, ISO-8859-1): ")

extensao = input("Digite a extensão dos arquivos a serem buscados (ex: .rtm): ")

# Lista para armazenar os nomes dos documentos que contêm a palavra-chave no conteúdo
documentos_com_palavra_chave = []

# Percorre todos os arquivos no diretório
for nome_arquivo in os.listdir(diretorio):
    if nome_arquivo.endswith(extensao):
        caminho_arquivo = os.path.join(diretorio, nome_arquivo)
        
        # Abre o arquivo e verifica se a palavra-chave está presente no conteúdo
        with open(caminho_arquivo, 'r', encoding=encoding) as arquivo:
            conteudo = arquivo.read()
            if palavra_chave in conteudo:
                documentos_com_palavra_chave.append(nome_arquivo)

# Exibe os nomes dos documentos que contêm a palavra-chave no conteúdo
print("Documentos com a palavra-chave no conteúdo:")
for nome_documento in documentos_com_palavra_chave:
    print(nome_documento)

