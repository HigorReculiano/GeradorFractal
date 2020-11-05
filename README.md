# GeradorFractal
N1 de Compiladores 

Programa para criar linhas 2D com gramaticas tipo LSystems para fractais

Programa executável na IDE NetBeans 8.2

Versão de java: 1.8.0_241

Deve-se editar o arquivo Input.txt presente na pasta do projeto para alterar as regras.

Exemplo de regra no texto para se alterar:

Numerode interações/angulação do desenho ==>   interacoes=4,angulo=250
String inicial do programa(Favor utilizar APENAS F por favor) ==>  StringInicial=F
Geração inicial ==>  F+F
Regra de produção 1 ==>  F=F+f-FF+F+FF+FF+ff
Regra de produção n ==>  f=ffffffff
