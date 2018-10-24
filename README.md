Esses dois c�digos realmente me deixam orgulhoso :)

Para imprimir as cartas do baralho, fiz duas arrays, uma para os n�meros e o outro para as figuras.
String nos n�meros n�o � pura vaidade, eu n�o teria como encaixar um "�s" num int.. Sem contar que "2 de �s" n�o tem sentido algum.

Dois fors foram utilizados, um para contar os 10 n�meros e o outro para as 4 figuras.
Ent�o foi s� printar os valores das arrays atrav�s do for, utilizando os �ndices como par�metro da posi��o nos vetores!

N�o me custou tanto para chegar nessa conclus�o e nem no c�digo, meu bom tempo foi no algoritmo dos n�meros primos...

Eu tive de ir atr�s de muitas solu��es, umas incrivelmente inteligentes como o m�todo de Erast�teles de ir eliminando m�ltiplos, mas como implementar isso em Java em poucas linhas? Eu poderia entrar manualmente com cada n�mero primo com o tempo que gastaria com arrays multiplosDeDois, multiplosDeTres...

Uma das coisas que tentei foi dividir os n�meros pelo �ltimo primo encontrado (come�ando com 2), e j� logo percebi que de acordo com esse algoritmo 4 seria um primo, j� que 4/3 retornaria resto diferente de 0.

Tamb�m procurei como estavam resolvendo isso em Java, achei m�todos esquisitos que ainda n�o compreendi a l�gica.

Retomando ao que define um n�mero primo: S� possui dois divisores, 1 e si pr�prio. Talvez seja por isso que esses m�todos usavam um tal contador que parava quando chegava em dois.
Essa condi��o n�o serve pra averiguar nada, porque todos os n�meros de 1 a 100 s�o primos (eu mesmo tive de verificar isso).

Seu quosciente tamb�m deve ser um n�mero menor que o divisor. (outra condi��o est�pida, eu ainda n�o encontrei algo que ao se dividir se obtem mais um).

Ent�o eu pensei em extrair o m�ximo dessas regras em c�digo e ver se conseguia chegar em algum lugar.

Eu j� havia tentado verificar se os n�meros eram divis�veis e determinar se era um n�mero primo atrav�s desses resultados (as vezes eu realmente preciso de resultados).
A solu��o talvez era ser mais espec�fico. Se for divis�vel pode ser que n�o seja um n�mero primo, mas logo de cara o programa tentaria dividir dois por dois, conseguiria, � um n�mero primo. tr�s por tr�s, quatro por quatro... Voltamos a estaca zero de os n�meros todos serem primos.
Ent�o al�m de ser divis�vel, o c�digo verifica se o n�mero � diferente de si pr�prio, se n�o � 1.

Para estruturar melhor o c�digo (e meus pensamentos que a esse ponto j� n�o me ajudavam mais) criei um m�todo que recebe um n�mero e retorna um boolean, e atrav�s de uma simples chamada, o resultado de v�rias condi��es � mostrado.
Basta repetir isso cem vezes e os n�meros primos, e s� eles, s�o exibidos.