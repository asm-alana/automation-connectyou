#language: pt
#UTF: 8

@login @regressivo
Funcionalidade: Login Connect You

  @loginComSucesso
 Esquema do Cenario: Login no site do Connect You realizado com sucesso
    Dado que estou no site Connect You
    Quando informo o Id "yamantecno" da empresa Yaman
    E preencho o campo Usuario com <usuario>
    E preencho o campo Senha com <senha>
    Entao visualizarei o menu Inicio na tela

    Exemplos: 
      | usuario   | senha   |
      | "usuario" | "senha" |
