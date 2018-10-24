Esses dois códigos realmente me deixam orgulhoso :)

Para imprimir as cartas do baralho, fiz duas arrays, uma para os números e o outro para as figuras.
String nos números não é pura vaidade, eu não teria como encaixar um "ás" num int.. Sem contar que "2 de ás" não tem sentido algum.

Dois fors foram utilizados, um para contar os 10 números e o outro para as 4 figuras.
Então foi só printar os valores das arrays através do for, utilizando os índices como parâmetro da posição nos vetores!

Não me custou tanto para chegar nessa conclusão e nem no código, meu bom tempo foi no algoritmo dos números primos...

Eu tive de ir atrás de muitas soluções, umas incrivelmente inteligentes como o método de Erastóteles de ir eliminando múltiplos, mas como implementar isso em Java em poucas linhas? Eu poderia entrar manualmente com cada número primo com o tempo que gastaria com arrays multiplosDeDois, multiplosDeTres...

Uma das coisas que tentei foi dividir os números pelo último primo encontrado (começando com 2), e já logo percebi que de acordo com esse algoritmo 4 seria um primo, já que 4/3 retornaria resto diferente de 0.

Também procurei como estavam resolvendo isso em Java, achei métodos esquisitos que ainda não compreendi a lógica.

Retomando ao que define um número primo: Só possui dois divisores, 1 e si próprio. Talvez seja por isso que esses métodos usavam um tal contador que parava quando chegava em dois.
Essa condição não serve pra averiguar nada, porque todos os números de 1 a 100 são primos (eu mesmo tive de verificar isso).

Seu quosciente também deve ser um número menor que o divisor. (outra condição estúpida, eu ainda não encontrei algo que ao se dividir se obtem mais um).

Então eu pensei em extrair o máximo dessas regras em código e ver se conseguia chegar em algum lugar.

Eu já havia tentado verificar se os números eram divisíveis e determinar se era um número primo através desses resultados (as vezes eu realmente preciso de resultados).
A solução talvez era ser mais específico. Se for divisível pode ser que não seja um número primo, mas logo de cara o programa tentaria dividir dois por dois, conseguiria, é um número primo. três por três, quatro por quatro... Voltamos a estaca zero de os números todos serem primos.
Então além de ser divisível, o código verifica se o número é diferente de si próprio, se não é 1.

Para estruturar melhor o código (e meus pensamentos que a esse ponto já não me ajudavam mais) criei um método que recebe um número e retorna um boolean, e através de uma simples chamada, o resultado de várias condições é mostrado.
Basta repetir isso cem vezes e os números primos, e só eles, são exibidos.