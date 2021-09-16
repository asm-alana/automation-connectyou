#language: pt
#UTF: 8

@perfil @regressivo
Funcionalidade: Perfil
@validarDadosPerfil
	Esquema do Cenario: Validar dados na pagina de Perfil
		Dado que estou logado no site Connect You
		Quando seleciono o menu Perfil
		Entao valido os dados nome <nome>, empresa <empresa>, e-mail corporativo <emailCorporativo> na tela

Exemplos:
	| nome 												| empresa 			| emailCorporativo 						|
	| "ALANA DOS SANTOS MENDES" 	| "Yaman" 			| "alana.mendes@yaman.com.br"	|
