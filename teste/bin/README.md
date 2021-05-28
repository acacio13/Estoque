# Desenvolvimento Caixa Eletrônico

Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletrônico. Os requisitos básicos são os seguintes:

Entregar o menor número de notas;
É possível sacar o valor solicitado com as notas disponíveis;
Saldo do cliente infinito;
Quantidade de notas infinito (pode-se colocar um valor finito de cédulas para aumentar a dificuldade do problema);
Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00

Exemplos:
Valor do Saque: R$ 30,00 – Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.
Valor do Saque: R$ 80,00 – Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.

## Stack:
Java,Junit

#### Especificações:
-core.controler
 Calculadora - Responsável por fazer o calculo referente ao saque, onde recebe um parâmetro de entrada enviado na tela pelo  				usuário "long value", onde no primeiro momento, verifica se o valor é divisivel por 2 e 
 				tem resto! passando nessa primeira verificação,continua alógica,quanto lógica de entrega das notas.. 
 				
-core.view
  Main       - Classe main, responsável por fazer a interação com o usuário, utilizando pardrões de O.O, estou usando para ter 				acesso a classe responsável pelo cálculo, passando o parâmetro que recebo do usuário, 
                como é proposto ser   simples no teste, estou usando o "Scanner" para receber os valores..  
                
-core.model
 Nota        - Achei necessário fazer a classe modelo, para separar a responsábilidade de cada pacote, e assim seguindo o 				padrão "MVC"         
 
 -core.test
 .CaixaEletronicoTest - Classe responsável pelos testes, o teste válido sendo executado é onde verifica se o valor, parâmetro de 						entrada é um valor,caracter,string!Sendo um valor, da ok! sendo diferente da erro!
 
#### Execução: 
Necessário baixar o pacote no git, importar onde for de sua preferência, executar a classe main em
  "/teste/src/core/view" e digitar um valor no console que irá ser exibido!
 
 
                     