# Desenvolvimento Caixa Eletr�nico

Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletr�nico. Os requisitos b�sicos s�o os seguintes:

Entregar o menor n�mero de notas;
� poss�vel sacar o valor solicitado com as notas dispon�veis;
Saldo do cliente infinito;
Quantidade de notas infinito (pode-se colocar um valor finito de c�dulas para aumentar a dificuldade do problema);
Notas dispon�veis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00

Exemplos:
Valor do Saque: R$ 30,00 � Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.
Valor do Saque: R$ 80,00 � Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.

## Stack:
Java,Junit

#### Especifica��es:
-core.controler
 Calculadora - Respons�vel por fazer o calculo referente ao saque, onde recebe um par�metro de entrada enviado na tela pelo  				usu�rio "long value", onde no primeiro momento, verifica se o valor � divisivel por 2 e 
 				tem resto! passando nessa primeira verifica��o,continua al�gica,quanto l�gica de entrega das notas.. 
 				
-core.view
  Main       - Classe main, respons�vel por fazer a intera��o com o usu�rio, utilizando pardr�es de O.O, estou usando para ter 				acesso a classe respons�vel pelo c�lculo, passando o par�metro que recebo do usu�rio, 
                como � proposto ser   simples no teste, estou usando o "Scanner" para receber os valores..  
                
-core.model
 Nota        - Achei necess�rio fazer a classe modelo, para separar a respons�bilidade de cada pacote, e assim seguindo o 				padr�o "MVC"         
 
 -core.test
 .CaixaEletronicoTest - Classe respons�vel pelos testes, o teste v�lido sendo executado � onde verifica se o valor, par�metro de 						entrada � um valor,caracter,string!Sendo um valor, da ok! sendo diferente da erro!
 
#### Execu��o: 
Necess�rio baixar o pacote no git, importar onde for de sua prefer�ncia, executar a classe main em
  "/teste/src/core/view" e digitar um valor no console que ir� ser exibido!
 
 
                     