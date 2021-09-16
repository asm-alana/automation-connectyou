#language: pt
#UTF: 8

@aprendizagem @regressivo
Funcionalidade: Aprendizagem

Contexto:
	Dado que estou logado no site Connect You
	Quando seleciono a funcionalidade Aprendizagem

@buscaComSucesso
Esquema do Cenario: Busca por curso no menu Aprendizagem com sucesso
	E busco por <cursoBusca> no campo Procurar Aprendizagem
	Entao visualizarei o resultado <resultCursoBusca> na tela
	
Exemplos:
| cursoBusca	|	resultCursoBusca 																		|
| "Automação"	| "Automação de Testes com Selenium WebDriver em Java" |

@buscaSemSucesso
Esquema do Cenario: Busca por curso no menu Aprendizagem sem sucesso
	E busco por <cursoBusca> no campo Procurar Aprendizagem
	Entao visualizarei a mensagem <msgErro> na tela 

Exemplos:
| cursoBusca | msgErro 																																																													|
| "psspss"	| "Não há resultados de pesquisa com a palavra-chave ou os critérios de pesquisa. Remove seus critérios e tente uma nova pesquisa."	|


