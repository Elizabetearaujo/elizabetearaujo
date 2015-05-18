
package projeto_git;


public interface interfacepilhaencadeada {
    void criarpilha(int tamanho);//cria pilha  
    boolean evazia();//verifica se a pilha possui elementos 
    boolean echeia();//verifica se a pilha possui elementos     
    int tamanho();//retorna o número de itens da pilha  
    void limpar();//esvaziar pilha
    no push(int valor);//insere um valor no topo da pilha   
    no pop();//retira o valor no topo da pilha 
    int pegarTopo();//retorna o valor atual do topo da pilha 
    void listar();//retorna os elementos da pilha    

   
}
