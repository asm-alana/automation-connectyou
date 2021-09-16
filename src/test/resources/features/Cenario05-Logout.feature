#language: pt
#UTF: 8

@logout @regressivo
Funcionalidade: Logout
@sairDoSistema
Cenario: Realizar logout no sistema
	Dado que estou logado no site Connect You
	Quando clico em Sair no menu Navegacao do usuario
	Entao sou redirecionado para a tela de login
