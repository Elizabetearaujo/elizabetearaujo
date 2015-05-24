
package projeto_git;


public class pilha implements interfacepilhaencadeada {
 
private int tamanho = 0;  
private no topo;
tamanho ++;

@Override
    public void criarpilha() {
        topo = new no (-1, null);
        //this.total = tamanho; 
    }
    @Override
    public int tamanho() {
        return tamanho==0;
    }
    @Override
    public boolean evazia() {
        return tamanho ==0;
    }
    @Override
    public void limpar() {
    topo.setproximo (null);
    }
    @Override
    public no push(int valor) {
      no novo = new no (valor, null);
      novo.setproximo(topo.getproximo());
      topo.setproximo(novo);
      return novo;
    }
    @Override
    public no pop() {
    if (!evazia()){
    System.out.println("Nao possui valor");
         return null;
    }         
    else{
        
    no aux = topo .getproximo();
    topo.setproximo(topo.getproximo().getproximo());
    return aux;
    }
    @Override
    public int pegarTopo() {
        return topo.getproximo().getvalor();
    }
    @Override
    public void listar() {
        if(evazia())
            System.out.println("vazia"
                    else{
            no aux= topo.getproximo();
        }
            while (aux !=null){
                System.out.println(aux.getvalor());
                aux = aux.getproximo();
            }
            }}}
    

