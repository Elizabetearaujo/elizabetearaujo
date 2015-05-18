
package projeto_git;


public class pilha implements interfacepilhaencadeada {
 
private int topo = -1;  
private int total;
private no pilha[];


    @Override
    public void criarpilha(int tamanho) {
        this.pilha = new no [tamanho];
        this.total = tamanho; 
    }

    @Override
    public boolean evazia() {
        return topo < 0;
    }
    @Override
    public boolean echeia() {
        return (this.topo + 1 == total);
    }

    @Override
    public int tamanho() {
        return topo + 1;
    }

    @Override
    public void limpar() {
    }
   
    @Override
    public no push(int valor) {
      no elemento = new no (valor);
      if (!echeia()){
      this.pilha [++topo] = elemento;  
          System.out.println("Valor" +valor+ " Add ");
      return elemento;
      }
    return null;
}
    @Override
    public no pop() {
        no x = pilha[topo];
        pilha [topo] = null;
               
        return x;
    }

    @Override
    public int pegarTopo() {
        return pilha [topo].getvalor();
    }

    @Override
    public void listar() {
        for(int i = topo; i == 0; i--){
            System.out.println(pilha [i].getvalor());
        }}}
    

