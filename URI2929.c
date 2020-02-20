#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define true 1
#define false 0

typedef struct tipoNo{

	long long valor;
	struct tipoNo *proximo;

} tipoNo;

typedef struct tipoPilha{

	tipoNo *topo;

} tipoPilha;


void pop(tipoPilha *pilha);
void criaPilha(tipoPilha *pilha);
long long menorValor(tipoPilha *pilha);
void push(tipoPilha *pilha, long long valor);

void main ()
{

	tipoPilha pilha;
	char operacao[10];
	unsigned numOperacoes;
	long long valor, tmp;

	scanf("%u", &numOperacoes);

	criaPilha(&pilha);

	while (numOperacoes--)
	{

		scanf("%s", operacao);

		if (strcmp(operacao, "PUSH") == 0)
		{

			scanf("%lld", &valor);
			push(&pilha, valor);

		}
		else if (strcmp(operacao, "POP") == 0)
			pop(&pilha);
		else
		{

			tmp = menorValor(&pilha);
			if (tmp == -1)
				printf("EMPTY\n");
			else
				printf("%lld\n", tmp);
		}
	}
}

void criaPilha(tipoPilha *pilha)
{

	pilha->topo = NULL;

}

void push(tipoPilha *pilha, long long valor)
{

	tipoNo *auxiliar;

	auxiliar = (tipoNo *) malloc(sizeof(tipoNo));

	if (!auxiliar)
		exit(1);

	auxiliar->proximo = pilha->topo;
	pilha->topo = auxiliar;
	auxiliar->valor = valor;

}

void pop(tipoPilha *pilha)
{

	tipoNo *auxiliar;
	auxiliar = pilha->topo;

	if (auxiliar) {
		pilha->topo = auxiliar->proximo;
		free(auxiliar);

	} else
		printf("EMPTY\n");
}

long long menorValor(tipoPilha *pilha)
{
	tipoNo *auxiliar;
	auxiliar = pilha->topo;

	if (!auxiliar)
		return -1;

	long long menor = auxiliar->valor;

	while (auxiliar)
	{

		if (auxiliar->valor < menor)
			menor = auxiliar->valor;

		auxiliar = auxiliar->proximo;

	}
	return menor;
}